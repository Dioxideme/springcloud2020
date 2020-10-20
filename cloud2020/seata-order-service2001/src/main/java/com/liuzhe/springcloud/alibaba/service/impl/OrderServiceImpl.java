package com.liuzhe.springcloud.alibaba.service.impl;

import com.liuzhe.springcloud.alibaba.dao.OrderDao;
import com.liuzhe.springcloud.alibaba.domain.Order;
import com.liuzhe.springcloud.alibaba.service.AccountService;
import com.liuzhe.springcloud.alibaba.service.OrderService;
import com.liuzhe.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : liuzhe
 * @date : 2020-10-19 16:57
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("----------新建订单");
        orderDao.create(order);

        log.info("----->订单服务调用库存，扣减库存");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("---------库存扣减结束");

        log.info("---------账户服务");
        System.out.println(order.getUserId());
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-----------扣钱成功");

        //修改订单状态
        log.info("----------修改订单状态");
        orderDao.update(order.getUserId(),0);
        log.info("----------修改订单状态成功");

        log.info("---------订单服务完成");
    }
}
