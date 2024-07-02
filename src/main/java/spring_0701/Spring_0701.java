package spring_0701;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring_0701 {
  public void learn() {

    EmailService emailService = new EmailService(new SmtpEmailSender());
    EmailService emailService1 = new EmailService(new AwsSesEmailSender());

    //    User model = new User("max@gmail.com", "김승조", 30);
    //    UserView userView = new UserView();
    //    UserController userController = new UserController(model, userView);
    //    userController.updateView();
    //    userController.setUserName("김승조랑말");
    //    userController.setUserAge(31);
    //    userController.updateView();

    //    Quiz quiz = new Quiz("오늘은 무슨 요일일까요?", "월요일");
    //    QuizView quizView = new QuizView();
    //    QuizController quizController = new QuizController(quiz, quizView);
    //    quizController.startQuiz();

//    SpringApplication.run(com.ormispring.basic.BasicApplication.class, args);
  }
}
