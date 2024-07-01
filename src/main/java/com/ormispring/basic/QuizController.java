package com.ormispring.basic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class QuizController {

    private Quiz quiz;
    private QuizView quizView;

    public void startQuiz() {
        quizView.displayQuestion(quiz.question);
        String userAnswer = quizView.getUserAnswer();
        boolean isCorrect = userAnswer.equals(quiz.answer);
        quizView.displayResult(isCorrect);
    }
}
