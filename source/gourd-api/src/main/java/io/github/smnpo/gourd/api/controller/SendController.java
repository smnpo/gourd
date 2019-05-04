package io.github.smnpo.gourd.api.controller;

import io.github.smnpo.gourd.api.service.SendSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ming.zhao
 * @Date: 2019-05-02 8:57
 */
@RestController
public class SendController {

    @Autowired
    SendSerivce sendSerivce;

    @GetMapping("/send")
    public String sendMsg() {
        return "success";
    }
}
