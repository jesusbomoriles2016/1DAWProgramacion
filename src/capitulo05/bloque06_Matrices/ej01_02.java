package capitulo05.bloque06_Matrices;

import tutorialJava.Utils;

public class ej01_02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz [][] = new int [4][4];
		int min = 10, max = 50;
		
		matrizValoresAzar(matriz, min, max);
		muestraMatriz(matriz);
	}

	/**
	 * 
	 * @param matriz
	 * @param min
	 * @param max
	 */
	public static void matrizValoresAzar (int matriz[][], int min, int max){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar(min, max);
			}
		}	
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void muestraMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	
	}
}
