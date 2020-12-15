package org.example.annotation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2020/12/15 21:01.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
