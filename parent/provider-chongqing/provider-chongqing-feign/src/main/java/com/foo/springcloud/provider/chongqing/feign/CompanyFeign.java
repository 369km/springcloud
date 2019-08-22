package com.foo.springcloud.provider.chongqing.feign;

import com.foo.springcloud.provider.chongqing.api.CompanyApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provider-chongqing", fallbackFactory = CompanyFallbackFactory.class)
public interface CompanyFeign extends CompanyApi {
}
