package com.foo.springcloud.provider.shenzhen.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/shenzhen")
public interface CompanyApi {
    @GetMapping("/pingan")
    String pingAn();
}
