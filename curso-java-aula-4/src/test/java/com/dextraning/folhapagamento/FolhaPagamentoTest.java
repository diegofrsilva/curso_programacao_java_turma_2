package com.dextraning.folhapagamento;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.dextraining.folhapagamento.Diretor;
import com.dextraining.folhapagamento.FolhaPagamento;
import com.dextraining.folhapagamento.Gerente;
import com.dextraining.folhapagamento.Secretaria;
import com.dextraining.folhapagamento.Supervisor;

public class FolhaPagamentoTest {

	private FolhaPagamento folhaPagamento;

	@Before
	public void init() {
		folhaPagamento = new FolhaPagamento();
	}

	@Test
	public void testarSemFuncionarios() {
		double total = folhaPagamento.calcular();
		Assert.assertEquals(Double.valueOf(0), Double.valueOf(total));
	}

	@Test
	public void testarCalculoFolha() {
		Gerente gerente = new Gerente("Gerente", 100);
		Secretaria secretaria = new Secretaria("Secretaria", 100);
		Supervisor supervisor = new Supervisor("Supervisor", 100);
		Diretor diretor = new Diretor("Diretor", 100);

		double total = folhaPagamento.calcular(
				gerente, 
				secretaria, 
				supervisor,
				diretor);

		double totalEsperado = 115 + 110 + 100 + 125;
		Assert.assertEquals(
				Double.valueOf(totalEsperado),
				Double.valueOf(total));
	}
}
