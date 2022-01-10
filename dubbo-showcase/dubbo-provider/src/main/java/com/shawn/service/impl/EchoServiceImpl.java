package com.shawn.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shawn.service.EchoService;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0")
@Component
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String message) {
        String msg = "hello message:" + message;
        System.out.println(msg + "::" + System.currentTimeMillis());
        return msg;
    }
}
