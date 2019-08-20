package com.foo.springcloud.service.product.web.controller;

import com.foo.springcloud.service.product.api.HelloApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {
    @Value("${server.port}")
    private String port;
    @Override
    public String hello() {
        return "foo : "+port;
    }
}
