package org.smnpo.gourd.broker.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ThreadPoolConfiguration {

    @Value("${pool.growth.CorePoolSize:5}")
    private int growthCorePoolSize = 5;

    @Value("${pool.growth.MaxPoolSize:30}")
    private int growthMaxPoolSize = 30;

    @Value("${pool.growth.QueueCapacity:15}")
    private int growthQueueCapacity = 15;

    @Value("${pool.growth.KeepAlive:60}")
    private int growthKeepAlive = 60;


    @Bean("dispatchExecutor")
    public ThreadPoolTaskExecutor createThreadPoolExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(growthCorePoolSize);
        executor.setMaxPoolSize(growthMaxPoolSize);
        executor.setQueueCapacity(growthQueueCapacity);
        executor.setThreadNamePrefix("Task-Executor-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setKeepAliveSeconds(growthKeepAlive);
        executor.initialize();
        return executor;
    }

}
