package capitulo05.bloque07_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ej01 {
	
	public static void main(String[] args) {
		List<String> menuEditorTextos = new ArrayList<String>();
		
		int elegirOpcion = mostrarMenu();
		
	}
	
	public static int mostrarMenu () {
		int elegirOpcion;
		
		String str = JOptionPane.showInputDialog("ELIGA UNA OPCI�N:"
				+ "/n 1. Abandonar el programa."
				+ "/n 2. Agregar una l�nea al texto."
				+ "/n 3. Insertar una l�nea desde cualquier posici�n."
				+ "/n 4. Editar una l�nea."
				+ "/n 5. Borrar una l�nea."
				+ "/n 6. Cortar un conjunto de l�neas."
				+ "/n 7. Pegar un conjunto de l�neas cortadas en otra posici�n."
				+ "/n Imprimir el fichero.");
		elegirOpcion = Integer.parseInt(str);
		
		return elegirOpcion;
	}
	
	public static void agregarLineaTexto (String texto) {
		
	}
	
	public static void insertarLineaEnTexto (int numLinea, String texto) {
		
	}
	
	public static void editarUnaLinea (int numLinea, String nuevoTexto) {
		
	}
	
	public static void borrarUnaLinea (int numLinea) {
		
	}
	
	public static void cortarConjuntoLineas (int numLineaInicial, int numLineaFinal ) {
		
	}
	
	public static void pegarConjuntoLineas (int numLinea) {
		
	}
	
}	
