package com.ormispring.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

  public static void main(String[] args) {

//    EmailService emailService = new EmailService(new SmtpEmailSender());
//    EmailService emailService1 = new EmailService(new AwsSesEmailSender());

    User model = new User("max@gmail.com", "김승조", 30);
    UserView userView = new UserView();
    UserController userController = new UserController(model, userView);
    userController.updateView();
    userController.setUserName("김승조랑말");
    userController.setUserAge(31);
    userController.updateView();

//    SpringApplication.run(BasicApplication.class, args);
  }
}
