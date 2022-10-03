package com.example.spring.controller;

import com.example.spring.common.Result;
import com.example.spring.common.ResultCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Result test(){
        return new Result(ResultCode.SUCCESS);
    }
}
