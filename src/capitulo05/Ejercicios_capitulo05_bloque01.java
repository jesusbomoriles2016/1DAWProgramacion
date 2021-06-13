package capitulo05;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo05_bloque01 {

	public static void main (String args[]) {
//		Ejercicio0();
//		Ejercicio1();
//		Ejercicio2();
//		Ejercicio3();
//		Ejercicio4();
		Ejercicio5();
	}
	
	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar 
	 * entre 0 y 100. Debes mostrar el array en pantalla y obtener la suma, la media, 
	 * el menor y el mayor de todos los números que aparecen en el array.
	 */
	public static void Ejercicio0 () {
		int suma = 0;
		int media = 0;
		int numMenor = 100;
		int numMayor = 0;
		int array[] = new int[150];
		for (int i = 0; i < array.length; i++) {
			int aux = (int) Math.round(Math.random() * 100);

			System.out.println(array[i] = aux);
			suma = suma + array[i];
			media = suma / 150;
			if (array[i] < numMenor) {
				numMenor = array[i];
			} else {
				if (array[i] > numMayor) {
					numMayor = array[i];
				}
			}
		}	
		
		System.out.println("El número mayor es: " + numMayor);
		System.out.println("El número menor es: " + numMenor);
		System.out.println("La suma de los números es: " + suma);
		System.out.println("La media de los números es: " + media);
		
	}
	
	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar 
	 * entre un límite inferior y uno superior que debe especificar el usuario. Debes 
	 * mostrar el array en pantalla para comprobar el funcionamiento
	 */
	public static void Ejercicio1 () {
		int limInf = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite inferior: "));
		int limSup = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite superior: "));
		int array[] = new int[150];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (limSup - limInf) + limInf);
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al 
	 * azar entre 0 y 100. Después de su inicialización debéis imprimir el array en orden inverso.
	 */
	public static void Ejercicio2 () {
		int array[] = new int[150];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.println(array[i]);
		}
		
	}
	
	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al 
	 * azar entre 0 y 100. A continuación pedirás al usuario un valor y buscarás 
	 * dicho valor en el array. Si lo encuentras, debes indicar al usuario la posición 
	 * del array en que se encuenta. En caso de que no encuentres el valor buscado, debes indicárselo también al usuario.
	 */
	public static void Ejercicio3 () {
		int array[] = new int[150];
		int contador = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			if (num == array[i]) {
				System.out.println(i);
				contador += 1;
			}
		}

		while (contador == 0) {
			System.out.println("El valor que no has introducido no está en el array");
			contador += 1;
		}
		
	}
	
	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes obtener la suma de 
	 * los números pares y los impares en variables separadas.
	 */
	public static void Ejercicio4 () {
		int array[] = new int[150];
		int numPar = 0;
		int numImpar = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			if (array[i] % 2 == 0) {
				numPar += array[i];
			} else {
				numImpar += array[i];
			}
		}

		System.out.println("La suma de los números pares es: " + numPar);
		System.out.println("La suma de los números impares es: " + numImpar);
		
	}
	
	/**
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. Debes mostrar al usuario la suma 
	 * de los elementos cuyo índice sea par.
	 */
	public static void Ejercicio5 () {
		int array[] = new int[150];
		int numPar = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			if (array[i] % 2 == 0) {
				numPar += array[i];
			}
		}
		
		System.out.println("La suma de los números pares es: " + numPar);
		
	}
	
}
