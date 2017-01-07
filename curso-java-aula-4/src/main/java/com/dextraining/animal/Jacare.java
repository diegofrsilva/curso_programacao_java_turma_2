package com.dextraining.animal;

public class Jacare extends Reptil implements AnimalExaminavel {

	@Override
	public void emitirSom() {
		System.out.println("Som do jacare");
	}

	public void examinar() {
		emitirSom();
	}
}
