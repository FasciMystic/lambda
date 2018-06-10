package com.example.stu;

public class Student {
	private int id;
	private String name;
	private int Score;
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		Score = score;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	

}
