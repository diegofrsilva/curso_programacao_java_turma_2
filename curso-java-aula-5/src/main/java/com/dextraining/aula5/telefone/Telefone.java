package com.dextraining.aula5.telefone;

public class Telefone {

	private String numero;
	private TipoTelefone tipo;

	public Telefone(String numero, TipoTelefone tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public TipoTelefone getTipo() {
		return tipo;
	}
}