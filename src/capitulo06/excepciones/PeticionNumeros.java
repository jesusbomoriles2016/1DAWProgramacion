package capitulo06.excepciones;

import javax.swing.JOptionPane;

public class PeticionNumeros {

	/**
	 * Implementa un programa que contenga una clase llamada "PeticionNumeros", con un método "pideNumeroPar()". 
	 * Desde un método "main()" llama al método anterior. Dentro del método "pideNumeroPar()" debes crear todo 
	 * lo necesario para disparar una Exception, creada por ti, cuando el número introducido no sea un número par.
	 * @param args
	 * @throws Excepcion1 
	 */
	public static boolean pideUnNumeroPar(int num, boolean fin) throws Excepcion1 {
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número par: "));
		if (num % 2 != 0) {
			throw new Excepcion1("\n ¡EXCEPCIÓN! \n El número introducido es impar " + num);

		} else {
			System.out.println("El número introducido es par " + num);
			fin = true;
			return fin;
		}
	}
	
	public static void main(String[] args) {
		boolean fin = true;
		
		try {
			do {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
				pideUnNumeroPar(num, fin);
			} while (fin == true);
		} catch (Excepcion1 e) {
			System.out.println(e.getMessage());
		}

	}

}


	