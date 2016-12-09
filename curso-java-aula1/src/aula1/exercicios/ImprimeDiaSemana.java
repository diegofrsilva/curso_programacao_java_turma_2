package aula1.exercicios;

import java.util.Scanner;

public class ImprimeDiaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o dia como inteiro: ");
		int dia = scanner.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Terca");
			break;
		case 3:
			System.out.println("Quarta");
			break;
		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia invalido!");
		}
		scanner.close();
	}
}
