package com.foo.springcloud.provider.shenzhen.feign;

import com.foo.springcloud.provider.shenzhen.api.CompanyApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provider-shenzhen" ,fallbackFactory = CompanyFallbackFactory.class)
public interface CompanyFeign extends CompanyApi {
}
