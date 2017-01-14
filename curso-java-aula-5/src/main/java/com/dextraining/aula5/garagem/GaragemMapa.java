package com.dextraining.aula5.garagem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
		List<Carro> carrosOrdenados = new ArrayList<Carro>(carros.values());
		Collections.sort(carrosOrdenados, new CarroComparator());
		return carrosOrdenados;
	}

	public Iterator<Carro> iterator() {
		return getCarros().iterator();
	}
}
