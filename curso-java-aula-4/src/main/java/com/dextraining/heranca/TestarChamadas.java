package com.dextraining.heranca;

public class TestarChamadas {

	public static void main(String[] args) {
		ClasseBase objetoBase = new ClasseBase();
		objetoBase.fazAlgumaCoisa();
		
		ClasseFilha objeto = new ClasseFilha();
		objeto.fazAlgumaCoisa();
	}
}
