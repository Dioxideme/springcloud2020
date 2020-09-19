package com.liuzhe.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : liuzhe
 * @date : 2020-09-15 19:52
 **/
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        //随机
        return new RandomRule();
    }
}
