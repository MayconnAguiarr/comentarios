package model;

import java.util.ArrayList;
import java.util.List;

public class Comment {

	private String message;
	private Author author;
	private int pai;
	private List<Comment> answers = new ArrayList<>();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public int getPai() {
		return pai;
	}

	public void setPai(int pai) {
		this.pai = pai;
	}

	public List<Comment> getAnswers() {
		return answers;
	}

	public void addAnswers(Comment answers) {
		this.answers.add(answers);
	}
}
