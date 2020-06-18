package com.study.ribbonrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 自定义随机Ribbon算法
 * @Author jzhao
 * @Date 2020-6-18 22:34
 **/
@Configuration
public class RibbonRule {
    @Bean
    public IRule myRule(){
        return new PointRibbonRule();
    }
}
