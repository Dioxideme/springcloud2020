package com.liuzhe.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author : liuzhe
 * @date : 2020-09-17 17:19
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "*******PaymentFallbackService fall back paymentInfo_OK,┭┮﹏┭┮";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "*******PaymentFallbackService fall back paymentInfo_TimeOut,┭┮﹏┭┮";
    }
}
