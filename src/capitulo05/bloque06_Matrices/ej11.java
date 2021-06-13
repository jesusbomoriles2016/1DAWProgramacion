package capitulo05.bloque06_Matrices;

import javax.swing.JOptionPane;

public class ej11 {

	public static void main(String[] args) {
		
		int matriz[][] = {
				{1, 8, 1}, 
				{2, 1, 1},
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
		
		String str = JOptionPane.showInputDialog("Introduce la fila a eliminar de la matriz");
		int numFila = Integer.parseInt(str) - 1;
	
		System.out.println("Matriz sin la fila eliminada:");
		
		matriz = eliminarFilaMatriz(matriz, numFila);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}	

	}

	public static int[][] eliminarFilaMatriz(int matriz[][], int numFila) {
		int nuevaMatriz[][];
		if(numFila < matriz.length)	
			 nuevaMatriz = new int [matriz.length -1][matriz[0].length];
		else
			nuevaMatriz = new int [matriz.length][matriz[0].length];	
		
		for(int i = 0, k = 0; i < matriz.length; i++) {	
			if(i != numFila) {	
				for (int j = 0; j < matriz[i].length; j++) {
					nuevaMatriz[k][j] = matriz[i][j];  
				}
			k++;
			}
		}
		return nuevaMatriz;			
		
	}	
	

}