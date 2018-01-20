package services;

import java.util.List;

import model.Comments;
import repository.CommentsRepository;

public class CommentsService {

	private CommentsRepository commentsRepository = new CommentsRepository();

	public void save(String comments, List<Comments> answers) {		
		commentsRepository.save(comments, answers);
	}
	
	public List<Comments> list() {
		return commentsRepository.list();
	}
}
