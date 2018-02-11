package main;

import model.Author;
import model.Comment;
import services.CommentsService;
import utils.SystemUtils;

public class Main {

	private static CommentsService commentsService = new CommentsService();

	private static String reciveComment;
	private static Comment newComment;
	private static boolean isNewComment = true;

	public static void main(String[] args) {
		start();
		print();
		deleteComment();
		print();
	}

	private static void setComment() {
		newComment = new Comment();
		newComment.setMessage(reciveComment);
		newComment.setAuthor(new Author());
		newComment.setFather(0);
		if (!isNewComment) {
			newComment.setFather(commentsService.list().get(commentsService.list().size() - 1).hashCode());
		}
	}

	private static void start() {
		reciveComment = SystemUtils.readComment();
		setComment();
		addComment();

		if (SystemUtils.willContinue("Deseja continuar respondendo?")) {
			isNewComment = false;
			start();
		} else if (SystemUtils.willContinue("Deseja inserir um novo comnetátio?")) {
			isNewComment = true;
			start();
		}
	}

	private static void deleteComment() {
		if (SystemUtils.willContinue("Deseja excluir algum comentário?")) {
			String id = SystemUtils.readComment();

			for (int i = 0; i < commentsService.list().size(); i++) {
				
				Comment removeComment = commentsService.list().get(i);
				
				if(removeComment.hashCode() == new Integer(id)) {
					removeComment(removeComment);					
				}
			}
		}
	}

	private static void addComment() {
		commentsService.addComment(newComment);
	}

	private static void removeComment(Comment comment) {
		commentsService.removeComment(comment);
	}

	private static void print() {
		for (int i = 0; i < commentsService.list().size(); i++) {
			String texto = " RESPOSTA ";
			if (commentsService.list().get(i).getFather() == 0) {
				System.out.println();
				System.out.println("--------------Nova Mensagem---------------");
				texto = " MENSAGEM ";
			}
			System.out.println("<<<<ID " + commentsService.list().get(i).hashCode() + ">>>> " + " + " + texto + " : "
					+ commentsService.list().get(i).getMessage() + " + " + "<<<< PAI "
					+ commentsService.list().get(i).getFather() + " >>>>");
		}
	}
}
