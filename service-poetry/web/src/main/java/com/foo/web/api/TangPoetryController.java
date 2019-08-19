package com.foo.web.api;

import com.foo.api.TangPoetryApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TangPoetryController implements TangPoetryApi {
    @Value("${server.port}")
    private String port;

    @Override
    public String baiDiCheng() {
        return "poetry：" + port;
    }
}
