package org.example.aync.controller;

import org.example.aync.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2021/1/21 18:40.
 */
@RestController
public class TestController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/test")
    public String test() {
        asyncService.testAsync();
        return "test";
    }
}