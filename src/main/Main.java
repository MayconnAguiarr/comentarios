package main;

import model.Author;
import model.Comment;
import services.CommentsService;
import utils.SystemUtils;

public class Main {

	private static CommentsService commentsService = new CommentsService();

	public static void main(String[] args) {
		startComment(true);
		print();
	}

	private static void startComment(boolean isNewComment) {
		String comment = SystemUtils.readComment();
		addComment(comment, isNewComment);
		if (SystemUtils.willContinue("Deseja continuar respondendo?")) {
			startComment(false);
		}

		if (SystemUtils.willContinue("Deseja inserir um novo comnetátio?")) {
			startComment(true);
		}
	}

	private static void addComment(String comment, boolean isNewComment) {
		Comment newComment = new Comment();
		newComment.setMessage(comment);
		newComment.setAuthor(new Author());
		if (commentsService.list().size() > 0 && isNewComment == false) {
			newComment.setPai(commentsService.list().get(commentsService.list().size() - 1).hashCode());
		}
		commentsService.save(newComment);
	}

	private static void print() {
		for (int i = 0; i < commentsService.list().size(); i++) {
			String texto = "Resposta(" + i + ")";
			if (commentsService.list().get(i).getPai() == 0) {
				System.out.println();
				System.out.println("--------------Nova Mensagem---------------");
				texto = "Mensagem";
			}
			System.out.println(texto + " : " + commentsService.list().get(i).getMessage());
		}
	}
}
