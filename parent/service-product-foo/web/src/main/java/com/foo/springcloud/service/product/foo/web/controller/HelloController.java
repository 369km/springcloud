package com.foo.springcloud.service.product.foo.web.controller;

import com.foo.springcloud.service.product.foo.api.HelloApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloApi {
    @Override
    public String hello() {
        return "foo";
    }
}
