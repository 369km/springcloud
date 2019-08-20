package com.foo.springcloud.service.product.duo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/duo")
public interface HelloApi {
    @GetMapping(value = "/hello")
    String hello();
}
