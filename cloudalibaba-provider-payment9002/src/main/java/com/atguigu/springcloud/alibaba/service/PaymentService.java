package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService {
    /**
     * 插入数据
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 查询数据
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
