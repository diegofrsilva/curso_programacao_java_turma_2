package com.dextraining.forma;

public class TestarFormas {

	public static void main(String[] args) {
		Forma triangulo = new Forma() {
			@Override
			public void desenhar() {
				System.out.println("Desenhando triangulo!");
			}
		};
		Forma circulo = new Circulo();
		Forma quadrado = new Quadrado();

		desenhar(triangulo, circulo, quadrado);
	}

	public static void desenhar(Forma... formas) {
		for (Forma forma : formas) {
			forma.desenhar();
		}
	}
}
