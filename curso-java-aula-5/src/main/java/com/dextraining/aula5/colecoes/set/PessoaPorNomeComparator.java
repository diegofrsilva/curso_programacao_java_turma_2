package com.dextraining.aula5.colecoes.set;

import java.util.Comparator;

import com.dextraining.aula5.colecoes.list.Pessoa;

public class PessoaPorNomeComparator implements Comparator<Pessoa> {

	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return pessoa.getNome().compareTo(outraPessoa.getNome());
	}
}
