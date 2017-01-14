package com.dextraining.aula5.colecoes.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploListaPessoa {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new Pessoa("Diego", "033021245421"));
		pessoas.add(new Pessoa("Diego", "033021245421"));
		pessoas.add(new Pessoa("Juquinha", "000000000000"));

		System.out.println(pessoas.size());
		System.out.println(pessoas.isEmpty());
		System.out.println("Index of: " + pessoas.indexOf(new Pessoa("Juquinha", "000000000000")));

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
}
