package com.liuzhe.springcloud.alibaba.controller;

import com.liuzhe.springcloud.alibaba.domain.CommonResult;
import com.liuzhe.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : liuzhe
 * @date : 2020-10-19 20:05
 **/
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    @PostMapping(value = "/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功");
    }
}
