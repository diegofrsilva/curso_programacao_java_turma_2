package com.dextraining.aula5.garagem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GaragemMapa implements Garagem {

	private Map<String, Carro> carros;

	public GaragemMapa() {
		this.carros = new HashMap<String, Carro>();
	}

	public boolean adicionar(Carro carro) {
		if (carros.containsKey(carro.getPlaca())) {
			return false;
		}
		carros.put(carro.getPlaca(), carro);
		return true;
	}

	public Carro buscar(String placa) {
		return carros.get(placa);
	}

	public boolean vender(String placa) {
		return carros.remove(placa) != null;
	}

	public Collection<Carro> getCarros() {
		return carros.values();
	}
}
