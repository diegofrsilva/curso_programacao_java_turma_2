package com.dextraining.animal;

public class TestarAnimais {

	public static void main(String[] args) {
		Object qualquer = new Humano();
		Jacare jacare = new Jacare();
		AnimalExaminavel baleia = new Baleia();

		if (qualquer instanceof AnimalExaminavel) {
			AnimalExaminavel examinavel = (AnimalExaminavel) qualquer;
			System.out.println("eh animal examinavel! " + examinavel.getClass());
		}

		Veterinario veterinario = new Veterinario();
		veterinario.examinar(jacare);
		veterinario.examinar(baleia);
		// veterinario.examinar(humano);
		// veterinario.examinar(veterinario);
	}
}
