package com.liuzhe.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : liuzhe
 * @date : 2020-10-19 19:49
 **/
@Mapper
public interface StorageDao {
    /**
     *
     * @param productId 产品id
     * @param count 减去的数量
     *              扣减库存信息
     */
     void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
