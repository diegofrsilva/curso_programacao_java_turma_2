package br.com.dextraining.arrays;

import br.com.dextraining.conta.Conta;

public class ExemploUtilizacaoArray {

	public static void main(String[] args) {
		int tamanho = 5;
		int valores[] = new int[tamanho];
		int outrosValores[] = { 1, 2, 3, 4, 5 };
		Conta contas[] = new Conta[tamanho];

		valores[3] = 500;

		System.out.println("Conteudo de 'valores':");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + i + "]=" + valores[i]);
		}
		System.out.println("Conteudo de 'outrosValores':");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + i + "]=" + outrosValores[i]);
		}
		System.out.println("Conteudo de 'contas':");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("[" + i + "]=" + contas[i]);
		}
	}
}
