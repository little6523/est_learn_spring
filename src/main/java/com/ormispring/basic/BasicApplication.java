package com.ormispring.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

    @Value("${kakao.api.key}")
    private String name;

    public static void main(String[] args) {
        Test test = new Test(new Member());
        SpringApplication.run(BasicApplication.class, args);
    }

}
