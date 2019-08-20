package com.foo.springcloud.service.product.foo.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/foo")
public interface HelloApi {

    @GetMapping(value = "/hello")
    String hello();
}
