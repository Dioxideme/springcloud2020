package com.liuzhe.springcloud.service;

import com.liuzhe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author : liuzhe
 * @date : 2020-09-12 14:48
 **/
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
