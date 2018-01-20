package repository;

import java.util.ArrayList;
import java.util.List;

import model.Author;
import model.Comments;

public class CommentsRepository {

	private Comments comments;	

	public void save(String message, List<Comments> answers) {
		comments = new Comments(message, new Author(), answers);			
	}
	
	public List<Comments> list(){
		List<Comments> listComments = new ArrayList<>();
		
		listComments.add(comments);
		
		
		return listComments;
	}
}
