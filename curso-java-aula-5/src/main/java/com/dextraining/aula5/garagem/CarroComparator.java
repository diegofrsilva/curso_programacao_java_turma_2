package com.dextraining.aula5.garagem;

import java.util.Comparator;

public class CarroComparator implements Comparator<Carro> {

	// marca, modelo, ano e preço.
	public int compare(Carro carro, Carro outroCarro) {
		int resultado = carro.getMarca().compareTo(outroCarro.getMarca());
		if (resultado == 0) {
			resultado = carro.getModelo().compareTo(outroCarro.getModelo());
		}
		if (resultado == 0) {
			resultado = carro.getAno() - outroCarro.getAno();
		}
		if (resultado == 0) {
			resultado = Double.compare(carro.getPreco(), outroCarro.getPreco());
		}
		return resultado;
	}
}
