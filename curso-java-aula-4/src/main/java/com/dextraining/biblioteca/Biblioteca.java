package com.dextraining.biblioteca;

public class Biblioteca {

	private static final int MAX_LIVROS = 100;
	private Livro[] livros;
	private int quantidadeLivros;

	public Biblioteca() {
		this.livros = new Livro[MAX_LIVROS];
		this.quantidadeLivros = 0;
	}

	public boolean adicionar(Livro livro) {
		Livro livroEncontrado = buscarLivro(livro.getCodigo());
		if (livroEncontrado != null) {
			return false;
		}
		livros[quantidadeLivros++] = livro;
		return true;
	}

	public Livro buscarLivro(String codigo) {
		int indice = buscarIndice(codigo);
		if (indice > -1) {
			return livros[indice];
		}
		return null;
	}

	public boolean remove(String codigo) {
		int indice = buscarIndice(codigo);
		if (indice > -1) {
			for (int i = indice; i < quantidadeLivros - 1; i++) {
				livros[i] = livros[i + 1];
			}
			quantidadeLivros--;
			livros[quantidadeLivros] = null;
			return true;
		}
		return false;
	}

	private int buscarIndice(String codigo) {
		for (int i = 0; i < quantidadeLivros; i++) {
			Livro livro = livros[i];

			if (livro.getCodigo().equals(codigo)) {
				return i;
			}
		}
		return -1;
	}

	public Livro[] getLivros() {
		return livros;
	}
}
