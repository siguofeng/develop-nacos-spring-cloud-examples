package com.springcloud.alibaba.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${provider.name}")
    private String userName;

    @RequestMapping("/hello")
    public String hello() {
        return "provider:" + userName;
    }
}
