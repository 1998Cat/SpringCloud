package com.rs;

import org.springframework.stereotype.Component;

/**
 * 接口中fallback接口需要实现指定的服务
 */
@Component
public class ServerFeign implements ServerHello{

    @Override
    public String say(String name) {
        //如果访问出现错误就返回错误信息
        return "request error";
    }
}
