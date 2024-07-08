package com.ormispring.basic;

import com.ormispring.service.MyService;
import jakarta.servlet.ServletException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "com.ormispring")
public class BasicApplication {

  public static void main(String[] args) throws ServletException, IOException {

    DispatcherServlet dispatcherservlet = new DispatcherServlet();
    String url = "/hello";

    MockHttpServletRequest request = new MockHttpServletRequest(url);
    MockHttpServletResponse response = new MockHttpServletResponse();

    dispatcherservlet.service(request, response);

    System.out.println(response.getContent());
    System.out.println("응답 내용" + response.getContent());

    //    SpringApplication.run(BasicApplication.class, args);
  }
}
