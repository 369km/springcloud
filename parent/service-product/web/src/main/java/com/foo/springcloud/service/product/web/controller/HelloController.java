package com.foo.springcloud.service.product.web.controller;

import com.foo.springcloud.service.product.api.HelloApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {
    @Override
    public String hello() {
        return "foo";
    }
}
