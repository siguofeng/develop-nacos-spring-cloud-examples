package com.springcloud.alibaba.nacos.controller;

import com.springcloud.alibaba.nacos.fegin.RemoteHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RemoteHello remoteHello;

    @RequestMapping("/test")
    public String test() {
        String test = remoteHello.test();
        System.out.println("结果:" + test);
        return test;
    }
}
