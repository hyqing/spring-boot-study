package org.example.aop.controller;

import org.example.aop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2021/5/10 15:28.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public String test() {
        return testService.test();
    }
}
