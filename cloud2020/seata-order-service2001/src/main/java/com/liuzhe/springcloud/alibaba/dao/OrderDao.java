package com.liuzhe.springcloud.alibaba.dao;

import com.liuzhe.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : liuzhe
 * @date : 2020-10-19 16:47
 **/
@Mapper
public interface OrderDao {
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
