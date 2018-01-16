package utils;

import java.util.Scanner;

public class SystemUtils {

	private static String readInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);

		return input.nextLine().trim();
	}

	public static Integer optionMenu() {

		System.out.println("##### Escolha umas das opções abaixo #####");
		System.out.println("Opção 1 - Cadastrar menssagem");
		System.out.println("Opção 2 - Responder menssagem");
		System.out.println("Opção 3 - Listar menssagem e repostas");
		System.out.println("Opção 4 - --------------------");
		System.out.println("Opção 5 - Sair");
		System.out.println("_____________________________________");

		int opcao = Integer.parseInt(readInput("Digite aqui sua opção"));

		while (opcao < 1 || opcao > 5) {
			opcao = Integer.parseInt(readInput("Opção inválida,Digite novamente"));
		}

		return opcao;
	}

	public static String readComment() {
		return readInput("Insira um novo comentário.");
	}

	public static boolean willContinue() {
		final String continuar = readInput("Continuar? (S/N)");

		System.out.println(continuar.toUpperCase());
		if (!continuar.toUpperCase().equals("S") && !continuar.toUpperCase().equals("N")) {
			willContinue();
		}

		return continuar.equals("S");
	}
}
