package com.dextraining.aula5.garagem;

import java.util.Scanner;

public class InterfaceUsuarioGaragem {

	private static final int OPCAO_SAIR = 5;

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		Garagem garagem = new GaragemMapa();
		int opcao = mostrarMenu(leitor);
		while (opcao != OPCAO_SAIR) {
			if (opcao == 1) {
				adicionar(leitor, garagem);
			} else if (opcao == 2) {
				vender(leitor, garagem);
			} else if (opcao == 3) {
				buscar(leitor, garagem);
			} else if (opcao == 4) {
				listar(garagem);
			} else {
				System.out.println("\nOpcao invalida!\n");
			}
			opcao = mostrarMenu(leitor);
		}
		leitor.close();
	}

	private static void listar(Garagem garagem) {
		System.out.println("\nCarros encontrados: ");
		for (Carro carro : garagem) {
			System.out.println(carro);
		}
		System.out.println();
	}

	private static void buscar(Scanner leitor, Garagem garagem) {
		leitor.nextLine();
		String placa = leitor.nextLine();
		Carro carro = garagem.buscar(placa);
		if (carro == null) {
			System.out.println("\nCarro nao encontrado!\n");
		} else {
			System.out.println("\nCarro encontrado: ");
			System.out.println(carro);
			System.out.println();
		}
	}

	private static void vender(Scanner leitor, Garagem garagem) {
		leitor.nextLine();
		String placa = leitor.nextLine();

		boolean vendeu = garagem.vender(placa);
		if (vendeu) {
			System.out.println("\nVeiculo vendido com sucesso!\n");
		} else {
			System.out.println("\nVeiculo nao encontrado!\n");
		}
	}

	private static void adicionar(Scanner leitor, Garagem garagem) {
		leitor.nextLine();

		Carro carro = new Carro();

		System.out.println("Marca: ");
		carro.setMarca(leitor.nextLine());

		System.out.println("Modelo: ");
		carro.setModelo(leitor.nextLine());

		System.out.println("Ano: ");
		carro.setAno(leitor.nextInt());

		System.out.println("Preco: ");
		carro.setPreco(leitor.nextDouble());
		leitor.nextLine();

		System.out.println("Placa: ");
		carro.setPlaca(leitor.nextLine());

		boolean adicionou = garagem.adicionar(carro);
		if (adicionou) {
			System.out.println("\nCarro adicionado com sucesso!\n");
		} else {
			System.out.println("\nJá existe um carro com a placa informada!\n");
		}
	}

	private static int mostrarMenu(Scanner leitor) {
		System.out.println("1. Cadastrar");
		System.out.println("2. Vender");
		System.out.println("3. Buscar");
		System.out.println("4. Listar");
		System.out.println("5. Sair");

		return leitor.nextInt();
	}
}
