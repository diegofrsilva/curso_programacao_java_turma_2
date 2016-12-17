package br.com.dextraning.usuario;

public class Usuario {

	private String nome;
	private String email;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (!ValidadorSenha.validar(senha)) {
			throw new IllegalArgumentException("Senha invalida");
		}
		this.senha = senha;
	}
}
