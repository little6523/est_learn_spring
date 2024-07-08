package com.ormispring.service;

import com.ormispring.util.Helper;
import com.ormispring.util.Test1;
import com.ormispring.util.Test2;
import com.ormispring.util.Test3;
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
