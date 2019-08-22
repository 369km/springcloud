package com.foo.springcloud.consumer.fudong.controller;

import com.foo.springcloud.consumer.fudong.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/company")
    public String company() {
        return companyService.company();
    }
}
