package com.atguigu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 将 RestTemplate 注入到 spring 容器中 方便使用
 */

/**
 *  服务之间的调用：原始阶段 用 HttpClient。进化之后、用 RestTemplate
 *
 *  使用 RestTemplate 访问 restful 接口非常简单粗暴无脑
 *  (url、requestMap、ResponseBean.class) 这三个参数分别代表
 *  REST请求地址、请求参数、HTTP响应转换被转换成的对象类型
 *
 *  要是用 RestTemplate 对象，需要把它注入到容器中
 *
 *
 *  负载均衡算法： rest接口第几次请求数 % 服务器集群数量 = 实际调用服务器位置下标 ，每次重启之后 rest 接口技术从1开始
 *
 */
@Configuration
public class ApplicationContextConfig {

    @Bean // 相当于 applicationContext.xml 中的 <bean id="" class=""/>
    @LoadBalanced // 赋予 RestTemplate 负载均衡能力
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }
}
