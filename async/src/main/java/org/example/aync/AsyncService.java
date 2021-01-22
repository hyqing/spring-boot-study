package org.example.aync;

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

    //无返回值调用
    @Async
    public void withoutReturn() {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testAsync invoked");
    }

    //有返回值的调用
    @Async
    public Future<String> withReturn() {
        System.out.println("Execute method asynchronously - " + Thread.currentThread().getName());
        try {
            TimeUnit.MINUTES.sleep(1);
            return new AsyncResult<String>("hello world !!!!");
        } catch (InterruptedException e) {
            //
        }
        return null;
    }

}
