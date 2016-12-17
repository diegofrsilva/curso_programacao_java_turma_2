package br.com.dextraining.biblioteca;

public class Biblioteca {

	private static final int MAX_LIVROS = 100;
	private Livro[] livros;
	private int quantidadeLivros;

	public Biblioteca() {
		this.livros = new Livro[MAX_LIVROS];
		this.quantidadeLivros = 0;
	}

	public boolean adicionar(Livro livro) {
		Livro livroEncontrado = buscar(livro.getCodigo());
		if (livroEncontrado != null) {
			return false;
		}
		livros[quantidadeLivros++] = livro;
		return true;
	}

	public Livro buscar(String codigo) {
		int indice = buscarIndice(codigo);
		if (indice >= 0) {
			return livros[indice];
		}
		return null;
	}

	private int buscarIndice(String codigo) {
		for (int i = 0; i < quantidadeLivros; i++) {
			Livro livro = livros[i];
			if (codigo.equals(livro.getCodigo())) {
				return i;
			}
		}
		return -1;
	}

	public boolean remover(String codigo) {
		int indice = buscarIndice(codigo);
		if (indice >= 0) {
			for (int i = indice; i < quantidadeLivros - 1; i++) {
				livros[i] = livros[i + 1];
			}
			livros[quantidadeLivros - 1] = null;
			quantidadeLivros--;
			return true;
		}
		return false;
	}

	public Livro[] listarLivros() {
		return livros;
	}
}
