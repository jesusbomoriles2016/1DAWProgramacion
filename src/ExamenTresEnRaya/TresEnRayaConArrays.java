package ExamenTresEnRaya;

import javax.swing.JOptionPane;

public class TresEnRayaConArrays {

	public static void main(String[] args) {
		/* Creamos los arrays*/ 
		
		int array1 [] = new int [3];
		int array2 [] = new int [3];
		int array3 [] = new int [3];
		
		/* Mostramos mensaje de bienvenida y las reglas*/
		
		System.out.println("BIENVENIDO A TRES EN RAYA: ");
		
		System.out.println("El que consiga conectar tres valores seguidos iguales, con turnos de 1 en 1, ganará. El jugador 1 introducirá el valor 1 en la casilla, y el jugador 2 introducirá el valor 2.");
		
		/* Inicializamos el primer array  con los valores a 0*/
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = 0;
		}
		
		/* Inicializamos el segundo array con los valores a 0*/
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = 0;
		}
		
		/* Inicializamos el tercer array con los valores a 0*/
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = 0;
		}
		
		/* Mostramos los arrays*/
		mostrarArrays(array1, array2, array3);
		
		/* Creamos una variable booleana para cuando gane un jugador*/
		boolean tresEnRaya = false;
		
		/* Llamamos al menú*/
		
		do {
		int opcionElegidaJugador = Menu();

		
		
		if (opcionElegidaJugador == 0) {
			System.out.println("El programa ha terminado.");
			
		}	
		
		else if (opcionElegidaJugador == 1) {
			/* Pedimos la jugada al jugador1*/
			String filaJug1 = JOptionPane.showInputDialog("Introduce el número de fila: ");
			int eleccionFilajug1 = Integer.parseInt(filaJug1);
			String posicionEnFilaJug1 = JOptionPane.showInputDialog("Introduce el número de posición: ");
			int eleccionPosicionJug1 = Integer.parseInt(posicionEnFilaJug1);
			
			/* Introducimos las elecciones del jugador1 */
			switch (eleccionFilajug1) {
			/* Añadimos la posición en el array1 */
			case 1: {
				if (eleccionPosicionJug1 == 1 && array1[0] == 0) {
					array1[0] = 1;
				}
				
				else if (eleccionPosicionJug1 == 2 && array1[1] == 0) {
					array1[1] = 1;
				}
				
				else if (eleccionPosicionJug1 == 3 && array1[2] == 0){
					array1[2] = 1;
				}
				break;
			}
			
			/* Añadimos la posición en el array2 */
			case 2: {
				if (eleccionPosicionJug1 == 1 && array2[0] == 0) {
					array2[0] = 1;
				}
				
				else if (eleccionPosicionJug1 == 2 && array2[1] == 0) {
					array2[1] = 1;
				}
				
				else if (eleccionPosicionJug1 == 2 && array2[2] == 0) {
					array2[2] = 1;
				}
				break;
			}
			
			/* Añadimos la posición en el array3 */
			case 3: {
				if (eleccionPosicionJug1 == 1 && array3[0] == 0) {
					array3[0] = 1;
				}
				
				else if (eleccionPosicionJug1 == 2 && array3[1] == 0) {
					array3[1] = 1;
				}
				
				else if (eleccionPosicionJug1 == 2 && array3[2] == 0) {
					array3[2] = 1;
				}
				break;
			}
			}
		
			/* Mostramos los arrays*/
			mostrarArrays(array1, array2, array3);
			
		}
		
		else if (opcionElegidaJugador == 2) {
			/* Pedimos la jugada al jugador2*/
			String filaJug2 = JOptionPane.showInputDialog("Introduce el número de fila: ");
			int eleccionFilajug2 = Integer.parseInt(filaJug2);
			String posicionEnFilaJug2 = JOptionPane.showInputDialog("Introduce el número de posición: ");
			int eleccionPosicionJug2 = Integer.parseInt(posicionEnFilaJug2);
			
			/* Introducimos las elecciones del jugador2 */
			switch (eleccionFilajug2) {
			/* Añadimos la posición en el array1 */
			case 1: {
				if (eleccionPosicionJug2 == 1 && array1[0] == 0) {
					array1[0] = 2;
				}
				
				else if (eleccionPosicionJug2 == 2 && array1[1] == 0) {
					array1[1] = 2;
				}
				
				else if (eleccionPosicionJug2 == 3 && array1[2] == 0){
					array1[2] = 2;
				}
				break;
			}
			
			/* Añadimos la posición en el array2 */
			case 2: {
				if (eleccionPosicionJug2 == 1 && array2[0] == 0) {
					array2[0] = 2;
				}
				
				else if (eleccionPosicionJug2 == 2 && array2[1] == 0) {
					array2[1] = 2;
				}
				
				else if (eleccionPosicionJug2 == 2 && array2[2] == 0) {
					array2[2] = 2;
				}
				break;
			}
			
			/* Añadimos la posición en el array3 */
			case 3: {
				if (eleccionPosicionJug2 == 1 && array3[0] == 0) {
					array3[0] = 2;
				}
				
				else if (eleccionPosicionJug2 == 2 && array3[1] == 0) {
					array3[1] = 2;
				}
				
				else if (eleccionPosicionJug2 == 2 && array3[2] == 0) {
					array3[2] = 2;
				}
				break;
			}
			}
			
			/* Mostramos los arrays*/
			mostrarArrays(array1, array2, array3);
		}
		
		else {
			System.out.println("Elección no valida, el programa ha terminado");
			};
			
			
			/* Se repite el bucle hasta que cualquier jugador haya ganado */
		} while (tresEnRaya == false);
		
		
	}

	public static int Menu() {
		
		
		/* Mostramos las opciones disponibles*/
		System.out.println("\n" + "0. Abandonar el programa." + "\n" + "1. Jugador 1 introduce su jugada." + "\n" + "2. Jugador 2 introduce su jugada." + "\n");
		
		/* Pedimos que elija una opción. */
		String opcion = JOptionPane.showInputDialog("Introduce una opción: ");
		int eleccionJugador = Integer.parseInt(opcion); 
				
		
		return eleccionJugador;
	}
	
	public static void mostrarArrays (int array1 [], int array2 [], int array3 []) {
		/* Mostramos el primer array*/
		for (int i = 0; i == 0; i++) {
			System.out.println(array1[i] + "\t" + array1[i + 1] + "\t" + array1[i + 2]);
		}
		
		/* Mostramos el segundo array*/
		for (int i = 0; i == 0; i++) {
			System.out.println(array2[i] + "\t" + array2[i + 1] + "\t" + array2[i + 2]);
		}
		
		/* Mostramos el tercer array*/
		for (int i = 0; i == 0; i++) {
			System.out.println(array3[i] + "\t" + array3[i + 1] + "\t" + array3[i + 2]);
		}
	}
	
	public static boolean jugadorHaGanado(int array1[], int array2[], int array3[]) {
		boolean jugadorHaGanado = false;
		
		return jugadorHaGanado;
		
	}
	
}
