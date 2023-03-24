package com.example.accessserviceone.controller;

import com.example.commonutils.utils.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestComtroller {

    @GetMapping("/test")
    public CommonResult test(){
        return CommonResult.success("ok");
    }
}
