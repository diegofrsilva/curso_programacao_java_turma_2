package com.dextraining.aula5.colecoes.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.dextraining.aula5.colecoes.list.Pessoa;

public class ExemploMap {

	public static void main(String[] args) {
		Map<String, Pessoa> pessoas = new HashMap<String, Pessoa>();

		pessoas.put("0000000000", new Pessoa("Diego", "0000000000"));
		pessoas.put("0000000001", new Pessoa("Juquinha", "0000000001"));
		pessoas.put("0000000000", new Pessoa("Diego 2", "0000000000"));
		pessoas.put("0000000002", new Pessoa("Diego 3", "0000000000"));

		pessoas.remove("0000000002");

		boolean containsKey = pessoas.containsKey("0000000000");
		System.out.println("0000000000 " + containsKey);

		// pessoas.get("0000000000");

		System.out.println("chaves: ");
		Set<String> chaves = pessoas.keySet();
		for (String chave : chaves) {
			System.out.println(chave);
		}
		System.out.println("valores: ");
		Collection<Pessoa> valores = pessoas.values();
		for (Pessoa pessoa : valores) {
			System.out.println(pessoa);
		}
		System.out.println("entrySet: ");
		Set<Entry<String, Pessoa>> entrySet = pessoas.entrySet();
		for (Entry<String, Pessoa> entry : entrySet) {
			System.out.println(entry.getKey() + " - " + 
					entry.getValue());
		}
	}
}