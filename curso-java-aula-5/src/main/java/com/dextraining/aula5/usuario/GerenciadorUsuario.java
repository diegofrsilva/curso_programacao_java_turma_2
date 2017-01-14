package com.dextraining.aula5.usuario;

import com.dextraining.aula5.exceptions.CampoObrigatorioException;

public class GerenciadorUsuario {

	public void adicionar(Usuario usuario) throws CampoObrigatorioException {

		if (usuario.getSenha() == null) {
			throw new CampoObrigatorioException("senha");
		}
		if (usuario.getEmail() == null) {
			throw new CampoObrigatorioException("email");
		}
		if (usuario.getNome() == null) {
			throw new CampoObrigatorioException("nome");
		}
//		throw new ErroConexaoException();
		// TODO: Salvar o usuario
	}

	public void verificar(String email, String senha)
			throws UsuarioInvalidoException {
		
		if (!"admin@email.com".equals(email) || !"123mudar".equals(senha)) {
			throw new UsuarioInvalidoException();
		}
	}
}
