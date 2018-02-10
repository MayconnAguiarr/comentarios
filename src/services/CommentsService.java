package services;

import java.util.List;
import model.Comment;

public class CommentsService {

	private Comment comment = new Comment();	
	
	public void save(Comment comment) {
		this.comment.addAnswers(comment);		
	}
	
	public List<Comment> list() {
		return  comment.getAnswers();
	}
}
