package com.dextraining.aula5.data;

public class Data {

	private int dia;
	private Mes mes;
	private int ano;

	public Data(int dia, Mes mes, int ano) {
		if (!mes.diaValido(dia, ano)) {
			throw new IllegalArgumentException("Data invalida!");
		}
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + (mes.ordinal() + 1) + "/" + ano;
	}
}
