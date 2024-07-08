package com.ormispring.basic;

import com.ormispring.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ormispring")
public class BasicApplication {

  public static void main(String[] args) {

    MyService myService = new MyService();
    myService.hello();
    SpringApplication.run(BasicApplication.class, args);
  }
}
