package com.dextraining.aula5.data;

public enum Mes {
	JANEIRO(31), 
	FEVEREIRO(28) {
		@Override
		public boolean diaValido(int dia, int ano) {
			/* 
			 * Eh possivel reecrever o metodo para 
			 * um valor especifico 
			 **/
			return super.diaValido(dia, ano);
		}
	}, 
	MARCO(31), 
	ABRIL(30), 
	MAIO(31), 
	JUNHO(30), 
	JULHO(31), 
	AGOSTO(31), 
	SETEMBRO(30), 
	OUTUBRO(31), 
	NOVEMBRO(30), 
	DEZEMBRO(31);

	private Mes(int quantidadeDias) {
		this.quantidadeDias = quantidadeDias;
	}

	private int quantidadeDias;

	public boolean diaValido(int dia, int ano) {
		if (dia <= 0) {
			return false;
		}
		if (this == Mes.FEVEREIRO) {
			// TODO: VALIDAR SE ANO EH BISSEXTO
			// TODO: VERIFICAR QUANTIDADE DE DIAS EM ANO BISSEXTO
		}
		return dia <= quantidadeDias;
	}
}
