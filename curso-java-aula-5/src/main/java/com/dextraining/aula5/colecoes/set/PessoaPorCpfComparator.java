package com.dextraining.aula5.colecoes.set;

import java.util.Comparator;

import com.dextraining.aula5.colecoes.list.Pessoa;

public class PessoaPorCpfComparator implements Comparator<Pessoa> {

	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return pessoa.getCpf().compareTo(outraPessoa.getCpf());
	}
}
