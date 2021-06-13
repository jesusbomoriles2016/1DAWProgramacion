package capitulo05.bloque06_Matrices;

public class ej09 {

	public static void main(String[] args) {
		
		int matriz[][] = {
				{1, 8, 1}, 
				{2, 1, 1},
				{1, 1, 1}
						};

		System.out.println("Matriz:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	

	
		System.out.println("Matriz traspuesta:");
		
		matriz = traspuesta(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	

	}

	public static int[][] traspuesta(int matriz[][]) {
		int traspuesta[][] = new int[matriz.length][matriz.length];

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				traspuesta[i][j] = matriz[j][i];
			}
		}
		return traspuesta;
		
	}	
	

}
