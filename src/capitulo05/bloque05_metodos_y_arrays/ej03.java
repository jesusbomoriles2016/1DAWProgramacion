package capitulo05.bloque05_metodos_y_arrays;

import javax.swing.JOptionPane;

public class ej03 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int numEntero;
		int array[] = new int[] {5, 10, 15, 20, 25};
		
		System.out.println("Primer array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		  
		String str = JOptionPane.showInputDialog("Introduce el nuevo valor del array:");
		numEntero = Integer.parseInt(str);
				
		int array2[] = addInteger(array, numEntero);  
		
		System.out.println("Segundo array");
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
	
	/**
	 * 
	 * @param array
	 * @param numEntero
	 * @return
	 */
	public static  int [] addInteger (int array [], int numEntero) {
		int array2 [] = new int [array.length+1];
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
		array2[array.length] = numEntero;
		
		return array2;
	}	
}