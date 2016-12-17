package br.com.dextraining.usuario;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraning.usuario.Usuario;

public class CriarUsuariosTest {

	@Test
	public void testarComSenhaValida() {
		String senhaValida = "123456789a";

		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);

		Assert.assertEquals(senhaValida, usuario.getSenha());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testarComSenhaInvalidaFaltandoNumero() {
		String senhaValida = "123456789a";
		String senhaInvalida = "aaaaaaaakloa";

		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);

		Assert.assertEquals(senhaValida, usuario.getSenha());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testarComSenhaInvalidaFaltandoLetra() {
		String senhaValida = "123456789a";
		String senhaInvalida = "111111111154654";

		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);

		Assert.assertEquals(senhaValida, usuario.getSenha());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testarComSenhaInvalidaMenosCaracteresQuePermitido() {
		String senhaValida = "123456789a";
		String senhaInvalida = "12a5";

		Usuario usuario = new Usuario();
		usuario.setNome("Fulano");
		usuario.setEmail("fulano@email.com");
		usuario.setSenha(senhaValida);
		usuario.setSenha(senhaInvalida);

		Assert.assertEquals(senhaValida, usuario.getSenha());
	}
}
