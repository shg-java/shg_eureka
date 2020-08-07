package com.shg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 * Created on  2020/7/29 15:11
 *
 * @author <a href="mailto: sunhongguang@camelotchina.com">孙红光</a>
 * @version 1.0
 * Copyright (c) 2018  交付部
 */
@RestController
@RequestMapping("/eureka")
public class EurekaController {
    @GetMapping("/heath")
    public Integer heath(){
        return 1;
    }
}