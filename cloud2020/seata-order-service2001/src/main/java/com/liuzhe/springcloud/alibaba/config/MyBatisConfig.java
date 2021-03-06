package com.liuzhe.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liuzhe
 * @date : 2020-10-19 17:10
 **/
@Configuration
@MapperScan({"com.liuzhe.springcloud.alibaba.dao"})
public class MyBatisConfig {

}

