package com.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hi")
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;// 用此组件来调用Eureka服务注册中心注册好的服务

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("say")
    public String say(){
        ServiceInstance serviceInstance = discoveryClient.getInstances("server-product").get(0);
        System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());//输出调用的是那个主机的服务
        return restTemplate.getForEntity("http://server-product/hello/say/zhangsan",String.class).getBody();
    }

}
