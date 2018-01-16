package model;

import java.util.List;

public class Comentarios {

	private String message;
	private Author author;	
	private List<Comentarios> respostas;

	public Comentarios(String message, Author author, List<Comentarios> respostas ) {
		this.message = message;
		this.author = author;
		this.respostas = respostas;		
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Comentarios> getResposta() {
		return respostas;
	}
	
	public void addResposta(Comentarios resposta) {
		if(!respostas.contains(resposta)) {
			this.respostas.add(resposta);
		}
	}	
}
