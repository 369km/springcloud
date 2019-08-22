package com.foo.springcloud.provider.feign;

import com.foo.springcloud.provider.api.CompanyApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "provider-shenzhen" ,fallbackFactory = CompanyFallbackFactory.class)
public interface CompanyFeign extends CompanyApi {
}
