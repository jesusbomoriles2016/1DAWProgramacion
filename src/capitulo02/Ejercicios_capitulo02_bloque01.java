package capitulo02;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo02_bloque01 {
	
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
		int var1, var2;
		
		String str1 = JOptionPane.showInputDialog("Introduce la primera variable:");
		var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduce la segunda variable:");
		var2 = Integer.parseInt(str2);
		
		if (var1 > var2) {
			System.out.println("La variable 1 es mayor");
		}
		else if (var2 > var1) {
			System.out.println("La variable 2 es mayor");
		}
		else {
			System.out.println("Los números son iguales");
		}
		
	}
	
	public static void Ejercicio2 () {
		int var1, var2;
		
		String str1 = JOptionPane.showInputDialog("Introduce la primera variable:");
		var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduce la segunda variable:");
		var2 = Integer.parseInt(str2);
		
		if (var1 < var2) {
			System.out.println("La variable 1 es menor");
		}
		else if (var2 < var1) {
			System.out.println("La variable 2 es menor");
		}
		else {
			System.out.println("Los números son iguales");
		}
		
	}
	
	public static void Ejercicio3 () {
		int var1, var2, var3, var4, var5, mayor;
		
		String str1 = JOptionPane.showInputDialog("Introduce la primera variable: ");
		var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduce la segunda variable: ");
		var2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce la tercera variable: ");
		var3 = Integer.parseInt(str3);		
		String str4 = JOptionPane.showInputDialog("Introduce la cuarta variable: ");
		var4 = Integer.parseInt(str4);		
		String str5 = JOptionPane.showInputDialog("Introduce la quinta variable: ");
		var5 = Integer.parseInt(str5);		
		
		if (var1 > var2 && var1 > var3 && var1 > var4 && var1 > var5) {
			mayor = var1;
			System.out.println("El mayor es: " + mayor);			
		}
		if (var2 > var1 && var2 > var3 && var2 > var4 && var1 > var5) {
			mayor = var2;
			System.out.println("El mayor es: " + mayor);			
		}		
		if (var3 > var1 && var3 > var2 && var3 > var4 && var3 > var5) {
			mayor = var3;
			System.out.println("El mayor es: " + mayor);			
		}		
		if (var4 > var1 && var4 > var4 && var4 > var3 && var4 > var5) {
			mayor = var4;
			System.out.println("El mayor es: " + mayor);			
		}		
		if (var5> var1 && var5 > var2 && var5 > var3 && var5 > var4) {
			mayor = var5;
			System.out.println("El mayor es: " + mayor);			
		}		
	}
	
	public static void Ejercicio4 () {
		int var1, var2, var3, var4, var5, menor;
		
		String str1 = JOptionPane.showInputDialog("Introduce la primera variable: ");
		var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduce la segunda variable: ");
		var2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce la tercera variable: ");
		var3 = Integer.parseInt(str3);		
		String str4 = JOptionPane.showInputDialog("Introduce la cuarta variable: ");
		var4 = Integer.parseInt(str4);		
		String str5 = JOptionPane.showInputDialog("Introduce la quinta variable: ");
		var5 = Integer.parseInt(str5);		
		
		if (var1 < var2 && var1 < var3 && var1 < var4 && var1 < var5) {
			menor = var1;
			System.out.println("El menor es: " + menor);			
		}
		if (var2 < var1 && var2 < var3 && var2 < var4 && var1 < var5) {
			menor = var2;
			System.out.println("El menor es: " + menor);			
		}		
		if (var3 < var1 && var3 < var2 && var3 < var4 && var3 < var5) {
			menor = var3;
			System.out.println("El menor es: " + menor);			
		}		
		if (var4 < var1 && var4 < var4 && var4 < var3 && var4 < var5) {
			menor = var4;
			System.out.println("El menor es: " + menor);			
		}		
		if (var5 < var1 && var5 < var2 && var5 < var3 && var5 < var4) {
			menor = var5;
			System.out.println("El menor es: " + menor);			
		}		
		
	}	
	
	public static void Ejercicio5 () {
int var1, var2, var3, var4, var5, mayor, menor;
		
		String str1 = JOptionPane.showInputDialog("Introduce la primera variable: ");
		var1 = Integer.parseInt(str1);
		String str2 = JOptionPane.showInputDialog("Introduce la segunda variable: ");
		var2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce la tercera variable: ");
		var3 = Integer.parseInt(str3);		
		String str4 = JOptionPane.showInputDialog("Introduce la cuarta variable: ");
		var4 = Integer.parseInt(str4);		
		String str5 = JOptionPane.showInputDialog("Introduce la quinta variable: ");
		var5 = Integer.parseInt(str5);		
		
		if (var1 > var2 && var1 > var3 && var1 > var4 && var1 > var5) {
			mayor = var1;
			System.out.println("El mayor es: " + mayor);			
		}
		if (var2 > var1 && var2 > var3 && var2 > var4 && var1 > var5) {
			mayor = var2;
			System.out.println("El mayor es: " + mayor);			
		}		
		if (var3 > var1 && var3 > var2 && var3 > var4 && var3 > var5) {
			mayor = var3;
			System.out.println("El mayor es: " + mayor);			
		}		
		if (var4 > var1 && var4 > var4 && var4 > var3 && var4 > var5) {
			mayor = var4;
			System.out.println("El mayor es: " + mayor);			
		}		
		if (var5> var1 && var5 > var2 && var5 > var3 && var5 > var4) {
			mayor = var5;
			System.out.println("El mayor es: " + mayor);			
		}
		if (var1 < var2 && var1 < var3 && var1 < var4 && var1 < var5) {
			menor = var1;
			System.out.println("El menor es: " + menor);			
		}
		if (var2 < var1 && var2 < var3 && var2 < var4 && var1 < var5) {
			menor = var2;
			System.out.println("El menor es: " + menor);			
		}		
		if (var3 < var1 && var3 < var2 && var3 < var4 && var3 < var5) {
			menor = var3;
			System.out.println("El menor es: " + menor);			
		}		
		if (var4 < var1 && var4 < var4 && var4 < var3 && var4 < var5) {
			menor = var4;
			System.out.println("El menor es: " + menor);			
		}		
		if (var5 < var1 && var5 < var2 && var5 < var3 && var5 < var4) {
			menor = var5;
			System.out.println("El menor es: " + menor);			
		}			
	}	
	
	public static void Ejercicio6 () {
		int num1;
		String str1 = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str1);
		if (num1 % 2 == 0) {
			System.out.println("El número " + num1 + " es par");
		}
		else if (num1 % 2 == 1){
			System.out.println("El número " + num1 + " es impar");
		}				
	}	
	
	public static void Ejercicio7 () {
		int num1;
		String str1 = JOptionPane.showInputDialog("Introduce un número: ");
		num1 = Integer.parseInt(str1);
		if (num1 % 2 == 0 && num1 % num1 == 0) {
			System.out.println("El número es par");
		}
		else {
		System.out.println("El número es impar");	
		}
	}	
}