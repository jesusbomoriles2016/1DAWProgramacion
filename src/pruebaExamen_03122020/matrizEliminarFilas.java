package pruebaExamen_03122020;

public class matrizEliminarFilas {
	public static void main(String[] args) {
		int matriz[][]={{0,7,3,4,5},
						{4,5,0,2,3},
						{8,0,1,2,9},
						{0,3,9,0,0}};
		
	}
	
	/**
	 * 
	 * @param matriz
	 * @return matrizTraspuesta (int[][])
	 */
	public static int[][] matrizTranspuesta (int matriz[][]){
		int traspuesta[][] = new int [matriz[0].length][matriz.length];
		for(int i = 0; i < traspuesta.length; i++)
			for (int j = 0; j < traspuesta[i].length; j++)
				traspuesta[i][j] = matriz[i][j];
		return traspuesta;		
	}
	
	
}
