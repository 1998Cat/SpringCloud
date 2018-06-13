package com.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class ServerController {

    @Autowired
    private ServerHello serverHello;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("say")
    public String say(){
        System.out.println(discoveryClient.getInstances("server-product").get(0).getPort());
        return serverHello.say("test");
    }
}
