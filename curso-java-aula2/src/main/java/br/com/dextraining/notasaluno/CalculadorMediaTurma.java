package br.com.dextraining.notasaluno;

import java.util.Scanner;

public class CalculadorMediaTurma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade: ");
		int quantidadeAlunos = scanner.nextInt();
		Aluno alunos[] = new Aluno[quantidadeAlunos];

		for (int indiceAlunoAtual = 0; indiceAlunoAtual < quantidadeAlunos; indiceAlunoAtual++) {
			System.out.println("Nome: ");
			scanner.nextLine();
			Aluno aluno = new Aluno(scanner.nextLine());

			for (int indiceNota = 0; indiceNota < 3; indiceNota++) {
				System.out.println("Nota " + (indiceNota + 1) + ": ");
				aluno.notas[indiceNota] = scanner.nextDouble();
			}
			alunos[indiceAlunoAtual] = aluno;
		}
		for (Aluno aluno : alunos) {
			System.out.print(aluno.nome);

			for (double nota : aluno.notas) {
				System.out.print(" ");
				System.out.print(nota);
			}
			System.out.print(" ");
			System.out.print(aluno.getMedia());
			System.out.println();
		}
		scanner.close();
	}
}
