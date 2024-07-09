package com.ormispring.spring_0708.service;

import com.ormispring.spring_0708.util.Helper;
import com.ormispring.spring_0708.util.Test1;
import com.ormispring.spring_0708.util.Test2;
import com.ormispring.spring_0708.util.Test3;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyService {

  private Helper helper;
  private final Test1 test1;
  private final Test2 test2;
  private final Test3 test3;

  public String hello() {
    System.out.println(this.helper);
    return "Hello, Spring Boot!";
  }
}
