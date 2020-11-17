package capitulo05.bloque05_metodos_y_arrays;

import javax.swing.JOptionPane;

public class ej5 {
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
		
		String str = JOptionPane.showInputDialog("Introduce el número a eliminar: ");
		numBuscar = Integer.parseInt(str);
		
		int array2[] = removeInteger(array, numBuscar);
		
		System.out.println(" ");
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
	
	/**
	 * 
	 * @param array
	 * @param numBuscar
	 * @return
	 */
	public static  int [] removeInteger (int array [], int numBuscar) {
		int numOcurrences = 0, aux = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (numBuscar == array[i]) {
				numOcurrences = numOcurrences + 1;
			}
		}
		
		int lonArray2 = array.length - numOcurrences;
		int array2[] = new int [lonArray2];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numBuscar) {
				aux = aux + 1;
			}
			
			else {
				array2[i - aux] = array[i];
			}
			
		}
		
		return array2;
	}
	
}