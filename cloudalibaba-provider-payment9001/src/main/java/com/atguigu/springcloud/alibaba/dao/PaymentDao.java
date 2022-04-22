package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

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
