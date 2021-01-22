//package org.example.aync.config;
//
//import org.example.aync.controller.TestController;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.AsyncConfigurer;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import java.util.concurrent.Executor;
//import java.util.concurrent.ThreadPoolExecutor;
//
///**
// * Created by hyq on 2021/1/21 18:36.
// */
//
//@EnableAsync
//@Configuration
//public class AsyncConfig implements AsyncConfigurer {
//
//    private static final Logger logger = LoggerFactory.getLogger(AsyncConfigurer.class);
//
////ThreadPoolTaskExecutor ：最常使用，推荐。 其实质是对java.util.concurrent.ThreadPoolExecutor的包装
//
//    @Bean("kingAsyncExecutor")
//    public ThreadPoolTaskExecutor executor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        int corePoolSize = 10;
//        executor.setCorePoolSize(corePoolSize);
//        int maxPoolSize = 50;
//        executor.setMaxPoolSize(maxPoolSize);
//        int queueCapacity = 10;
//        executor.setQueueCapacity(queueCapacity);
//
//        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
//
//        String threadNamePrefix = "kingDee-";
//        executor.setThreadNamePrefix(threadNamePrefix);
//        executor.setWaitForTasksToCompleteOnShutdown(true);
//        // 使用自定义的跨线程的请求级别线程工厂类19
//        int awaitTerminationSeconds = 5;
//        executor.setAwaitTerminationSeconds(awaitTerminationSeconds);
//        executor.initialize();
//        return executor;
//    }
//
//    @Override
//    public Executor getAsyncExecutor() {
//        return executor();
//    }
//
//    @Override
//    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
//        return (ex, method, params) -> logger.info(String.format("执行异步任务'%s'", method), ex);
//    }
//}
