package com.liuzhe.springcloud.controller;

import com.liuzhe.springcloud.entities.CommonResult;
import com.liuzhe.springcloud.entities.Payment;
import com.liuzhe.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author : liuzhe
 * @date : 2020-09-12 15:02
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        final int i = paymentService.create(payment);
        log.info("******插入结果******" + i);

        if (i > 0) {
            return new CommonResult(200, "插入数据成功,serverPort:"+serverPort, i);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果******" + payment+"\t");

        if (payment != null) {
            return new CommonResult(200, "查找数据成功,serverPort:"+serverPort, payment);
        } else {
            return new CommonResult(444, "查找数据失败,查找id为" + id, null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }



}
