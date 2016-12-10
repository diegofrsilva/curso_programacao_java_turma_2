package br.com.dextraining.conta;

import java.util.Scanner;

public class MenuConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = mostrarMenu(scanner);

		Conta conta = new Conta();

		while (opcao != 4) {
			if (opcao == 1) {
				sacar(scanner, conta);
			} else if (opcao == 2) {
				depositar(scanner, conta);
			} else if (opcao == 3) {
				System.out.println("Seu saldo eh: " + conta.obterSaldo());
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
	}

	private static void depositar(Scanner scanner, Conta conta) {
		System.out.println("Valor do deposito: ");
		double valor = scanner.nextDouble();
		boolean depositou = conta.depositar(valor);

		if (depositou) {
			System.out.println("Deposito realizado com sucesso!");
		} else {
			System.out.println("Valor de deposito invalido!");
		}
	}

	private static void sacar(Scanner scanner, Conta conta) {
		System.out.println("Valor do saque: ");
		double valor = scanner.nextDouble();
		boolean sacou = conta.sacar(valor);

		if (sacou) {
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saque insuficiente!");
		}
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		System.out.println("3. Ver saldo");
		System.out.println("4. Sair");
		return scanner.nextInt();
	}
}
