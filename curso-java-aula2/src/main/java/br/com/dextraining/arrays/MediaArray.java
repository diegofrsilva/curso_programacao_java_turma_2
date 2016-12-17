package br.com.dextraining.arrays;

import java.util.Scanner;

public class MediaArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantidade;

		System.out.println("Informe a quantidade de notas: ");
		quantidade = scanner.nextInt();

		int valores[] = new int[quantidade];
		int soma = 0;

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Informe valor " + i + ": ");
			valores[i] = scanner.nextInt();
		}
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		System.out.println(soma / valores.length);

		scanner.close();
	}
}
