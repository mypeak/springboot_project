package com.peak.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test")
@ResponseBody
@Api(description = "用户操作相关接口")
public class TestController {

    @RequestMapping(value = "/hello")
    @ApiOperation(value = "接口1")
    public String addUser( ) {
        return "Hello SpringBoot";
    }

}
