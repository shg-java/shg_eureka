package com.shg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>Description: </p>
 * Created on  2020/7/29 14:49
 *
 * @author <a href="mailto: sunhongguang@camelotchina.com">孙红光</a>
 * @version 1.0
 * Copyright (c) 2018  交付部
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}