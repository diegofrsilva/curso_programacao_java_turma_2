package com.dextraining.folhapagamento;

public class FolhaPagamento {

	public double calcular(Funcionario... funcionarios) {
		double total = 0;

		for (Funcionario funcionario : funcionarios) {
			total += funcionario.getSalarioComBonificacao();
		}
		return total;
	}
}
