package model;

import java.util.ArrayList;
import java.util.List;

public class Comment {
	private String message;
	private Author author;
	private int father;
	private List<Comment> comments = new ArrayList<>();
			
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

	public int getFather() {
		return father;
	}

	public void setFather(int father) {
		this.father = father;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comments.remove(comment);		
	}
}
