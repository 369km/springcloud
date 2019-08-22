package com.foo.springcloud.consumer.fudi.service;

import com.foo.springcloud.provider.chongqing.feign.CompanyFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyFeign companyFeign;

    @Override
    public String company() {
        return companyFeign.yucun();
    }
}
