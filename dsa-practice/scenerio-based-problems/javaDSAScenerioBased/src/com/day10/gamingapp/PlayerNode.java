package com.day10.gamingapp;

public class PlayerNode {
	int playerId;
	String name;
	int score;
	int height;
	
	PlayerNode left, right;
	
	PlayerNode(int playerId, String name, int score) {
		this.playerId = playerId;
		this.name = name;
		this.score = score;
		this.height = 1;
	}
}
