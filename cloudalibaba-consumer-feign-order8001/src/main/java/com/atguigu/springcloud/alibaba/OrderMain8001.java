package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients // 使用 feign 激活并开启
public class OrderMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8001.class,args);
    }
}
