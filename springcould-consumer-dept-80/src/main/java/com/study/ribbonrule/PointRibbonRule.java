package com.study.ribbonrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import java.util.List;

/**
 * @Description 自定义负载均衡算法，轮询当前服务五次后调下一个服务
 * @Author jzhao
 * @Date 2020-6-18 22:57
 **/
public class PointRibbonRule extends AbstractLoadBalancerRule {

    /**
     * 服务调用的次数
     */
    private int total = 0;

    /**
     * 当前是谁在提供服务
     */
    private int currentIndex = 0;


    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }
                //获取可活着的服务
                List<Server> upList = lb.getReachableServers();
                //获取全部服务
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                //自定义算法
                if(total < 5){
                    server = upList.get(currentIndex);
                    total++;
                }else{
                    total = 0;
                    currentIndex++;
                    if(currentIndex >= upList.size()){
                        currentIndex = 0;
                    }
                    server = upList.get(currentIndex);
                }

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
