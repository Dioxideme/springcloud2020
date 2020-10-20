package com.liuzhe.springcloud.alibaba.controller;

import com.liuzhe.springcloud.alibaba.domain.CommonResult;
import com.liuzhe.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author : liuzhe
 * @date : 2020-10-19 20:31
 **/
@RestController
public class AccountController {
    @Resource
    AccountService accountService;

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  扣费金额
     * @return 提示信息和代码
     */
    @PostMapping(value = "/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣费成功");
    }
}
