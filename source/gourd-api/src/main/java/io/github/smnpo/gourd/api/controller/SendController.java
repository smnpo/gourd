package io.github.smnpo.gourd.api.controller;

import io.github.smnpo.gourd.api.service.SendSerivce;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ming.zhao
 * @Date: 2019-05-02 8:57
 */
@Api("消息发送（Send Controller）")
@RestController
public class SendController {

    @Autowired
    SendSerivce sendSerivce;

    @GetMapping("/send")
    @ApiOperation("发送消息（Send Message）")
    public String sendMsg() {
        return "success";
    }
}
