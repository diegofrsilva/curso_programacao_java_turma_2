package com.dextraining.aula5.garagem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GaragemTest {

	private Garagem garagem;

	@Before
	public void before() {
		this.garagem = new GaragemMapa();
	}

	@Test
	public void testarAdicionarCarro() {
		Carro carro = criarCarro();
		Assert.assertTrue(garagem.adicionar(carro));
	}

	@Test
	public void testarAdicionarCarroDuplicado() {
		Carro carro = criarCarro();
		Carro outroCarro = criarCarro();

		Assert.assertTrue(garagem.adicionar(carro));
		Assert.assertFalse(garagem.adicionar(outroCarro));
	}

	@Test
	public void testarVenderCarro() {
		Carro carro = criarCarro();
		Assert.assertTrue(garagem.adicionar(carro));
		Assert.assertTrue(garagem.vender(carro.getPlaca()));
	}

	@Test
	public void testarVenderCarroInexistente() {
		Carro carro = criarCarro();
		Assert.assertTrue(garagem.adicionar(carro));
		Assert.assertFalse(garagem.vender("ABC-1234"));
	}

	@Test
	public void testarBuscarCarro() {
		Carro carro = criarCarro();
		Assert.assertTrue(garagem.adicionar(carro));
		Assert.assertNotNull(garagem.buscar(carro.getPlaca()));
	}

	@Test
	public void testarBuscarCarroInexistente() {
		Carro carro = criarCarro();
		Assert.assertTrue(garagem.adicionar(carro));
		Assert.assertNull(garagem.buscar("AAA-1234"));
	}

	@Test
	public void testarListarCarros() {
		Assert.assertTrue(garagem.adicionar(criarCarro("AAA-1230")));
		Assert.assertTrue(garagem.adicionar(criarCarro("AAA-1231")));
		Assert.assertTrue(garagem.adicionar(criarCarro("AAA-1232")));

		Assert.assertEquals(3, garagem.getCarros().size());
	}

	private Carro criarCarro() {
		Carro carro = new Carro();
		carro.setAno(1967);
		carro.setMarca("Shelby");
		carro.setModelo("GT-500");
		carro.setPlaca("HYQ-7777");
		carro.setPreco(500000);
		return carro;
	}

	private Carro criarCarro(String placa) {
		Carro carro = criarCarro();
		carro.setPlaca(placa);
		return carro;
	}
}
