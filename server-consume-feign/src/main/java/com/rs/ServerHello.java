package com.rs;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
// @FeignClient 中的name，如果是引用同一个服务，多个接口中的name可以一样
@FeignClient(name = "server-product",fallback = ServerFeign.class)
public interface ServerHello {

    // 与服务提供者中的mapping一致
    @RequestMapping("/hello/say/{name}")
    String say(@PathVariable("name") String name);
}
