package com.foo.springcloud.provider.chongqing.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/chongqing")
public interface CompanyApi {
    @GetMapping("/yucun")
    String yucun();
}
