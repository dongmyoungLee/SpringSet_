package com.example.spring.controller;

import com.example.spring.common.Result;
import com.example.spring.common.ResultCode;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController("/test")
public class TestController {

    public Result test(){
        return new Result(ResultCode.SUCCESS);
    }
}
