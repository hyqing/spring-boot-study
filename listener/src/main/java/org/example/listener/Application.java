package org.example.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by hyq on 2021/1/12 10:42.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        /*
         *1.配置监听器：启动的时候，需要把监听器加入到Spring容器中
         */
        SpringApplication application = new SpringApplication(Application.class);
        //配置事件监听器
        application.addListeners(new MyApplicationListener());
        ConfigurableApplicationContext context = application.run(args);
        //发布事件
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.close();
    }
}
