package org.example.listener;

import org.springframework.context.ApplicationListener;

/**
 * Created by hyq on 2021/1/12 10:40.
 */
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent event) {
        System.out.println("接收到事件：" + event.getClass());
    }
}
