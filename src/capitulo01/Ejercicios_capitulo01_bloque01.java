package capitulo01;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo01_bloque01 {
	
	public static void main (String args[]) {
//		EjercicioEjemplo();
//		Ejercicio1();	
//		Ejercicio2();
//		Ejercicio3();
//		Ejercicio4();
//		Ejercicio5();
//		Ejercicio6();
//		Ejercicio7();
//		Ejercicio8();
	}
	
	public static void EjercicioEjemplo () {
		System.out.println("Hola Mundo"); // Imprime Hola Mundo
	}
	
	public static void Ejercicio1 () {
		int numEntero;
		float numFlotante;
		double numDoble;
		
		String str = JOptionPane.showInputDialog("Introduce un numero entero: ");
		numEntero = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un numero flotante: ");
		numFlotante = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Introduce un numero double: ");
		numDoble = Double.parseDouble(str);
		
		System.out.println("El valor de la variable numEntero es: " + numEntero +
				"\nEl valor de la variable numFlotante es: " + numFlotante +
				"\nEl valor de la variable numDouble es: " + numDoble);
	}	
	
	public static void Ejercicio2 () {
		int numEntero;
		float numFlotante;
		double numDoble;
		
		String str = JOptionPane.showInputDialog("Introduce un numero entero: ");
		numEntero = Integer.parseInt(str);
		System.out.println("El n�mero entero es: " + numEntero);

		String str2 = JOptionPane.showInputDialog("Introduce un numero flotante: ");
		numFlotante = Float.parseFloat(str2);
		System.out.println("El n�mero flotante es: " + numFlotante);
		
		String str3 = JOptionPane.showInputDialog("Introduce un numero doble: ");
		numDoble = Double.parseDouble(str3);
		System.out.println("El n�mero doble es: " + numDoble);
	}
	
	public static void Ejercicio3 () {
		int num1, num2, num3, suma;
		
		String str = JOptionPane.showInputDialog("Introduce el primer n�mero: ");
		num1 = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce el segundo n�mero: ");
		num2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce el tercer n�mero: ");
		num3 = Integer.parseInt(str3);
		suma = num1 + num2 + num3;
		
		System.out.println("La suma de los n�meros es: " + suma);
	}
	
	public static void Ejercicio4 () {
		int num1, num2, num3, media;
		
		String str = JOptionPane.showInputDialog("Introduce el primer n�mero: ");
		num1 = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce el segundo n�mero: ");
		num2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce el tercer n�mero: ");
		num3 = Integer.parseInt(str3);
		media = (num1 + num2 + num3) / 3 ;
		
		System.out.println("La media de los n�meros es: " + media);
	}
	
	public static void Ejercicio5 () {
		int var1, var2, varauxiliar;
		varauxiliar = 0;
		String str = JOptionPane.showInputDialog("Introduce la primera variable: ");
		var1 = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce la segunda variable: ");
		var2 = Integer.parseInt(str2);
		
		System.out.println("El valor de la primera variable es: " + var1);
		System.out.println("El valor de la segunda variable es: " + var2);
		
		varauxiliar = var2;
		var2 = var1;
		var1 = varauxiliar;
		
		System.out.println("El valor de la primera variable ha cambiado, ahora es: " + var1);
		System.out.println("El valor de la segunda variable ha cambiado, ahora es: " + var2);
		
	}
	
	public static void Ejercicio6 () {
		float Euribor, Diferencial, Capital, CuotaMensual, InMensual, InAnual;
		int NumPlazos;
		
		String str = JOptionPane.showInputDialog("Introduce el Euribor: ");
		Euribor = Float.parseFloat(str);
		String str2 = JOptionPane.showInputDialog("Introduce el Diferencial: ");
		Diferencial = Float.parseFloat(str2);
		String str3 = JOptionPane.showInputDialog("Introduce el Capital: ");
		Capital = Float.parseFloat(str3);
		String str4 = JOptionPane.showInputDialog("Introduce el N�mero de plazos: ");
		NumPlazos = Integer.parseInt(str4);
		
		InAnual = Euribor + Diferencial;
		InMensual = InAnual / 12 / 100;
		CuotaMensual = Capital * ((InMensual * (1 + InMensual) * NumPlazos) / (1 + InMensual) * NumPlazos - 1);
		
		System.out.println("El valor de la mensual es: " + CuotaMensual);
	}
	
	public static void Ejercicio7 () {
		
		int num1;
		String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
		num1 = Integer.parseInt(str);
		
		
		
	}
	
	public static void Ejercicio8 () {
		
		int num1, num2, num3, mayor, menor;
		mayor = 0;
		menor = 0;
		
		String str1 = JOptionPane.showInputDialog("Introduce el primer n�mero: ");
		num1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduce el segundo n�mero: ");
		num2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce el tercer n�mero: ");
		num3 = Integer.parseInt(str3);
		
		if (num1 > num2 && num1 > num3) {
			mayor = num1;
			if (num2 > num3) {
				menor = num3;
			}
			else {
				menor = num2;
			}
			
			System.out.println("El n�mero mayor es " + mayor);
			System.out.println("El n�mero menor es " + menor);			
		}
		
		else if (num2 > num1 && num2 > num3) {
			mayor = num2;
			if (num1 > num3) {
				menor = num3;
			}
			else {
				menor = num1;
			}
			
			System.out.println("El n�mero mayor es " + mayor);
			System.out.println("El n�mero menor es " + menor);			
		}

		else if (num3 > num1 && num3 > num2) {
			mayor = num3;
			if (num1 > num2) {
				menor = num2;
			}
			else {
				menor = num1;
			}
			
			System.out.println("El n�mero mayor es " + mayor);
			System.out.println("El n�mero menor es " + menor);			
		}
		
		else if (num1 == num2 && num1 == num3) {
			System.out.println("Los tres n�meros son iguales");
		}
		
	}

}