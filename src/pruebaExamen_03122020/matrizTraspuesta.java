package pruebaExamen_03122020;

public class matrizTraspuesta {
	public static void main(String[] args) {
		int matriz[][]={{-3,7,-3,4},
						{4,5,0,2},
						{-7,0,0,2},
						{-8,3,9,2}};

	}
	
	/**
	 * Elimina una fila con el n�mero que le mandamos
	 * @param matriz
	 * @param filaEliminar
	 * @return	matriz sin la fila elegida.
	 */
	public static int[][] eliminarUnaFilaMatriz (int matriz[][], int filaEliminar){
		int nuevaMatriz[][];
		if(filaEliminar < matriz.length)	//si filaEliminar es posible hace esto
			 nuevaMatriz = new int [matriz.length -1][matriz[0].length];
		else
			nuevaMatriz = new int [matriz.length][matriz[0].length];	//para no salirse del rango hace esto
		
		for(int i = 0, k = 0; i < matriz.length; i++) {	
			if(i != filaEliminar) {	//condici�n para no copiar la fila que no queremos
				for (int j = 0; j < matriz[i].length; j++) {
					nuevaMatriz[k][j] = matriz[i][j];  //copiamos la matriz
				}
			k++;
			}
		}
		return nuevaMatriz;		//Devolvemos la matriz sin la fila
	}
}
