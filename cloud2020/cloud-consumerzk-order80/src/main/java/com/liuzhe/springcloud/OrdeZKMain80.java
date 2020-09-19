package com.liuzhe.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : liuzhe
 * @date : 2020-09-14 15:31
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrdeZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrdeZKMain80.class,args);
    }
}
