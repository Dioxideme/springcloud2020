package com.liuzhe.springcloud.alibaba.service;

/**
 * @author : liuzhe
 * @date : 2020-10-19 19:59
 **/
public interface StorageService {
    /**
     * 减少库存服务方法
     *
     * @param productId 产品id
     * @param count     数量
     */
    void decrease(Long productId, Integer count);

}
