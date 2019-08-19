package com.foo.feign;

import org.springframework.stereotype.Component;

@Component
public class TangPoetryHystrix implements TangPoetryFeign {
    @Override
    public String baiDiCheng() {
        return "poetry exception";
    }
}
