	package capitulo03;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo03_bloque02 {

	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
		Ejercicio3();
		Ejercicio4();
	}	
	
	public static void Ejercicio1() {
		
		int numIntroducidos, mediaNum, num = 0, suma = 0;
		
		String str = JOptionPane.showInputDialog("Introduce cu�ntos n�meros vas a introducir: ");
		numIntroducidos = Integer.parseInt(str);
		for (int i = 0; i < numIntroducidos; i++) {
			String str1 = JOptionPane.showInputDialog("Introduce un n�mero: ");
			num = Integer.parseInt(str1);
			suma = suma + num;
		}
		
		mediaNum = suma / numIntroducidos;
		
		System.out.println("La media de los n�meros es: " + mediaNum);
	}
	
	public static void Ejercicio2() {
		
		int nNumeros, NumIntroducido = -1, mayor, menor;
		
		String str = JOptionPane.showInputDialog("Introduce la cantidad de n�meros: ");
		nNumeros = Integer.parseInt(str);
		
		mayor = NumIntroducido;
		menor = NumIntroducido;
		
		for (int i = 0; i < nNumeros; i++) {
			String str1 = JOptionPane.showInputDialog("Introduce un n�mero: ");
			NumIntroducido = Integer.parseInt(str1);
			if (NumIntroducido > mayor) {
				mayor = NumIntroducido;
			}
			
			else if (NumIntroducido < menor) {
				menor = NumIntroducido;
			}
		}
		
		System.out.println("El mayor es: " + mayor);
		System.out.println("El menor es: " + menor);
	}
	
	public static void Ejercicio3 () {
		int numIntroducido, multiplos = 0;
		
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero y te muestro sus m�ltiplos hasta 100: ");
		numIntroducido = Integer.parseInt(str);
		
		
		for (int i = 0; multiplos < 100; i++) {
			multiplos = i * numIntroducido;
			
			System.out.println("Los m�ltiplos son los siguientes: " + multiplos);
		}
		
	}
	
	public static void Ejercicio4 () {
		int numIntroducido, multiplos = 0, limite = 0;
		
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero y te muestro sus m�ltiplos hasta 100: ");
		numIntroducido = Integer.parseInt(str);
		
		String str1 = JOptionPane.showInputDialog("Introduce el l�mite: ");
		limite = Integer.parseInt(str1);

		
		for (int i = 0; multiplos < limite; i++) {
			multiplos = i * numIntroducido;
			
			System.out.println("Los m�ltiplos son los siguientes: " + multiplos);
		}
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

