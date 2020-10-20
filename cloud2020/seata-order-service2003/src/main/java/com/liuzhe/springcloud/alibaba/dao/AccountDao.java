package com.liuzhe.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author : liuzhe
 * @date : 2020-10-19 20:25
 **/
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  减去的费用
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
