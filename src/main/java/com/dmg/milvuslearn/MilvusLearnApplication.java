package com.dmg.milvuslearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MilvusLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MilvusLearnApplication.class, args);
    }

}
