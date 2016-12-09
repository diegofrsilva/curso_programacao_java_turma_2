package aula1.exercicios;

import java.util.Scanner;

public class VerificarNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome: ");
		String nome = scanner.nextLine();

		System.out.println("Nota 1: ");
		double nota1 = scanner.nextInt();

		System.out.println("Nota 2: ");
		double nota2 = scanner.nextInt();

		System.out.println("Nota 3: ");
		double nota3 = scanner.nextInt();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >= 4) {
			System.out.println("Exame!");
		} else {
			System.out.println("Reprovado!");
		}
		scanner.close();
	}
}
