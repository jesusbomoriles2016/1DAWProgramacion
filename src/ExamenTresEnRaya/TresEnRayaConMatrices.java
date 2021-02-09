package ExamenTresEnRaya;

import javax.swing.JOptionPane;

public class TresEnRayaConMatrices {

	public static void main(String[] args) {
		/* Creamos la matriz*/
		int matriz [][] = new int [3][3];
		
		/* La rellenamos con 0*/
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz [i][j] = 0;
			}
		}
		
		/* Mostramos mensaje de bienvenida y las reglas*/
		
		System.out.println("BIENVENIDO A TRES EN RAYA: ");
		System.out.println("El que consiga conectar tres valores seguidos iguales, con turnos de 1 en 1, ganar�. El jugador 1 introducir� el valor 1 en la casilla, y el jugador 2 introducir� el valor 2.");

		/* Mostramos la matriz*/
		
		mostrarMatriz(matriz);
		
		int opcionElegidaJugador = Menu();
		
		
		
	}
	
	public static int Menu() {
		
		
		/* Mostramos las opciones disponibles*/
		System.out.println("\n" + "0. Abandonar el programa." + "\n" + "1. Jugador 1 introduce su jugada." + "\n" + "2. Jugador 2 introduce su jugada." + "\n");
		
		/* Pedimos que elija una opci�n. */
		String opcion = JOptionPane.showInputDialog("Introduce una opci�n: ");
		int eleccionJugador = Integer.parseInt(opcion); 
				
		
		return eleccionJugador;
	}
	
	public static void mostrarMatriz (int matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
