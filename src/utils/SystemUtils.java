package utils;

import java.util.Scanner;

public class SystemUtils {

	private static String readInput(String message) {
		Scanner input = new Scanner(System.in);
		System.out.println(message);

		return input.nextLine().trim();
	}

	public static String readComment() {
		return readInput("Digite o comentário");
	}

	public static boolean willContinue(String msg) {
		String continuar = "";

		while ((continuar.toUpperCase().compareTo("S") != 0) && (continuar.toUpperCase().compareTo("N") != 0)) {
			continuar = readInput(msg);
		}
		return continuar.toUpperCase().equals("S");
	}
}
