package com.foo.client.controller;

import com.foo.feign.TangPoetryFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private TangPoetryFeign tangPoetryFeign;

    @GetMapping("/tang")
    public String baiDiChegn() {
        return tangPoetryFeign.baiDiCheng();
    }

}
