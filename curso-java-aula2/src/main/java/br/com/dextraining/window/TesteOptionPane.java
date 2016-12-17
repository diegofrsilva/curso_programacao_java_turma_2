package br.com.dextraining.window;

import javax.swing.JOptionPane;

public class TesteOptionPane {

	public static void main(String[] args) {
		String nome = JOptionPane
				.showInputDialog(null, "Informe seu nome");
		System.out.println(nome);
	}
}
