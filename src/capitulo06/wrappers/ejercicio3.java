package capitulo06.wrappers;

public class ejercicio3 {

	/**
	 * 3º.- Realizar un programa que imprima los 100 primeros números enteros en código hexadecimal.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 101; i++) {
			String hex = Integer.toHexString(i);
			System.out.println("El valor hexadecimal de " + i + " es: " + hex);
		}

	}

}
