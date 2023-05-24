package util;

public class ConversorLetraValor {
	
	// Converte uma letra a seu valor correspondente
	// e um valor a sua letra correspondente:
	// a b c ... z
	// 1 2 3 ... 25
	
	public static char asLetra(int valor) {
		return (char) ((char) (valor%26) + 96);
	}
	
	public static int asValor(char letra) {
		return letra-96;
	}

}
