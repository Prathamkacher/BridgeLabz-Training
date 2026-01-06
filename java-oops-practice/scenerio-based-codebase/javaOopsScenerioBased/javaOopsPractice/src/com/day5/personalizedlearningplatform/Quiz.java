package com.day5.personalizedlearningplatform;

public class Quiz {
	private String[] questions;
	private String[] answers;
	private int score;
	
	public Quiz(String[] questions, String[] answers) {
		this.questions = questions;
		this.answers = answers;
		this.score = 0;
	}
	
	public void submitQuiz(String[] userAns) {
		for (int i=0; i<answers.length; i++) {
			if (answers[i].equalsIgnoreCase(userAns[i])) {
				score++;
			}
		}
	}
	
	public void showResult() {
		int total = questions.length;
		double percentage = (score * 100) / total;
		
		System.out.println("Score: " + score + "/" + total);
        System.out.println("Percentage: " + percentage + "%");
	}
}
