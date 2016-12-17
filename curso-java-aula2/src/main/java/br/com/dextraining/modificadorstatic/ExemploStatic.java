package br.com.dextraining.modificadorstatic;

import java.util.Properties;

public class ExemploStatic {
	private static final int MINHA_CONSTANTE;
	private static int CONTADOR = 0;
	private static final Properties CONFIGURACAO;

	private String valorQualuqer;

	static {
		MINHA_CONSTANTE = 15;
		CONFIGURACAO = new Properties();
		CONTADOR = 150;
		System.out.println("Executando trecho statico");
	}

	public static void mostrarMensagem() {
		System.out.println("Chamando metodo " + CONTADOR);
	}

	public ExemploStatic() {
		System.out.println("Executando contrutor");
	}
}
