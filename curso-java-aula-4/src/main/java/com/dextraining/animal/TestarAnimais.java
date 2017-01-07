package com.dextraining.animal;

public class TestarAnimais {

	public static void main(String[] args) {
		Jacare jacare = new Jacare();
		Baleia baleia = new Baleia();
		Humano humano = new Humano();

		Veterinario veterinario = new Veterinario();
		veterinario.examinar(jacare);
		veterinario.examinar(baleia);
		veterinario.examinar(humano);
		veterinario.examinar(veterinario);
	}
}
