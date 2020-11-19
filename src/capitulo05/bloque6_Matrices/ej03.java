package capitulo05.bloque6_Matrices;

public class ej03 {

	public static void main(String[] args) {
		int matriz[][] = new int [][] { {1, 2, 3, 4},
										{5, 6, 7, 8},
										{9, 10, 11, 12},
										{13, 14, 15, 16},
										{17, 18, 19, 20}};
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("La matriz es positiva: " + matrizEsPositiva(matriz));		
	}
	
	public static boolean matrizEsPositiva (int matriz [][]) {
		boolean esPositiva = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					esPositiva = false;
				} 
			}
			
		}
		
		return esPositiva;
	}
	
}

