# SpringCould
## 1. SringCould简介
   SpringCould是分布式微服务架构下的一站式解决方案，是各个微服务架构落地技术的集合体，俗称微服务全家桶，专注于全局的服务治理框架。
## 2. 整合组件
**Ribbo、Mybatis、Feign**
## 3. Feign整合原因
   在使用**Spring Cloud Ribbon**时，通常都会利用它对**RestTemplate**的请求拦截来实现对依赖服务的接口调用，而**RestTemplate**已经实现了对HTTP请求的封装处理，形成了一套模版化的调用方法。在**springcould-consumer-dept-80**中，我们只是简单介绍了**RestTemplate**调用对实现，但是在实际开发中，由于对服务依赖对调用可能不止于一处，往往一个接口会被多处调用，所以我们通常都会针对各个微服务自行封装一些客户端累来包装这些依赖服务的调用。这个时候我们会发现，由于**RestTemplate**的封装，几乎每一个调用都是简单的模版化内容。综合上述这些情况，**Spring Cloud Fegin**在此基础上做了进一步封装，由它来帮助我们定义和实现依赖服务接口的定义。在**Spring Cloud Feign**的实现下，我们只需创建一个接口并用注解的方式来配置它，即可完成对服务提供方的接口绑定，简化了在使用**Spring Cloud Ribbon**时自行封装服务调用客户端的开发量，具体实现参考**springcould-consumer-dept-feign**。
## 4. 待续。。。
- 本仓库会持续更新！
