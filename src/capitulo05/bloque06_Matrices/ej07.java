package capitulo05.bloque06_Matrices;

public class ej07 {

	public static void main(String[] args) {
		
		
		
		int matriz[][] = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9}
						};
		
		
		System.out.println("Array unidimensional de todos los elementos de la matriz:");
		
		unidimensional(matriz);

	}
	
	public static int[] unidimensional(int matriz[][]) {
		int valoresNumeros = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				valoresNumeros = valoresNumeros + 1;
			}
		}
		
		int array[] = new int[valoresNumeros];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[i] = matriz[i][j];
				System.out.print(array[i] + " ");
			}
		}
		
		return array;
	}

}
