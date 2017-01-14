package com.dextraining.aula5.usuario;

import org.junit.Test;

import com.dextraining.aula5.exceptions.CampoObrigatorioException;

public class GerenciadorUsuarioTest {

	private GerenciadorUsuario gerenciadorUsuario = new GerenciadorUsuario();

	@Test(expected = CampoObrigatorioException.class)
	public void testarAdicionarSemNome() throws CampoObrigatorioException {
		Usuario usuario = new Usuario(null, "email@email.com", "123mudar");
		gerenciadorUsuario.adicionar(usuario);
	}

	@Test(expected = CampoObrigatorioException.class)
	public void testarAdicionarSemEmail() throws CampoObrigatorioException {
		Usuario usuario = new Usuario("Juquinha", null, "123mudar");
		gerenciadorUsuario.adicionar(usuario);
	}

	@Test(expected = CampoObrigatorioException.class)
	public void testarAdiconarSemSenha() throws CampoObrigatorioException {
		Usuario usuario = new Usuario("Juquinha", "email@email.com", null);
		gerenciadorUsuario.adicionar(usuario);
	}

	@Test
	public void testarValidacaoComUsuarioValido() throws UsuarioInvalidoException {
		gerenciadorUsuario.verificar("admin@email.com", "123mudar");
	}

	@Test(expected = UsuarioInvalidoException.class)
	public void testarValicacaoComEmailInvalido() throws UsuarioInvalidoException {
		gerenciadorUsuario.verificar("teste@email.com", "123mudar");
	}

	@Test(expected = UsuarioInvalidoException.class)
	public void testarValicacaoComSenhaInvalida() throws UsuarioInvalidoException {
		gerenciadorUsuario.verificar("admin@email.com", "321mudar");
	}
}
