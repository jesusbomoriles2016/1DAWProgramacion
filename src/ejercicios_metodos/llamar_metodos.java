/*package ejercicios_metodos;

import javax.swing.JOptionPane;

public class llamar_metodos {

	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
//		Ejercicio3();
//		Ejercicio4();
// 		Ejercicio5();
//		Ejercicio6();
//		Ejercicio7();
//		Ejercicio8();
//		Ejercicio9();
//		Ejercicio10();
	}
		
	public static void Ejercicio1 () {
		
	int num1, num2, num3;
	float num4, resultado;
	
	String str = JOptionPane.showInputDialog("Introduce un número");
	num1 = Integer.parseInt(str);
	String str2 = JOptionPane.showInputDialog("Introduce un número");
	num2 = Integer.parseInt(str2);
	String str3 = JOptionPane.showInputDialog("Introduce un número");
	num3 = Integer.parseInt(str3);
	String str4 = JOptionPane.showInputDialog("Introduce un número");
	num4 = Float.parseFloat(str4);	
	
	
	resultado = ejercicios_metodos1.media(num1, num2, num3, num4);
		
	System.out.println(resultado);
	}
	
	public static void Ejercicio2 () {
		int limInf, limSup, numero;		
		String str = JOptionPane.showInputDialog("Introduce el límite inferior");
		limInf = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce el límite superior");
		limSup = Integer.parseInt(str2);
		
		numero = ejercicios_metodos1.obtenerNumeroDeUsuarioEntreMinimoYMaximo(limInf, limSup);
		
		System.out.println(numero + " es mayor o igual que " + limInf + " y menor o igual que que " + limSup);
	}
	
	public static void Ejercicio3 () {
		int num1, num2, maximo;
		
		String str = JOptionPane.showInputDialog("Introduce un número");
		num1 = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce otro número");
		num2 = Integer.parseInt(str2);
		
		maximo = ejercicios_metodos1.maximo(num1, num2);
		
		System.out.println("El número máximo es: " + maximo);
	}
	
	public static void Ejercicio4 () {
		int limInf, limSup, numAleatorio;
			
		String str = JOptionPane.showInputDialog("Introduce el límite inferior");
		limInf = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce el límite superior");
		limSup = Integer.parseInt(str2);
		
		numAleatorio = ejercicios_metodos1.numeroImparEntreLimites(limInf, limSup);
		
		System.out.println("El número aleatorio es " + numAleatorio + " y es impar y mayor que " + limInf + " y menor que " + limSup);
		
	}
	
	public static void Ejercicio5 () {
		int numero;
		
		String str = JOptionPane.showInputDialog("Introduce un número del 1 al 10");
		numero = Integer.parseInt(str);
		
		String letras = ejercicios_metodos1.getStringFromEntero(numero);
		
		System.out.println(letras);
		
	}
	
	public static void Ejercicio6 () {
		int num1, num2, num3;
		
		String str = JOptionPane.showInputDialog("Introduce el primer número");
		num1 = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce el segundo número");
		num2 = Integer.parseInt(str2);
		String str3 = JOptionPane.showInputDialog("Introduce el tercer número");
		num3 = Integer.parseInt(str3);
		
		String lista = ejercicios_metodos1.imprimeMinimoAMaximo(num1, num2, num3);
		System.out.println("El orden es el siguiente " + lista);
		
	}
	
	public static void Ejercicio7 () {
		int num1, fibonacci;
		
		String str = JOptionPane.showInputDialog("Introduce un número");
		num1 = Integer.parseInt(str);
		
		fibonacci = ejercicios_metodos1.fibonacci(num1);
		
		System.out.println(fibonacci);
		
	}
	
	public static void Ejercicio8 () {
		int array [] = {10, 20, 30};
		
		System.out.println(ejercicios_metodos1.imprimeArray(array));
		
	}
	
	public static void Ejercicio9 () {
		
		
	}
	
	public static void Ejercicio10 () {
	int numero = 100;
	System.out.println(ejercicios_metodos1.recursividad(numero));		
	}
}
*/