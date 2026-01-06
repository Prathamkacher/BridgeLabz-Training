/*
 * 10. "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.
 */

package com.day5.personalizedlearningplatform;

public class Main {
	public static void main(String[] args) {
		Learner learner = new Learner(
				"Pratham",
				"pratham@gmail.com",
				101,
				"short"
		);
		
		String[] questions = {
                "Java is OOP language?",
                "Java supports multiple inheritance?"
        };

        String[] answers = {
                "yes",
                "no"
        };
        
        Quiz quiz = new Quiz(questions, answers);

        String[] userAnswers = {
                "yes",
                "no"
        };
        
        quiz.submitQuiz(userAnswers);
        quiz.showResult();

        learner.generateCertificate();
	}
}
