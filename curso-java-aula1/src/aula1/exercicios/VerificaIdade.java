package aula1.exercicios;

import java.util.Scanner;

public class VerificaIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner.useLocale(Locale.ENGLISH);

		System.out.println("Informe a idade: ");
		int idade = scanner.nextInt();
		String mensagem = idade >= 18 ? "Maior de 18 anos" : "Menor de 18 anos";
		System.out.println(mensagem);
		// System.out.println(idade >= 18 ? "Maior de 18 anos" :
		// "Menor de 18 anos");
		scanner.close();
	}
}
