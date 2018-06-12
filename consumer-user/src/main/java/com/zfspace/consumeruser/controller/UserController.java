package com.zfspace.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZF
 * @description
 * @date 2018-06-12 17:45
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buy(String name) {
        // 调用远程服务
        String ticket = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "购买了" + ticket;
    }
}
