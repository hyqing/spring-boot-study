package org.example.aync.controller;

import org.example.aync.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by hyq on 2021/1/21 18:40.
 */
@RestController
public class TestController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/test1")
    public String test1() {
        asyncService.withoutReturn();
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2() throws InterruptedException, ExecutionException {
        System.out.println("Invoking an asynchronous method. " + Thread.currentThread().getName());

        Future<String> future = asyncService.withReturn();

        while (true) {  //这里使用了循环判断，等待获取结果信息
            if (future.isDone()) {  //判断是否执行完毕
                System.out.println("Result from asynchronous process - " + future.get());
                break;
            }
            System.out.println("Continue doing something else. ");
        }
        return "test2";
    }
}