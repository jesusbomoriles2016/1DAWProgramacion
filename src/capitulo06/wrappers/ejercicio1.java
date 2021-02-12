package capitulo06.wrappers;

public class ejercicio1 {

	
	/**
	 *  Realizar un programa que imprima una tabla con los límites máximo y mínimo representables para los diferentes tipos primitivos en Java (byte, int, short, long, float, double). En la tabla también deberá aparecer el número de bytes que cada tipo usa para su representación.

	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
		System.out.println("Valor máximo de byte: " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);
		System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo de short: " + Short.MIN_VALUE);
		System.out.println("Valor máximo de short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo de long: " + Long.MIN_VALUE);
		System.out.println("Valor máximo de long: " + Long.MIN_VALUE);
		System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
		System.out.println("Valor máximo de float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
		System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
	}
	
	

}
