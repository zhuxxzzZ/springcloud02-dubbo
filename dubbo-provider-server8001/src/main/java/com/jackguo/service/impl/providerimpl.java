package com.jackguo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.jackguo.service.providerService;


@Service
public class providerimpl implements providerService {

    @Override
    public void show() {
        System.out.println("dubbo-provider-server8001");
    }

}
