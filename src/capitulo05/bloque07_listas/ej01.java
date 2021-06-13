package capitulo05.bloque07_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ej01 {
	
	public static void main(String[] args) {
		int elegirOpcion;
		List<String> lista = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		
		lista.add("Primera línea");
		lista.add("Segunda línea");
		lista.add("Tercera línea");
		
	
		do {
			elegirOpcion = mostrarMenu() - 1;
			
			switch (elegirOpcion) {
			case 0:
				abandonarPrograma();
				break;
			case 1:
				agregarLineaTexto(lista);
				break;
				
			case 2:
				insertarLineaEnTexto(lista);
				break;
				
			case 3:
				editarUnaLinea(lista);
				break;
				
			case 4:
				borrarUnaLinea(lista);
				break;
				
			case 5:
				cortarConjuntoLineas(lista, portapapeles);
				break;
				
			case 6:
				pegarConjuntoLineas(lista, portapapeles);
				break;
				
			case 7:
				imprimirFichero(lista);
				break;
				
			default:
				System.out.println("Opción elegida no válida");	
			} 	
			
		} while (elegirOpcion != 0);
		
	}
	
	public static int mostrarMenu () {
		int opcionElegida;
		
		String str = JOptionPane.showInputDialog("ELIGA UNA OPCIÓN:"
				+ " \n1. Abandonar el programa."
				+ " \n2. Agregar una línea al texto."
				+ " \n3. Insertar una línea desde cualquier posiciÓn."
				+ " \n4. Editar una línea."
				+ " \n5. Borrar una línea."
				+ " \n6. Cortar un conjunto de líneas."
				+ " \n7. Pegar un conjunto de líeas cortadas en otra posición."
				+ " \n8. Imprimir el fichero.");
		opcionElegida = Integer.parseInt(str);
		
		return opcionElegida;
	}
	
	public static void abandonarPrograma () {
		JOptionPane.showMessageDialog(null, "El programa ha terminado");
	}
	
	public static void agregarLineaTexto (List<String> lista) {
		String str = JOptionPane.showInputDialog("Añade una línea");
		lista.add(str);
	}
	
	public static void insertarLineaEnTexto (List<String> lista) {
		String linea = JOptionPane.showInputDialog("Introduce el texto");
		String str = JOptionPane.showInputDialog("Introduce un número de línea");
		int numLinea = Integer.parseInt(str);
		lista.add(numLinea, linea);
		
	}
	
	public static void editarUnaLinea (List<String> lista) {
		String linea = JOptionPane.showInputDialog("Introduce el texto");
		String str = JOptionPane.showInputDialog("Introduce un número de línea");
		int numLinea = Integer.parseInt(str);
		lista.remove(numLinea);
		lista.add(numLinea, linea);
	}
	
	public static void borrarUnaLinea (List<String> lista) {
		String str = JOptionPane.showInputDialog("Introduce un número de línea");
		int numLinea = Integer.parseInt(str);
		lista.remove(numLinea);
	}
	
	public static void cortarConjuntoLineas (List<String> lista, List<String> portapapeles) {
		String str = JOptionPane.showInputDialog("Introduce la primera línea");
		int numLineaMin = Integer.parseInt(str);
		String str2 = JOptionPane.showInputDialog("Introduce la última línea");
		int numLineaMax = Integer.parseInt(str2);
		
		for (int i = numLineaMin; i < numLineaMax; i++) {
			portapapeles.add(lista.get(i));
			lista.remove(numLineaMin);
		}
	}
	
	public static void pegarConjuntoLineas (List<String> lista, List<String> portapapeles) {
		String str = JOptionPane.showInputDialog("Introduce un número de línea");
		int numLinea = Integer.parseInt(str);
		for (int i = numLinea; i < portapapeles.size(); i++) {
			lista.add(numLinea, portapapeles.get(i));
			portapapeles.remove(0);
		}
	}
	
	public static void imprimirFichero (List<String> lista) {
		System.out.println("Lista:");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}
	
}	
