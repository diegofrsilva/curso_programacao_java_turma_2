package com.dextraining.aula5.geradorsenha;

import java.util.Scanner;

public class MenuGeradorSenha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		GeradorSenha geradorSenha = new GeradorSenha();
		int opcao = mostrarMenu(scanner);
		while (opcao != 4) {
			if (opcao == 1) {
				String senha = geradorSenha.gerarSenhaPadrao();
				System.out.println(senha);
			} else if (opcao == 2) {
				String senha = geradorSenha.gerarSenhaIdoso();
				System.out.println(senha);
			} else if (opcao == 3) {
				String senha = geradorSenha.proximaSenha();
				if (senha == null) {
					System.out.println("Nenhuma senha!");
				} else {
					System.out.println(senha);
				}
			}
			opcao = mostrarMenu(scanner);

		}
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Gerar senha padrão");
		System.out.println("2. Gerar senha idoso");
		System.out.println("3. Próxima senha");
		System.out.println("4. Sair");
		return scanner.nextInt();
	}
}
