package model;

import java.util.List;

public class Comments {

	private String message;
	private Author author;
	private List<Comments> answers;
	
	public Comments() {
		
	}

	public Comments(String message, Author author, List<Comments> answers) {
		this.message = message;
		this.author = author;
		this.answers = answers;
	}

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

	public List<Comments> getResposta() {
		return answers;
	}

	public void addResposta(Comments resposta) {
		if (!answers.contains(resposta)) {
			this.answers.add(resposta);
		}
	}
}
