package com.dextraining.area;

public class Retangulo implements AreaCalculavel {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getArea() {
		return altura * largura;
	}
}
