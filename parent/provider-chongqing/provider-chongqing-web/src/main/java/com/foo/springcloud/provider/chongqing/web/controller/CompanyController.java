package com.foo.springcloud.provider.chongqing.web.controller;

import com.foo.springcloud.provider.chongqing.api.CompanyApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController implements CompanyApi {
    @Override
    public String yucun() {
        return "yucun";
    }
}
