package com.ormispring.basic;

import java.util.Scanner;

public class QuizView {

  public void displayQuestion(String question) {
    System.out.println(question);
  }

  public String getUserAnswer() {
    Scanner sc = new Scanner(System.in);
      return sc.nextLine();
  }

  public void displayResult(boolean isCorrect) {
    System.out.println(isCorrect ? "정답입니다." : "오답입니다.");
  }
}
