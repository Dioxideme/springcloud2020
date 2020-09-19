package com.liuzhe.springcloud.dao;

import com.liuzhe.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : liuzhe
 * @date : 2020-09-12 14:34
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);

}
