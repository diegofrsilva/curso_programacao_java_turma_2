package com.dextraining.aula5.usuario;

import com.dextraining.aula5.exceptions.CampoObrigatorioException;

public class TestarUsuario {

	public static void main(String[] args) {
		GerenciadorUsuario gerenciador = new GerenciadorUsuario();
		adicionar(gerenciador);
		// verificar(gerenciador);
	}

	private static void verificar(GerenciadorUsuario gerenciador) {
		try {
			gerenciador.verificar("admisn@email.com", "123mudar");
			System.out.println("Usuario valido!");
		} catch (UsuarioInvalidoException e) {
			System.out.println("Usuario invalido!");
			e.printStackTrace();
		}
	}

	private static void adicionar(GerenciadorUsuario gerenciador) {
		Usuario usuario = new Usuario("Juquinha", "email@email.com", "abc123");
		try {
			gerenciador.adicionar(usuario);
			System.out.println("Usuario adicionado com sucesso!");
		} catch (CampoObrigatorioException e) {
			System.out.println("Erro no campo: " + e.getCampo());
		} catch (Exception e) {
			System.out.println("Erro generico: " + e.getMessage());
		} finally {
			System.out.println("Liberando recursos!");
		}
		System.out.println("Finalizando... ");
	}
}
