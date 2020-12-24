package com.springcloud.alibaba.nacos.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "nacos-provider")
public interface RemoteHello {

    @RequestMapping("/hello")
    String test();
}
