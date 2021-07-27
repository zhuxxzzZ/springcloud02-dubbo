package com.jackguo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.jackguo.service.providerService;
import com.jackguo.service.providerService8002;


@Service
public class provider8002impl implements providerService8002 {

    @Override
    public void show() {
        System.out.println("dubbo-provider-server8002");
    }

}
