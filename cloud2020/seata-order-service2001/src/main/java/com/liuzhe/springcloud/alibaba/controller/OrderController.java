package com.liuzhe.springcloud.alibaba.controller;

import com.liuzhe.springcloud.alibaba.domain.CommonResult;
import com.liuzhe.springcloud.alibaba.domain.Order;
import com.liuzhe.springcloud.alibaba.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : liuzhe
 * @date : 2020-10-19 17:08
 **/
@RestController
@Slf4j
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping(value = "/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }


}
