package capitulo05.bloque06_Matrices;

public class ej04 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz [][] = new int [][] { {8, 0, 0},
										{0, 6, 0},
										{0, 0, 4}};
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	
		
		System.out.println("La matriz es diagonal: " + matrizEsDiagonal(matriz));
		
		
		
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	public static boolean matrizEsDiagonal (int matriz [][]) {
		boolean esDiagonal = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					if (matriz[i][j] == 0) {
						esDiagonal = false;
					}
				
				}
				else if (matriz[i][j] != 0) {
					esDiagonal = false;	
				}
				
				
			}
			
		}
			
		return esDiagonal;
	}
	
}
