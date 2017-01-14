package com.dextraining.aula5.colecoes.list;

import java.util.LinkedList;
import java.util.List;

public class ExemploListString {

	public static void main(String[] args) {
		List<String> minhaLista = new LinkedList<String>();

		minhaLista.add("Primeiro elemento");
		minhaLista.add("Segundo elemento");
		minhaLista.add("Terceiro elemento");
		minhaLista.add("Terceiro elemento");
		minhaLista.add("Terceiro elemento");
		minhaLista.add("Quarto elemento");

		minhaLista.add(1, "Novo elemento");

		System.out.println("Numero de elementos: " + minhaLista.size());
		System.out.println(minhaLista.remove("Terceiro elemento"));
		System.out.println("Numero de elementos: " + minhaLista.size());
		System.out.println(minhaLista.indexOf("Quarto elemento"));

		for (String valor : minhaLista) {
			System.out.println(valor);
		}
	}
}