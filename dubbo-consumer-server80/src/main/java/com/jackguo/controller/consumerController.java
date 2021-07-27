package com.jackguo.controller;


import com.jackguo.service.consumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class consumerController {

    @Autowired
    private consumerService consumerService;


    @RequestMapping("/consumer/show")
    public void show(){
        consumerService.show();
    }


}
