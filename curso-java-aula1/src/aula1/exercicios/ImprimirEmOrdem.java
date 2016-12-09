package aula1.exercicios;

import java.util.Scanner;

public class ImprimirEmOrdem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int menor = 0, maior = 0;

		if (a > b) {
			maior = a;
			menor = b;
		} else {
			maior = b;
			menor = a;
		}
		if (c >= maior) {
			System.out.println(c + " " + maior + " " + menor);
		} else if (c >= menor) {
			System.out.println(maior + " " + c + " " + menor);
		} else {
			System.out.println(maior + " " + menor + " " + c);
		}
		scanner.close();
	}
}
