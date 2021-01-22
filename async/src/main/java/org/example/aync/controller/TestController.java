package org.example.aync.controller;

import org.example.aync.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

/**
 * Created by hyq on 2021/1/21 18:40.
 */
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/test1")
    public String test1() {
        logger.info("Invoking an asynchronous method. " + Thread.currentThread().getName());
        asyncService.withoutReturn();
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2() throws InterruptedException, ExecutionException {
        logger.info("Invoking an asynchronous method. " + Thread.currentThread().getName());
        Future<String> future = asyncService.withReturn();
        while (true) {  //这里使用了循环判断，等待获取结果信息
            if (future.isDone()) {  //判断是否执行完毕
                logger.info("Result from asynchronous process - " + future.get());
                break;
            }
            logger.info("Continue doing something else. ");
            TimeUnit.SECONDS.sleep(1);
        }
        return "test2";
    }
}