package services;

import java.util.List;
import model.Comment;

public class CommentsService {

	private Comment comment = new Comment();	
	
	public void addComment(Comment comment) {
		this.comment.addComment(comment);		
	}
	
	public void removeComment(Comment comment) {
		this.comment.removeComment(comment);		
	}
	
	public List<Comment> list() {
		return  comment.getComments();
	}
}
