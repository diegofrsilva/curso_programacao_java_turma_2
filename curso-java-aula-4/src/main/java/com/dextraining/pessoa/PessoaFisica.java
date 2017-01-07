package com.dextraining.pessoa;

import java.util.Date;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String rg;
	private Date dataNascimento;

	public PessoaFisica(String nome) {
		super(nome);
	}

	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String cpf, String rg, Date dataNascimento) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
