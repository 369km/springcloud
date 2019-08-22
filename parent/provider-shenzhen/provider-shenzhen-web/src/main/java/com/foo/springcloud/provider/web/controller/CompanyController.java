package com.foo.springcloud.provider.web.controller;

import com.foo.springcloud.provider.api.CompanyApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController implements CompanyApi {
    @Override
    public String pingAn() {
        return "ping an";
    }
}
