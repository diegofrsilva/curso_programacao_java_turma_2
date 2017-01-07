package com.dextraning.equipamento;

import org.junit.Assert;
import org.junit.Test;

import com.dextraining.equipamento.Cadeira;
import com.dextraining.equipamento.Impressora;
import com.dextraining.equipamento.Televisao;

public class EquipamentoTest {

	@Test
	public void testarImpressora() {
		System.out.println(12);
		double preco = 200;
		Impressora impressora = new Impressora("HP", preco);
		Assert.assertEquals(Double.valueOf(preco),
				Double.valueOf(impressora.calcularPrecoFinal()));
	}

	@Test
	public void testarTelevisao() {
		double preco = 2000;
		Televisao televisao = new Televisao("Sony", preco, 32);
		Assert.assertEquals(Double.valueOf(preco),
				Double.valueOf(televisao.calcularPrecoFinal()));
	}

	@Test
	public void testarCadeira() {
		double preco = 20;
		Cadeira cadeira = new Cadeira("Cadeireira", preco);
		Assert.assertEquals(Double.valueOf(preco),
				Double.valueOf(cadeira.calcularPrecoFinal()));
	}
}
