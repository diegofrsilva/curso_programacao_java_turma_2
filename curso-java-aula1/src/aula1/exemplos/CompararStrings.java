package aula1.exemplos;

import java.util.Scanner;

public class CompararStrings {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		
		System.out.println("Informe o segundo nome: ");
		String segundoNome = scanner.nextLine();
		
		boolean resultado = primeiroNome.equalsIgnoreCase(segundoNome);
		System.out.println(resultado);
		
		scanner.close();
	}
}
