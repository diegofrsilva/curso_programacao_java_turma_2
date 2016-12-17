package br.com.dextraning.usuario;

public class ValidadorSenha {

	public static boolean validar(String senha) {
		if (senha.length() < 5) {
			return false;
		}
		return contemLetra(senha) && contemNumero(senha);
	}

	private static boolean contemLetra(String senha) {
		for (char caractere : senha.toCharArray()) {
			if (Character.isLetter(caractere)) {
				return true;
			}
		}
		return false;
	}

	private static boolean contemNumero(String senha) {
		for (char caractere : senha.toCharArray()) {
			if (Character.isDigit(caractere)) {
				return true;
			}
		}
		return false;
	}
}
