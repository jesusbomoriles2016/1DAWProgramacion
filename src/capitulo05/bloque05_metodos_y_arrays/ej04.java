package capitulo05.bloque05_metodos_y_arrays;

import javax.swing.JOptionPane;

public class ej04 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numBuscar;
		int array[] = new int[] {5, 10, 20, 27, 5};
		
		System.out.println("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String str = JOptionPane.showInputDialog("Introduce el número a buscar: ");
		numBuscar = Integer.parseInt(str);
		
		int numOcurrences = countOcurrences(array, numBuscar);
	
		System.out.println("Hay " + numOcurrences + " ocurrencias en el array");
	}
	
	/**
	 * 
	 * @param array
	 * @param numBuscar
	 * @return
	 */
	public static  int countOcurrences 	(int array [], int numBuscar) {
		int numOcurrences = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (numBuscar == array[i]) {
				numOcurrences = numOcurrences + 1;
			}
		}
		
		return numOcurrences;
	}
	
}