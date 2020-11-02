package capitulo03;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo03_bloque03 {

	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
//		Ejercicio3();
//		Ejercicio4();
//		Ejercicio5();
//		Ejercicio6();
//		Ejercicio7();
	}	

	public static void Ejercicio1 () {
		int numeros, suma = 0;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			suma = numeros + suma;
			
			
		} while (numeros != 0);
		
		System.out.println("El programa ha terminado. La suma de los números es: " + suma);
		
		
	}

	public static void Ejercicio2 () {
		int numeros, media = 0, contador = 0, suma = 0;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			suma = numeros + suma;
			contador = contador + 1;
			media = suma / contador;
						
		} while (numeros != 0);
		
		System.out.println("El programa ha terminado. La media de los números es: " + media);
		
		
	}

	public static void Ejercicio3 () {
		int numeros = 0, mayor = numeros;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			if (numeros > mayor) {
				mayor = numeros;				
			}
						
		} while (numeros != 0);
		
		System.out.println("El programa ha terminado. El mayor de los números es: " + mayor);	
	}
	

	public static void Ejercicio4 () {
		int numeros = 0, menor = numeros;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			if (numeros < menor && numeros != 0) {
				menor = numeros;				
			}
						
		} while (numeros != 0);
		
		System.out.println("El programa ha terminado. El menor de los números es: " + menor);
	}
	
	public static void Ejercicio5 () {
		int mayor = 0, numeros = mayor, menor = mayor;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			if (numeros < menor && numeros != 0) {
				menor = numeros;				
			}
			
			else if (numeros > mayor && numeros != 0) {
				mayor = numeros;
			}
						
		} while (numeros != 0);
		
		System.out.println("El programa ha terminado.");
		System.out.println("El menor de los números es: " + menor);
		System.out.println("El mayor de los números es: " + mayor);
		
	}	
				
	public static void Ejercicio6 () {
		int numeros = 0;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			for (int i = 0; i <= 10; i++) {
				System.out.println(numeros + "*" + i + "=" + (numeros * i));
				System.out.print("");
			}			
			
		} while (numeros != 0);
		
	}
	
	public static void Ejercicio7 () {
		int numeros = 0, conPositivos = 0, conNegativos = 0;
		
		do {
			String str = JOptionPane.showInputDialog("Introduce un número (0 para terminar): ");
			numeros = Integer.parseInt(str);
			if (numeros < 0) {
				conNegativos = conNegativos + 1;
			}
			
			if (numeros > 0) {
				conPositivos = conPositivos + 1;
			}
			
		} while (numeros != 0);
		
		System.out.println("La cantidad de negativos es " + conNegativos);
		System.out.println("La cantidad de positivos es " + conPositivos);
		
	}
	
}
