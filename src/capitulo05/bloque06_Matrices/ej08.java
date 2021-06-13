package capitulo05.bloque06_Matrices;

public class ej08 {

	public static void main(String[] args) {
		
		int matriz[][] = {
				{5, 1, 3}, 
				{1, 8, 2},
				{3, 2, 1}
						};

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	


		System.out.println("¿La matriz es simétrica? " + esSimetrica(matriz));
	}

	public static boolean esSimetrica(int matriz[][]) {
		boolean esSimetrica = true;

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < i; j++) {
				if (matriz[j][i] != matriz[i][j] && i != j) {
					return esSimetrica = false;
				}
			}
		}

		return esSimetrica;
	}

}
