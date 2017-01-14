package com.dextraining.aula5.enums;

public class TestarEnums {

	public static void main(String[] args) {
		TipoPecaXadrez tipo = TipoPecaXadrez.BISPO;
		System.out.println(tipo.ordinal());

		TipoPecaXadrez[] values = TipoPecaXadrez.values();
		TipoPecaXadrez valorPosicao1 = values[1];
		TipoPecaXadrez valorPeao = TipoPecaXadrez.valueOf("PEAO");

		System.out.println(valorPosicao1);
		System.out.println(valorPosicao1.ordinal());
		System.out.println(valorPeao);
	}
}
