package com.dextraining.aula5.geradorsenha;

import java.util.ArrayList;
import java.util.List;

public class GeradorSenha {

	private int contadorSenhaPadrao;
	private int contadorSenhaIdoso;
	private int idososEmSequencia;

	private List<Integer> senhasPadrao;
	private List<Integer> senhasIdoso;

	public GeradorSenha() {
		this.senhasPadrao = new ArrayList<Integer>();
		this.senhasIdoso = new ArrayList<Integer>();

		this.contadorSenhaPadrao = 1;
		this.contadorSenhaIdoso = 1;
		this.idososEmSequencia = 0;
	}

	public String gerarSenhaPadrao() {
		String valorSenha = "P" + this.contadorSenhaPadrao;

		senhasPadrao.add(this.contadorSenhaPadrao);
		this.contadorSenhaPadrao++;

		return valorSenha;
	}

	public String gerarSenhaIdoso() {
		String valorSenha = "I" + this.contadorSenhaIdoso;

		senhasIdoso.add(this.contadorSenhaIdoso);
		this.contadorSenhaIdoso++;

		return valorSenha;
	}

	public String proximaSenha() {
		if (!senhasIdoso.isEmpty()) {
			if (idososEmSequencia >= 5 && !senhasPadrao.isEmpty()) {
				return proximaSenhaPadrao();
			}
			idososEmSequencia++;
			return "I" + senhasIdoso.remove(0);
		}
		if (!senhasPadrao.isEmpty()) {
			return proximaSenhaPadrao();
		}
		return null;
	}

	private String proximaSenhaPadrao() {
		idososEmSequencia = 0;
		return "P" + senhasPadrao.remove(0);
	}
}
