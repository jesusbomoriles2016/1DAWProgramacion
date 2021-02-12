package capitulo06.wrappers;

import javax.swing.JOptionPane;

public class ejercicio2 {

	/**
	 * 2º.- Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
         - Al menos una mayúscula.
         - Al menos una minúscula.
         - Al menos un dígito
         - Al menos un carácter no alfanumérico.
       El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean Mayuscula = false;
		boolean Minuscula = false;
		boolean Digito = false;
		boolean CaracterNoAlfanumerico = false;
		
		do {
			String contraseña = JOptionPane.showInputDialog("Introduce una contraseña con al menos una mayúscula, \nuna minúscula, un número y un carácter no alfanumérico: ");
			char[] caracteres = contraseña.toCharArray();
			for (int i = 0; i < caracteres.length; i++) {
				
				if (Mayuscula== false) {
					Mayuscula = Character.isUpperCase(caracteres[i]);
				}
				if (Minuscula==false) {
					Minuscula = Character.isLowerCase(caracteres[i]);
				}
				if (Digito == false) {
					Digito = Character.isDigit(caracteres[i]);
				}
				if (CaracterNoAlfanumerico == false) {
					CaracterNoAlfanumerico = Character.isLetterOrDigit(caracteres[i]);
				}
				
			}
			System.out.println("Contraseña inválida");
		} while (Mayuscula == false || Minuscula == false || Digito == false || CaracterNoAlfanumerico == false);
		
		System.out.println("Contraseña válida");
	}

}
