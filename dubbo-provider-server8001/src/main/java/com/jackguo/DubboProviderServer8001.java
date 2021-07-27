package com.jackguo;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboProviderServer8001 {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderServer8001.class,args);
    }
}
