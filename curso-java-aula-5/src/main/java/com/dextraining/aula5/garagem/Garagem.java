package com.dextraining.aula5.garagem;

import java.util.Collection;

public interface Garagem extends Iterable<Carro> {

	/**
	 * Metodo responsavel por adicionar um novo carro na colecao. Esse metodo
	 * nao deve permitir carros com placas duplicadas.
	 * 
	 * @param carro Carro a ser adicionado
	 * @return Retorna true caso o carro tenha sido adicionado e false caso
	 *         contrario.
	 */
	public boolean adicionar(Carro carro);

	public Carro buscar(String placa);

	public boolean vender(String placa);

	public Collection<Carro> getCarros();
}