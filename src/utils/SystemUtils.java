package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Author;

public class SystemUtils {

	private static String readInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);

		return input.nextLine().trim();
	}

	public static Integer optionMenu() {

		System.out.println("##### Escolha umas das opções abaixo #####");
		System.out.println("Opção 1 - Cadastrar menssagem");
		System.out.println("Opção 2 - Listar menssagem e repostas");
		System.out.println("Opção 3 - Sair");
		System.out.println("_____________________________________");

		int opcao = Integer.parseInt(readInput("Digite aqui sua opção"));

		while (opcao < 1 || opcao > 3) {
			opcao = Integer.parseInt(readInput("Opção inválida,Digite novamente"));
		}

		return opcao;
	}
	

	public static String readComments(String msg) {
		return readInput(msg);
	}	
	
	public static boolean willContinue(String msg) {
		String continuar = readInput(msg);

		if ((continuar.toUpperCase().compareTo("S") != 0) && (continuar.toUpperCase().compareTo("N") != 0)) {
			willContinue(msg);
		}
		System.out.println(continuar.toUpperCase());
		return continuar.toUpperCase().equals("S");
	}
}
