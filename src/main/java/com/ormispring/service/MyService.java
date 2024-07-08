package com.ormispring.service;

import com.ormispring.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

  private Helper helper;

  @Autowired
  public void setHelper(Helper helper) {
    this.helper = helper;
  }

  public void hello() {
    System.out.println("hello");
  }
}
