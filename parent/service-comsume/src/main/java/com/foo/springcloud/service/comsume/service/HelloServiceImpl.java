package com.foo.springcloud.service.comsume.service;

import com.foo.springcloud.service.product.duo.feign.DuoHelloFeign;
import com.foo.springcloud.service.product.feign.FooHelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private FooHelloFeign fooHelloFeign;
    @Autowired
    private DuoHelloFeign duoHelloFeign;

    @Override
    public String hello() {
        return build(fooHelloFeign.hello(), duoHelloFeign.hello());
    }

    private String build(String arg1, String args2) {
        return new StringBuilder(arg1).append(" ").append(args2).toString();
    }
}
