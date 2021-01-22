package org.example.listener.controller;

import org.example.listener.MyApplicationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyq on 2021/1/22 18:13.
 */
@RestController
public class TestController {

    //ApplicationEventPublisher是ApplicationContext的父接口之一。
    // 这接口的作用是：Interface that encapsulates event publication functionality.
    //功能就是发布事件，也就是把某个事件告诉与这个事件相关的监听器
    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/test")
    public String test() {
        publisher.publishEvent(new MyApplicationEvent("event message"));
        return "test";
    }
}
