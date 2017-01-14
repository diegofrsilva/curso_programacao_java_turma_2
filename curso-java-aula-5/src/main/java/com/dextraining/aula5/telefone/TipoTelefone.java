package com.dextraining.aula5.telefone;

public enum TipoTelefone {
	RESIDENCIAL("(XX) RXXX-XXXX"), 
	COMERCIAL("(XX) CXXXX-XXXX");

	private String mascara;

	TipoTelefone(String mascara) {
		this.mascara = mascara;
	}

	public String getMascara() {
		return mascara;
	}

	public String aplicarMascara(String numero) {
		return numero + mascara;
	}

	public static void fazAlgo() {
	}
}
