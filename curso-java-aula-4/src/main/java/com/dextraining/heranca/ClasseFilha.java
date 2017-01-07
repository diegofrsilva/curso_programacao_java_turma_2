package com.dextraining.heranca;

public class ClasseFilha extends ClasseBase {

	@Override
	public void fazAlgumaCoisa() {
		System.out.println("fazAlgumaCoisa: classe filha");
		super.fazAlgumaCoisa();
	}
}
