package com.foo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/poetry")
public interface TangPoetryApi {
    @GetMapping("/tang")
    String baiDiCheng();
}
