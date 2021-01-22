package org.example.aync;

import org.example.aync.controller.TestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by hyq on 2021/1/21 18:38.
 */
@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    //无返回值调用
    @Async
    public void withoutReturn() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("testAsync invoked - " + Thread.currentThread().getName());
    }

    //有返回值的调用
    @Async
    public Future<String> withReturn() {
        logger.info("Execute method asynchronously - " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(10);
            return new AsyncResult<>("hello world !!!!");
        } catch (InterruptedException e) {
            //
        }
        return null;
    }

}
