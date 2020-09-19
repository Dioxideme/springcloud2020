package com.liuzhe.springcloud.service.impl;

import com.liuzhe.springcloud.dao.PaymentDao;
import com.liuzhe.springcloud.entities.Payment;
import com.liuzhe.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : liuzhe
 * @date : 2020-09-12 14:48
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
