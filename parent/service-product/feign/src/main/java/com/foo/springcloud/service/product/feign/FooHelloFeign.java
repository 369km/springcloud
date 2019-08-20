package com.foo.springcloud.service.product.feign;

import com.foo.springcloud.service.product.api.HelloApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service-product", fallbackFactory = FooHelloFallbackFactory.class)

public interface FooHelloFeign extends HelloApi {
}
