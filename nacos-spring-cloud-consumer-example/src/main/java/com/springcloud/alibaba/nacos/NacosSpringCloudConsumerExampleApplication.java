package com.springcloud.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosSpringCloudConsumerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringCloudConsumerExampleApplication.class, args);
    }

}
