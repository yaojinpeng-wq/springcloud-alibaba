package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 接口+ feignClient 注解
 * 调用的 controller 层 实际也是调用的 service 层
 * 根据 feignClient 所显示的微服务名称，去调用服务侧所对外提供的方法
 */

@Component  // 交给 spring 容器托管
@FeignClient(value = "nacos-payment-provider") // value = 被调用的微服务名称
public interface OpenFeignService {

    @GetMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment);

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/timeOut")
    public String timeOut();
}
