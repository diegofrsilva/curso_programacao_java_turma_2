package aula1.exemplos;

public class ExemploOperacoesAritmeticas {

	public static void main(String[] args) {
		int numero = 10;
		// int resultado = numero / 0;
		int resultadoDivisao = 5 / 2;
		int restoDivisao = 5 % 2;
		double valor = -5;
		double resultadoDivisaoDouble = valor / 0.0;

		System.out.println("resultadoDivisaoDouble: " + resultadoDivisaoDouble);
		System.out.println("resultadoDivisao: " + resultadoDivisao);
		System.out.println("restoDivisao: " + restoDivisao);
		// System.out.println(resultado);
	}
}
