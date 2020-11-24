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
		
		String str = JOptionPane.showInputDialog("ELIGA UNA OPCIÓN:"
				+ "/n 1. Abandonar el programa."
				+ "/n 2. Agregar una línea al texto."
				+ "/n 3. Insertar una línea desde cualquier posición."
				+ "/n 4. Editar una línea."
				+ "/n 5. Borrar una línea."
				+ "/n 6. Cortar un conjunto de líneas."
				+ "/n 7. Pegar un conjunto de líneas cortadas en otra posición."
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
