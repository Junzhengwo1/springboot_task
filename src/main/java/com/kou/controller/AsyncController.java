package com.kou.controller;

import com.kou.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JIAJUN KOU
 */
@RestController
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/hello")
    public String hello(){

        asyncService.Hello();//由于在service中使线程停止了3秒
        return "ok";
    }


}
