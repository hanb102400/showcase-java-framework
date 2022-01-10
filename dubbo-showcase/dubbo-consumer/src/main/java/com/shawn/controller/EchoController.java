package com.shawn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shawn.service.EchoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/echo")
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @RequestMapping("/print/{msg}")
    @ResponseBody
    public String print(@PathVariable String msg) {
        return echoService.echo(msg);
    }

}
