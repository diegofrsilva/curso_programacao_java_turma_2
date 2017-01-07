package com.dextraining.equipamento;

public class Equipamento {

	private String fabricante;
	private double preco;

	public Equipamento(String fabricante, double preco) {
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public double calcularPrecoFinal() {
		return preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
