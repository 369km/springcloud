package com.foo.springcloud.service.product.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface HelloApi {

    @GetMapping(value = "/hello")
    String hello();
}
