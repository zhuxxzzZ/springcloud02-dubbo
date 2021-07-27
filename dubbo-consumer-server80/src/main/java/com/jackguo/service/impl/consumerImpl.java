package com.jackguo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;

import com.jackguo.service.consumerService;
import com.jackguo.service.providerService;
import com.jackguo.service.providerService8002;
import org.springframework.stereotype.Service;

@Service
public class consumerImpl implements consumerService {

    @Reference
    private providerService providerService;

    @Reference
    private providerService8002 providerService8002;

    @Override
    public void show() {
        providerService.show();
        providerService8002.show();
        System.out.println("dubbo-consumer-server80");
    }


}
