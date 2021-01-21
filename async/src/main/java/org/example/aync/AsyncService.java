package org.example.aync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by hyq on 2021/1/21 18:38.
 */
@Service
public class AsyncService {

    @Async
    public void testAsync() {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testAsync invoked");
    }
}
