package capitulo05.bloque06_Matrices;

public class ej06 {

	public static void main(String[] args) {
		int matriz [][] = new int [][] { 
			{8, 0, 0},
			{0, 6, 0},
			{0, 0, 4}};

		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
		System.out.print(matriz[i][j] + " ");
		}
		System.out.println("");
		}	
		
		System.out.println("La matriz es dispersa: " + matrizEsDispersa(matriz) );		
		
	}
	
	
	public static boolean matrizEsDispersa(int matriz[][]) {
		boolean dispersa = true;
		int contador = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					contador = contador + 1;
				}
			}
			if (contador >= 1) {
				contador = 0;
			} else {
				dispersa = false;
			}
		}
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[j][i] == 0) {
					contador = contador + 1;
				}
			}
			
			if (contador >= 1) {
				contador = 0;
			} else {
				dispersa = false;
			}
			
		}

		return dispersa;

	}
	
}
