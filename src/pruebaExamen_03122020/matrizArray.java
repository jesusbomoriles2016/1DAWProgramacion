package pruebaExamen_03122020;

public class matrizArray {
	public static void main(String[] args) {
		int matriz[][]={{0,7,3,4},
						{4,5,0,2},
						{0,0,1,2},
						{0,3,9,0}};
		

		int vector[] = matrizEnArray(matriz);
		System.out.println();

	}
	
	/**
	 * Transforma una matriz en un array
	 * @param matriz
	 * @return
	 */
	public static int[] matrizEnArray(int matriz[][]) {
		int tamanio = 0;	// tamaño del vector.
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0;j < matriz[i].length; j++)
				tamanio++;
		
		int array[] = new int [tamanio];
		int k = 0;
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++;
			}		
		return array;
	}
}
