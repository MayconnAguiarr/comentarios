package main;

import utils.SystemUtils;

public class Principal {

	public static void main(String[] args) {

		int opcao = SystemUtils.optionMenu();

		switch (opcao) {
		case 1:
			case1();
			break;
		case 5:
			System.exit(0);
			break;
		default:

		}

	}

	private static void case1() {

		boolean Continue = true;

		while (Continue) {
			String comentario = SystemUtils.readComment();
			System.out.println(comentario);
			Continue = SystemUtils.willContinue();
		}
	}
}
