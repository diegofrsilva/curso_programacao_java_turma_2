package com.dextraining.area;

public class Circulo implements AreaCalculavel {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.raio, 2);
	}
}
