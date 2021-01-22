package org.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by hyq on 2021/1/12 10:40.
 */
//@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationListener.class);

    @Async
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        logger.info("listener get event, sleep 2 second...");
        try {
            TimeUnit.SECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("event message is : {}", event.getClass());
    }
}
