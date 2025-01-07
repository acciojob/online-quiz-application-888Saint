package com.driver;

import java.util.ArrayList;

public class Quiz {
	public ArrayList<QuizQuestion> questions;

    public Quiz() {
        // your code goes here;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(QuizQuestion question) {
        // your code goes here
        questions.add(question);
    }

    public QuizQuestion getQuestion(int questionNumber) throws QuestionNotFoundException {
       // your code goes here
        if (questionNumber <= 0 || questionNumber > questions.size()) {
            throw new QuestionNotFoundException("Question number " + questionNumber + " does not exist.");
        }
        return questions.get(questionNumber - 1);
    }
}
