package br.com.dextraining.monitor;

import org.junit.Assert;
import org.junit.Test;

public class ExemploTest {

	@Test
	public void testarSoma() {
		int valor1 = 10;
		int valor2 = 20;
		int resultado = valor1 + valor2;

		Assert.assertEquals(30, resultado);
	}

	@Test
	public void testarSubtracao() {
	}
}
