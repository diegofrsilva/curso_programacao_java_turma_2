package com.dextraining.aula5.exceptions;

public class CampoObrigatorioException extends Exception {

	private String campo;

	public CampoObrigatorioException(String campo) {
		this.campo = campo;
	}

	public String getCampo() {
		return campo;
	}
}