package com.dextraining.animal;

public class Baleia extends Mamifero implements AnimalExaminavel {

	@Override
	public void emitirSom() {
		System.out.println("Som da baleia");
	}

	public void examinar() {
		emitirSom();
	}
}
