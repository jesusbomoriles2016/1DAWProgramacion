package pruebaExamen_03122020;

public class matrizSimetrica {
	public static void main(String[] args) {
		int matriz[][]={{0,7,0,4},
						{4,5,0,2},
						{0,-8,1,2},
						{0,3,9,0}};
		verificar(matrizEsSimetrica(matriz));		
	}
	
	
	/**
	 * Comprueba si una matriz es sim�trica.
	 * @param matriz
	 * @return
	 */
	public static boolean matrizEsSimetrica (int matriz[][]) {
		for(int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				if(matriz[i][j] != matriz[j][i])
					return false;
		return true;
	}
	

	/**
	 * Muestra si la matriz es o no positiva.
	 * @param wanda
	 */
	public static void verificar(boolean wanda) {
		if(wanda)
			System.out.println("La matriz es sim�trica");
		else
			System.out.println("La matriz no es sim�trica");
	}
	
	
}
