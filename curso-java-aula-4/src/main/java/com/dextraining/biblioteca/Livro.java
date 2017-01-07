package com.dextraining.biblioteca;

import java.util.Date;

public class Livro {

	private String autor;
	private String titulo;
	private Date dataPublicacao;
	private String codigo;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo
				+ ", dataPublicacao=" + dataPublicacao + ", codigo=" + codigo
				+ "]";
	}
}
