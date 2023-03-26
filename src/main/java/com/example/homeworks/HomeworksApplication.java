package com.example.homeworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HomeworksApplication {
    public static void main(String[] args) {
        SpringApplication.run(HomeworksApplication.class, args);
    }
}
