package com.dextraining.aula5.telefone;

public class TestarTelefone {

	public static void main(String[] args) {
		Telefone telefone = new Telefone("123456789", TipoTelefone.COMERCIAL);
		Telefone telefone2 = new Telefone("123456789", TipoTelefone.RESIDENCIAL);

		TipoTelefone tipo = TipoTelefone.RESIDENCIAL;
		tipo.getMascara();

		TipoTelefone.fazAlgo();

		String numeroComMascara = TipoTelefone.COMERCIAL.aplicarMascara("12346");
		
		System.out.println(numeroComMascara);
		System.out.println(telefone);
		System.out.println(telefone2);
	}
}
