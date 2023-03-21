package com.example.homeworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HomeworksApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HomeworksApplication.class, args);
        context.close();
    }

}
