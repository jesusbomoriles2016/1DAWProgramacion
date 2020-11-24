package capitulo05.bloque06_Matrices;

public class ej05 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz [][] = new int [][] { {8, 8, 8},
										{0, 6, 9},
										{0, 0, 4}};
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	
		
		System.out.println("La matriz es triangular superior: " + matrizEsTriangularSuperior(matriz));
		
		
		
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean matrizEsTriangularSuperior (int matriz [][]) {
		boolean esTriangularSuperior = false;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					if (matriz[i][j] != 0 && matriz[i][j-1] == 0 && matriz[i][j+1] == 0) {
						esTriangularSuperior = true;
					}
				
				}
				
				
				
				
			}
			
		}
			
		return esTriangularSuperior;
	}

}
