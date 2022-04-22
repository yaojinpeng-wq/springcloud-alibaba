package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.OpenFeignService;
import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeignController8001 {

    @Resource
    private OpenFeignService service;

    //
    @GetMapping(value = "/consumer/feign/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return service.getPaymentById(id);
    }




}
