package capitulo03;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo03_bloque01 {

	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
		Ejercicio3();
	}
	
	public static void Ejercicio1 () {
		
		int num, suma = 0;
		
		for (int i = 0; i < 4; i++) {
			String str = JOptionPane.showInputDialog("Introduce un número: ");
			num = Integer.parseInt(str);
			if (num > 10) {
				suma = suma + num;				
			}			
		}
		
		System.out.println("La suma de los números es: " + suma);
		
		
	}
	
	public static void Ejercicio2 () {
		
		int num, suma = 0, nNum;
		
		String str = JOptionPane.showInputDialog("Introduce el número de números a introducir: ");
		nNum = Integer.parseInt(str);
		
		for (int i = 0; i < nNum; i = i + 1) {
			String str1 = JOptionPane.showInputDialog("Introduce un número: ");
			num = Integer.parseInt(str1);
			if (num > 10) {
				suma = suma + num;				
			}			
		}
		
		System.out.println("La suma de los números es: " + suma);
	}
	
	public static void Ejercicio3 () {
		
		int contador_positivos = 0, contador_negativos = 0, nNumIntroducidos, numAIntroducir;
		
		String str = JOptionPane.showInputDialog("Introduce cuántos números quieres introducir: ");
		numAIntroducir = Integer.parseInt(str);
		
		for (int i = 0; i < numAIntroducir; i++) {
			
			String str1 = JOptionPane.showInputDialog("Introduce un número: ");
			nNumIntroducidos = Integer.parseInt(str1);
			
			if (nNumIntroducidos < 0) {
				contador_negativos = contador_negativos + 1;
			}
			else if (nNumIntroducidos > 0) {
				contador_positivos = contador_positivos + 1;
				
			}			
			
		}
		
		System.out.println("Has introducido " + contador_negativos + " números negativos");
		System.out.println("Has introducido " + contador_positivos + " números positivos");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
