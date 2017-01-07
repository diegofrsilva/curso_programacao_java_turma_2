package com.dextraining.folhapagamento;

public abstract class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public double getSalarioComBonificacao() {
		return salario * (1 + getPorcentagemAdicional());
	}

	protected abstract double getPorcentagemAdicional();

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
}