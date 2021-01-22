package org.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;

/**
 * Created by hyq on 2021/1/12 10:36.
 */
public class MyApplicationEvent extends ApplicationEvent {

    private static final Logger logger = LoggerFactory.getLogger(MyApplicationEvent.class);

    private static final long serialVersionUID = 1L;

    private String message;

    public MyApplicationEvent(String message) {
        super(message);
        this.message = message;
        logger.info("add event success! message: {}", message);
    }

    public String getMessage() {
        return message;
    }
}
