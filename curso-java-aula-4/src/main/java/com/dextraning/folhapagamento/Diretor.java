package com.dextraning.folhapagamento;

public class Diretor extends Funcionario {

	public Diretor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	protected double getPorcentagemAdicional() {
		return 0.25;
	}
}
