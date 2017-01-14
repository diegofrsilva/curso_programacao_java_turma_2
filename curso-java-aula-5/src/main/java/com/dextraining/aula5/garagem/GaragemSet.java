package com.dextraining.aula5.garagem;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GaragemSet implements Garagem {

	private Set<Carro> carros;

	public GaragemSet() {
		this.carros = new HashSet<Carro>();
	}

	public boolean adicionar(Carro carro) {
		return carros.add(carro);
	}

	public Carro buscar(String placa) {
		for (Carro carro : carros) {
			if (carro.getPlaca().equals(placa)) {
				return carro;
			}
		}
		return null;
	}

	public boolean vender(String placa) {
		Carro carroEncontrado = buscar(placa);
		if (carroEncontrado == null) {
			return false;
		}
		carros.remove(carroEncontrado);
		return true;
	}

	public Collection<Carro> getCarros() {
		return Collections.unmodifiableSet(carros);
	}
}
