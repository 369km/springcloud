package com.foo.springcloud.service.product.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FooHelloFallbackFactory implements FallbackFactory<FooHelloFeign> {

    @Override
    public FooHelloFeign create(Throwable throwable) {
        return () -> "";
    }
}
