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
			String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
			num = Integer.parseInt(str);
			if (num > 10) {
				suma = suma + num;				
			}			
		}
		
		System.out.println("La suma de los n�meros es: " + suma);
		
		
	}
	
	public static void Ejercicio2 () {
		
		int num, suma = 0, nNum;
		
		String str = JOptionPane.showInputDialog("Introduce el n�mero de n�meros a introducir: ");
		nNum = Integer.parseInt(str);
		
		for (int i = 0; i < nNum; i = i + 1) {
			String str1 = JOptionPane.showInputDialog("Introduce un n�mero: ");
			num = Integer.parseInt(str1);
			if (num > 10) {
				suma = suma + num;				
			}			
		}
		
		System.out.println("La suma de los n�meros es: " + suma);
	}
	
	public static void Ejercicio3 () {
		
		int contador_positivos = 0, contador_negativos = 0, nNumIntroducidos, numAIntroducir;
		
		String str = JOptionPane.showInputDialog("Introduce cu�ntos n�meros quieres introducir: ");
		numAIntroducir = Integer.parseInt(str);
		
		for (int i = 0; i < numAIntroducir; i++) {
			
			String str1 = JOptionPane.showInputDialog("Introduce un n�mero: ");
			nNumIntroducidos = Integer.parseInt(str1);
			
			if (nNumIntroducidos < 0) {
				contador_negativos = contador_negativos + 1;
			}
			else if (nNumIntroducidos > 0) {
				contador_positivos = contador_positivos + 1;
				
			}			
			
		}
		
		System.out.println("Has introducido " + contador_negativos + " n�meros negativos");
		System.out.println("Has introducido " + contador_positivos + " n�meros positivos");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
