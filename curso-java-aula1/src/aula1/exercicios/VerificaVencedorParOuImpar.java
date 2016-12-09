package aula1.exercicios;

import java.util.Scanner;

public class VerificaVencedorParOuImpar {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Jogador par: ");
		String jogadorPar = scanner.nextLine();
		
		System.out.println("Jogador Impar: ");
		String jogadorImpar = scanner.nextLine();

		System.out.println("Jogada par: ");
		int jogadaPar = scanner.nextInt();
		
		System.out.println("Jogada Impar: ");
		int jogadaImpar = scanner.nextInt();
		
		int soma = jogadaPar + jogadaImpar;
		boolean par = (soma % 2) == 0;
		String nomeVencedor = par ? jogadorPar : jogadorImpar;

		System.out.print("O resultado do jogo foi " + soma + ". ");
		System.out.print("O jogador " + nomeVencedor + " venceu!");

		scanner.close();
	}
}
