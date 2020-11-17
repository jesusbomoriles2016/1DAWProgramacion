package capitulo05.bloque05_metodos_y_arrays;

import tutorialJava.Utils;

public class ej1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();
			}
		
		System.out.println(stringFromArray(array));
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static String stringFromArray (int array[]) {
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			str = str + " " + array [i];
		}		
		
		return str;
	}
	
}
