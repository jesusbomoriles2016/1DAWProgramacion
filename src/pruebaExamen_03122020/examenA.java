package pruebaExamen_03122020;

import javax.swing.JOptionPane;

import tutorialJava.Utils;

public class examenA {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido al juego de los bolos");
		
		int arrayBolos [] = new int [10];
		
		
		for (int i = 0; i < arrayBolos.length; i++) {
			arrayBolos[i] = 1;
		}
		
		System.out.println();
		System.out.println(arrayBolos[0] + "\t" + arrayBolos[1] + "\t" + arrayBolos[2] + "\t" + arrayBolos[3] + "\n");
		System.out.println("    " + arrayBolos[4] + "       " + arrayBolos[5] + "       " + arrayBolos[6] + "\n");
		System.out.println("        " + arrayBolos[7] + "       " +arrayBolos[8] + "\n");
		System.out.println("            " + arrayBolos[9]);
		
		tirarBolos(arrayBolos);
		
	}
	
	public static void tirarBolos (int arrayBolos []) {
		int cantidadBolos = 0;
		
		for (int i = 0; i < arrayBolos.length; i++) {
			if (arrayBolos[i] == 1) {
				cantidadBolos++;
			}
		}
		
		do {
				String str = JOptionPane.showInputDialog("¿Quieres tirar los bolos?(0 para no, 1 para si)");		
				int respuestaTirarBolos = Integer.parseInt(str);
				
				if (respuestaTirarBolos == 0) {
					System.out.println("No has tirado la bola");
				}
				
				else if (respuestaTirarBolos == 1) {
					calcularBolosTirados(arrayBolos, cantidadBolos);
				}
				
				
				else {
					System.out.println("Introduce un número correcto");
				}
				
				System.out.println();
				System.out.println(arrayBolos[0] + "\t" + arrayBolos[1] + "\t" + arrayBolos[2] + "\t" + arrayBolos[3] + "\n");
				System.out.println("    " + arrayBolos[4] + "       " + arrayBolos[5] + "       " + arrayBolos[6] + "\n");
				System.out.println("        " + arrayBolos[7] + "       " +arrayBolos[8] + "\n");
				System.out.println("            " + arrayBolos[9]);

		
			} while (cantidadBolos > 0);	
	}
	
	public static void calcularBolosTirados (int arrayBolos [], int cantidadBolos) {
		
		for (int i = 0; i < arrayBolos.length; i++) {
				int numAzar = Utils.obtenerNumeroAzar(0, 100);
			
				if (numAzar > 50) {
					arrayBolos[i] = 0;
					cantidadBolos--;
				}
			
				else {
					arrayBolos[i] = 1;
				}
		}
	}	
	
}	