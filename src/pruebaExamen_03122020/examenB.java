package pruebaExamen_03122020;

import javax.swing.JOptionPane;

public class examenB {

	public static void main(String[] args) {
		System.out.println("Bienvenido a LA MÁQUINA DE LOS MILLONES");
		int array [] = new int [3];
		int numCasilla = 1;
		int acumulador = 0;
		menu();
		for (int i = 0; i < array.length; i++) {
			
			String str = JOptionPane.showInputDialog("Introduce un número del 1 al 4 para la casilla " + numCasilla);
			int num = Integer.parseInt(str);
		
			array[i] = num;
			numCasilla++;
		}
		
		if (array[0] == array[1] && array[0] == array[2]) {
			acumulador += 1000;
			if (array[0] == 4) {
				acumulador += 3000;
			}
		}
		
		System.out.println("Has obtenido: " + acumulador + " puntos");
	}
	
	public static void menu () {
		System.out.println("Opciones Tragaperras:" + "\n" + "1-Mora" + "\n" +  "2-Naranja" + "\n" + "3-Campana" + "\n" + "4-Dolar" + "\n");
	}

}
