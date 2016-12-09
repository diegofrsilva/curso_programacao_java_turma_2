package aula1.exercicios;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor: ");
		int valor = scanner.nextInt();

		int quantidade100 = valor / 100;
		valor = valor % 100;

		int quantidade50 = valor / 50;
		valor = valor % 50;

		int quantidade20 = valor / 20;
		valor = valor % 20;

		int quantidade10 = valor / 10;
		valor = valor % 10;

		int quantidade05 = valor / 5;
		valor = valor % 5;

		if (valor != 0) {
			System.out.println("Impossivel sacar o valor!");
		} else {
			if (quantidade100 > 0) {
				System.out.println(quantidade100 + " nota(s) de R$100");
			}
			if (quantidade50 > 0) {
				System.out.println(quantidade50 + " nota(s) de R$50");
			}
			if (quantidade20 > 0) {
				System.out.println(quantidade20 + " nota(s) de R$20");
			}
			if (quantidade10 > 0) {
				System.out.println(quantidade10 + " nota(s) de R$10");
			}
			if (quantidade05 > 0) {
				System.out.println(quantidade05 + " nota(s) de R$5");
			}
		}
		scanner.close();
	}
}
