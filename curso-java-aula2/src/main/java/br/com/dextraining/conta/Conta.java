package br.com.dextraining.conta;

public class Conta {

	private double saldo;

	public boolean sacar(double valor) {
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}

	public boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		saldo += valor;
		return true;
	}

	public double obterSaldo() {
		return saldo;
	}
}
