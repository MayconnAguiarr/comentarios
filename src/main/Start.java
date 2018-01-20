package main;

import java.util.ArrayList;
import java.util.List;

import model.Author;
import model.Comments;
import services.CommentsService;
import utils.SystemUtils;

public class Start {

	private static CommentsService commentsService = new CommentsService();

	private String readComments;
	private List<Comments> readListComments;

	public Start() {
		optionMenu();
	}
	
	public void optionMenu() {

		int opcao = SystemUtils.optionMenu();

		switch (opcao) {
		case 1:
			case1();
			break;
		case 5:
			System.exit(0);
			break;
		}
	}

	private void case1() {	
		answerComments();
		addComments();		
		print();
		
		optionMenu();
	}

	private void answerComments() {

		boolean Continue = true;
		
		readComments = SystemUtils.readComments("Insira um novo comentário.");
		
		readListComments =  new ArrayList();

		while (Continue) {
			Continue = SystemUtils.willContinue("Deseja respoder o comentário? (S/N)");

			if (Continue) {
				Comments comments = new Comments();
				comments.setMessage(SystemUtils.readComments("Responda o comentário."));
				comments.setAuthor(new Author());
				readListComments.add(comments);
			}
		}			
	}
	
	private void addComments() {
		commentsService.save(readComments, readListComments);		
	}

	private static void print() {
		List<Comments> listComments = commentsService.list();
		System.out.println(commentsService.list().size());

		for (int i = 0; i < listComments.size(); i++) {
			System.out.println("### Impressão ###");
			System.out.println(listComments.get(i).getMessage() + " - " + listComments.get(i).getAuthor().getname());

			for (int j = 0; j < listComments.get(i).getResposta().size(); j++) {
				System.out.println(listComments.get(i).getResposta().get(j).getMessage() + " - "
						+ listComments.get(i).getResposta().get(j).getAuthor().getname());
			}
		}
	}
}
