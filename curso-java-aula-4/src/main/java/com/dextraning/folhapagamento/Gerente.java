package com.dextraning.folhapagamento;

public class Gerente extends Funcionario {

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	protected double getPorcentagemAdicional() {
		return 0.15;
	}
}
