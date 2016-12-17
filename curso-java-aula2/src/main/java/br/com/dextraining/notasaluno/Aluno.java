package br.com.dextraining.notasaluno;

public class Aluno {
	private String nome;
	private double notas[];

	public Aluno(String nome) {
		this.setNome(nome);
		this.notas = new double[3];
	}

	public double getMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		if (notas.length != 3) {
			// lancar erro
		}
		this.notas = notas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
