package org.example.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by hyq on 2021/1/12 10:36.
 */
public class MyApplicationEvent extends ApplicationEvent{

    private static final long serialVersionUID = 1L;

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
