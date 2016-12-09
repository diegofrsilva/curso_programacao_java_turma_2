package aula1.exemplos;

public class ExemploDeclaracaoVariaveis {

	public static void main(String[] args) {
		byte valorByte = 15;
		int meuInteiro = 10;
		long meuValorLong = 100;
		char charactere = 'a';
		float meuNumeroComPontoFlutuante = 10.15F;
		double meuNumeroDouble = 16.5;

		String minhaString = "Curso java";
		String outraString = "Curso java";
		minhaString = minhaString.toUpperCase();
		System.out.println(minhaString);

		char segundoCharacter = 30;

		System.out.println("segundoCharacter: " + segundoCharacter);
	}
}