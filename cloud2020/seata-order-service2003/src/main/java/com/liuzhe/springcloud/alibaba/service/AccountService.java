package com.liuzhe.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author : liuzhe
 * @date : 2020-10-19 20:28
 **/
public interface AccountService {
    /**
     * 扣费服务接口
     *
     * @param userId 用户id
     * @param money  扣除金额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
