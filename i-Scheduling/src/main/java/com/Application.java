package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling   // 1.开启定时任务
@EnableAsync        // 2.开启多线程
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
