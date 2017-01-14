package com.dextraining.aula5.garagem;

import java.util.Collection;

public interface Garagem {

	public boolean adicionar(Carro carro);

	public Carro buscar(String placa);

	public boolean vender(String placa);

	public Collection<Carro> getCarros();

}