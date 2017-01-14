package com.dextraining.aula5.colecoes.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.dextraining.aula5.colecoes.list.Pessoa;

public class ExemploSetPessoa {

	public static void main(String[] args) {
		Comparator<Pessoa> comparator = new PessoaPorCpfComparator();

		Set<Pessoa> pessoas = new TreeSet<Pessoa>(comparator);
		pessoas.add(new Pessoa("Zeferino", "133007025454"));
		pessoas.add(new Pessoa("Za", "233007025459"));
		pessoas.add(new Pessoa("Juquinha", "033007025455"));
		pessoas.add(new Pessoa("Diego", "033007025454"));
		pessoas.add(new Pessoa("Juquinha", "033007025454"));

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
