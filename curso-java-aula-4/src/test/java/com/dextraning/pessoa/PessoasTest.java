package com.dextraning.pessoa;

import org.junit.Assert;
import org.junit.Test;

import com.dextraining.pessoa.Pessoa;
import com.dextraining.pessoa.PessoaFisica;
import com.dextraining.pessoa.PessoaJuridica;

public class PessoasTest {

	@Test
	public void testarCriacaoPessoaFisica() {
		PessoaFisica pessoaFisica = new PessoaFisica("Juquinha", "000000000000");
		Assert.assertEquals("Juquinha", pessoaFisica.getNome());

	}

	@Test
	public void testarCriacaoPessoaJuridica() {
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa qualquer",
				"0000", "qualquer");
		Assert.assertEquals("Empresa qualquer", pessoaJuridica.getNome());
	}

	@Test
	public void testarCriacaoPessoa() {
		Pessoa pessoa = new Pessoa("Juquinha");
		Assert.assertEquals("Juquinha", pessoa.getNome());
	}
}
