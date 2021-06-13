package capitulo05.bloque06_Matrices;

public class ej10 {

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

	
		System.out.println("Matriz opuesta:");
		
		matriz = opuesta(matriz);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	

	}

	public static int[][] opuesta(int matriz[][]) {
		int opuesta[][] = new int [matriz.length][matriz.length];
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				opuesta[i][j] = matriz[i][j] * -1;
			}
		}
		
		return opuesta;
	}
	
}
