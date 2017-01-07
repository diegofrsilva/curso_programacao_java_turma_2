package com.dextraining.area;

public class TestarCalculadorArea {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(5);
		Quadrado quadrado = new Quadrado(10);
		Retangulo retangulo = new Retangulo(10, 5);

		System.out.println(CalculadorArea.calcular(circulo));
		System.out.println(CalculadorArea.calcular(quadrado));
		System.out.println(CalculadorArea.calcular(retangulo));
	}
}
