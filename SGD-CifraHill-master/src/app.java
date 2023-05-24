import util.CifradorHill;

public class app {
	
	public static void main(String[] args) {

//		String palavra = "testando";
		String palavracifrada = "oyzqxldc";
		
		int[][] key = {{-23, 1},
				   	   {1, 2}};
		
		int blocoSize = 2;
		
		CifradorHill encriptador = new CifradorHill(key, blocoSize);
		
		//Cifrar
//		String cifrado = encriptador.cifrar(palavra);
//		System.out.println("Palavra cifrada: "+cifrado);
		//Decifrar
		String decifrado = encriptador.decifrar(palavracifrada);
		System.out.println("Palavra decifrada: "+decifrado);
		
	}

}
