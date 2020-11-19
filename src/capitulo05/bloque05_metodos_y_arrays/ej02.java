package capitulo05.bloque05_metodos_y_arrays;

import javax.swing.JOptionPane;

public class ej02 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[] {5, 10, 15, 20, 25};
		int numBuscar, numReemplazar;
		System.out.println("Primer array: ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		String str = JOptionPane.showInputDialog("Introduce el número a cambiar: ");
		numBuscar = Integer.parseInt(str);
		
		String str1 = JOptionPane.showInputDialog("Introduce el número nuevo: ");
		numReemplazar = Integer.parseInt(str1);
		
		int array2[] = findAndReplace(array, numBuscar, numReemplazar);
		
		System.out.println("Segundo array");
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
	
	/**
	 * 
	 * @param array
	 * @param numBuscar
	 * @param numReemplazar
	 * @return
	 */
	public static  int [] findAndReplace (int array [], int numBuscar, int numReemplazar) {
		int array2 [] = new int [array.length];
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == numBuscar) {
				array2[i] = numReemplazar;
			}
		}
		return array2;
	}
		
}