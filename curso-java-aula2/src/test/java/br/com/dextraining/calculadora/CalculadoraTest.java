package br.com.dextraining.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calculadora = new Calculadora();

	@Test
	public void testarSoma() {
		double resultado = calculadora.somar(10, 15);
		Assert.assertEquals(Double.valueOf(25), Double.valueOf(resultado));
	}

	@Test
	public void testarSubtracao() {
		double resultado = calculadora.subtrair(10, 15);
		Assert.assertEquals(Double.valueOf(-5), Double.valueOf(resultado));
	}

	@Test
	public void testarDivisao() {
		double resultado = calculadora.dividir(20, 10);
		Assert.assertEquals(Double.valueOf(2), Double.valueOf(resultado));
	}

	@Test
	public void testarMultiplicacao() {
		double resultado = calculadora.multiplicar(20, 10);
		Assert.assertEquals(Double.valueOf(200), Double.valueOf(resultado));
	}
}
