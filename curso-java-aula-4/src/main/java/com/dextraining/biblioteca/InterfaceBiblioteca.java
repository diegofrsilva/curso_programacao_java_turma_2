package com.dextraining.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InterfaceBiblioteca {

	public static void main(String[] args) throws ParseException {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);

		int opcao = mostrarMenu(scanner);
		while (opcao != 5) {
			if (opcao == 1) {
				cadastrarLivro(biblioteca, scanner);
			} else if (opcao == 2) {
				buscarLivro(biblioteca, scanner);
			} else if (opcao == 3) {
				removerLivro(biblioteca, scanner);
			} else if (opcao == 4) {
				listarLivros(biblioteca);
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
	}

	private static void listarLivros(Biblioteca biblioteca) {
		System.out.println("Livros cadastrados: ");
		for (Livro livro : biblioteca.getLivros()) {
			if (livro == null) {
				break;
			}
			System.out.println(livro);
		}
	}

	private static void removerLivro(Biblioteca biblioteca, Scanner scanner) {
		System.out.println("Codigo: ");
		String codigo = scanner.nextLine();

		boolean removeu = biblioteca.remove(codigo);
		if (removeu) {
			System.out.println("Livro removido com sucesso!");
		} else {
			System.out.println("Livro nao encontrado!");
		}
	}

	private static void buscarLivro(Biblioteca biblioteca, Scanner scanner) {
		System.out.println("Codigo: ");
		String codigo = scanner.nextLine();

		Livro livro = biblioteca.buscarLivro(codigo);
		if (livro != null) {
			System.out.println(livro);
		} else {
			System.out.println("Livro nao encontrado!");
		}
	}

	private static void cadastrarLivro(Biblioteca biblioteca, Scanner scanner)
			throws ParseException {
		Livro livro = new Livro();

		System.out.println("Autor: ");
		livro.setAutor(scanner.nextLine());

		System.out.println("Titulo: ");
		livro.setTitulo(scanner.nextLine());

		System.out.println("Data publicacao: ");
		livro.setDataPublicacao(lerData(scanner));

		System.out.println("Codigo: ");
		livro.setCodigo(scanner.nextLine());

		boolean adicionou = biblioteca.adicionar(livro);
		if (adicionou) {
			System.out.println("Livro adicionado com sucesso!");
		} else {
			System.out.println("Ja existe um livro com o codigo informado!");
		}
	}

	private static Date lerData(Scanner scanner) throws ParseException {
		String dataString = scanner.nextLine();
		Date dataPublicacao = 
				new SimpleDateFormat("dd/MM/yyyy")
				.parse(dataString);
		return dataPublicacao;
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Adicionar Livro");
		System.out.println("2. Buscar Livro");
		System.out.println("3. Remover Livro");
		System.out.println("4. Listar livros");
		System.out.println("5. Sair");

		int opcao = scanner.nextInt();
		scanner.nextLine();
		return opcao;
	}
}
