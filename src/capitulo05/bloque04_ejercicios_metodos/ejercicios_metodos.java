package capitulo05.bloque04_ejercicios_metodos;

import javax.swing.JOptionPane;


public class ejercicios_metodos {

	public static float media (int num1, int num2, int num3, float num4) {
		float resultado = (num1 + num2 + num3 + num4) / 4;
		return resultado;
		
	}
	
	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo (int min, int max) {
		int num = 0;
		
	do {
		String str = JOptionPane.showInputDialog("Introduce un número");
		num = Integer.parseInt(str);
		
	} while (num % 2 != 0 || num < min || num > max);
	
	return num;
	
	}
	
	public static int maximo (int num1, int num2) {
		int maximo;
		
		if (num1 >= num2) {
			maximo = num1;
		}
		
		else {
			maximo = num2;
					}
		
		return maximo;
		
		}
	
	public static int numeroImparEntreLimites (int limInf, int limSup) {
		int numero_aleatorio;
		
		do {numero_aleatorio = (int) Math.round(Math.random() * 100);
		
			} while (numero_aleatorio > limInf  || numero_aleatorio < limSup);
		
		return numero_aleatorio;
	}
	
	public static String getStringFromEntero (int num) {
		String numero = "El número debe estar entre 1 y 10.";
		switch (num) {
		case 1: {
			numero = "uno";
			break;
		}	
		case 2: {
			numero = "dos";
			break;
		}
		case 3: {
			numero = "tres";
			break;
		}
		case 4: {
			numero = "cuatro";
			break;
		}
		case 5: {
			numero = "cinco";
			break;
		}
		case 6: {
			numero = "seis";
			break;
		}
		case 7: {
			numero = "siste";
			break;
		}
		case 8: {
			numero = "ocho";
			break;
		}
		case 9: {
			numero = "nueve";
			break;
		}
		case 10: {
			numero = "diez";
			break;
		}
		}	
	
		return numero;
	}
	
	public static String imprimeMinimoAMaximo (int num1, int num2, int num3) {
		int mayor = 0, mediano = 0, menor = 0;
		
		if (num1 > num2 && num1 > num3) {
			mayor = num1;
			if (num2 > num3) {
				mediano = num2;
				menor = num3;
			}
			else {
				mediano = num3;
				menor = num2;}
		}
		
		if (num2 > num1 && num2 > num3) {
			mayor = num2;
			if (num1 > num3) {
				mediano = num1;
				menor = num3;
			}
			else {
				mediano = num3;
				menor = num1;}
		}
		
		if (num3 > num2 && num3 > num2) {
			mayor = num3;
			if (num1 > num1) {
				mediano = num1;
				menor = num2;
			}
			else {
				mediano = num2;
				menor = num1;
				}
		}
		
		String lista = menor +" " + mediano +" " + mayor+" "; 
		return lista;
		
	}
	
	public static int fibonacci(int num) {
		int array[] = new int[num];
		
		for (int i = 2; i < array.length; i++) {
			array[0] = 1;
			array[1] = 1;
			array[i] = array [i - 2] + array [i - 1];
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			System.out.println("");
		}
		return num;
		
	}
	
	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array [i]);
			System.out.println("");
		}	
	}
	
	public static void recursividad (int numero) {
		if (numero >= 1) {
		recursividad(numero - 1);
		System.out.println(numero);
		System.out.println("");		
		}
	}
	
}