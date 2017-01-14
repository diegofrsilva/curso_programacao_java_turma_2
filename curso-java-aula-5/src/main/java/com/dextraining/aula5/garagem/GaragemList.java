package com.dextraining.aula5.garagem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GaragemList implements Garagem {

	private List<Carro> carros;

	public GaragemList() {
		this.carros = new ArrayList<Carro>();
	}

	public boolean adicionar(Carro carro) {
		Carro carroEncontrado = buscar(carro.getPlaca());
		if (carroEncontrado != null) {
			return false;
		}
		carros.add(carro);
		return true;
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
		Collections.sort(carros, new CarroComparator());
		return Collections.unmodifiableList(carros);
	}

	public Iterator<Carro> iterator() {
		return getCarros().iterator();
	}
}
