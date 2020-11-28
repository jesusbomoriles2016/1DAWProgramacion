package capitulo05.bloque07_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ej01 {
	
	public static void main(String[] args) {
		List<String> menuEditorTextos = new ArrayList<String>();
		
		int elegirOpcion = mostrarMenu();
		
		switch (elegirOpcion) {
		case 0:
		abandonarPrograma();
		break;
		case 1:
		String nuevaLinea = JOptionPane.showInputDialog("Introduce una nueva línea");
		agregarLineaTexto(nuevaLinea, menuEditorTextos);
		break;			
		case 2:
		String str = JOptionPane.showInputDialog("Introduce un número de línea: ");
		int numLinea = Integer.parseInt(str);
		String nuevaLinea2 = JOptionPane.showInputDialog("Introduce la nueva línea: ");
		insertarLineaEnTexto(numLinea, nuevaLinea2);
		case 3:
		
		break;
		case 4:
		
		break;
		case 5:
		
		break;
		case 6:
		
		break;
		case 7:
		
		break;
		case 8:
		
		break;
	}
		
	}
	
	public static int mostrarMenu () {
		int opcionElegida;
		
		String str = JOptionPane.showInputDialog("ELIGA UNA OPCIÓN:"
				+ "/n 1. Abandonar el programa."
				+ "/n 2. Agregar una línea al texto."
				+ "/n 3. Insertar una línea desde cualquier posición."
				+ "/n 4. Editar una línea."
				+ "/n 5. Borrar una línea."
				+ "/n 6. Cortar un conjunto de líneas."
				+ "/n 7. Pegar un conjunto de líneas cortadas en otra posición."
				+ "/n Imprimir el fichero.");
		opcionElegida = Integer.parseInt(str);
		
		return opcionElegida;
	}
	
	public static void abandonarPrograma () {
		System.out.println("El programa ha terminado.");
	}
	
	public static void agregarLineaTexto (String texto,List<String> lista ) {
		 
		String nuevaLinea = JOptionPane.showInputDialog("Introduce una nueva línea: ");
		lista.add(nuevaLinea);

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
