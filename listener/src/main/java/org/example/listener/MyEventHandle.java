package org.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by hyq on 2021/1/12 11:15.
 */
@Component
public class MyEventHandle {
    private static final Logger logger = LoggerFactory.getLogger(MyEventHandle.class);

    /**
     * 参数任意(为Object）的时候所有事件都会监听到
     * 所有，该参数事件，或者其子事件（子类）都可以接收到
     */
    @Async
    @EventListener(classes = {MyApplicationEvent.class})
    public void listenMyApplicationEvent(Object event) throws InterruptedException {
        TimeUnit.SECONDS.sleep(30);
        logger.info("MyEventHandle 接收到事件：" + ((MyApplicationEvent) event).getMessage());
    }
}
