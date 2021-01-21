package org.example.blank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2021/1/21 18:41.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}