package com.liuzhe.springcloud.alibaba.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.liuzhe.springcloud.entities.CommonResult;

/**
 * @author : liuzhe
 * @date : 2020-10-15 19:21
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"自定义 global handlerException ---1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"自定义 global handlerException ---2");
    }
}
