package capitulo05.bloque07_listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ej02 {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		int elegirOpcion;
		
		
		do {
			elegirOpcion = mostrarMenu();
			
			switch (elegirOpcion) {
			case 0:
				abandonarPrograma();
				break;
			case 1:
				crearListaValores(lista);
				break;
				
			case 2:
				calcular(lista);
				break;
				
			case 3:
				agregarNuevosValores(lista);
				break;
				
			case 4:
				eliminarIntervalo(lista);
				break;
				
			case 5:
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
				+ " \n0. Abandonar el programa."
				+ " \n1. Crear aleatoriamente la lista de valores."
				+ " \n2. Calcular suma, media, mayor y menor."
				+ " \n3. Agregar una cantidad de nuevos valores."
				+ " \n4. Eliminar elementos cuyo valor esté en un intervalo."
				+ " \n5. Imprimir el fichero.");
		opcionElegida = Integer.parseInt(str);
		
		return opcionElegida;
	}
	
	public static void abandonarPrograma() {
		JOptionPane.showMessageDialog(null, "El programa ha terminado");
	}
	
	public static void crearListaValores(List<Integer> lista) {
		String str = JOptionPane.showInputDialog("Introduce la longitud de la lista: ");
		int longitud = Integer.parseInt(str);
		
		String str2 = JOptionPane.showInputDialog("Introduce el valor mínimo de la lista: ");
		int numMin = Integer.parseInt(str2);
		
		String str3 = JOptionPane.showInputDialog("Introduce el valor máximo de la lista: ");
		int numMax= Integer.parseInt(str3);
		
		for (int i = 0; i < longitud; i++) {
			lista.add((int) Math.round(Math.random() * (numMax - numMin) + numMin));
		}
				
	}
	
	public static void calcular(List<Integer> lista) {
		System.out.println("La suma de los valores es " + suma(lista));
		System.out.println("La media de los valores es " + media(lista));
		System.out.println("El mayor de los valores es " + mayor(lista));
		System.out.println("El menor de los valores es " + menor(lista));
	}
	
	public static void agregarNuevosValores(List<Integer> lista) {
		String str = JOptionPane.showInputDialog("Introduce la longitud de los nuevos valores: ");
		int longitud = Integer.parseInt(str);
		
		String str2 = JOptionPane.showInputDialog("Introduce el valor mínimo: ");
		int numMin = Integer.parseInt(str2);
		
		String str3 = JOptionPane.showInputDialog("Introduce el valor máximo: ");
		int numMax= Integer.parseInt(str3);
		
		String str4 = JOptionPane.showInputDialog("Introduce el número de línea: ");
		int numLinea= Integer.parseInt(str4);
		
		for (int i = 0; i < longitud; i++) {
			lista.add((int) Math.round(Math.random() * (numMax - numMin) + numMin));
		}

		for (int i = 0; i < lista.size(); i++) {
			lista.add(numLinea, lista.get(i));
		}
	}
	
	public static void eliminarIntervalo(List<Integer> lista) {
		String str = JOptionPane.showInputDialog("Introduce primer valor a eliminar: ");
		int numMin = Integer.parseInt(str);
		
		String str2 = JOptionPane.showInputDialog("Introduce el último valor a eliminar: ");
		int numMax= Integer.parseInt(str2);
		
		for (int i = numMin; i <= numMax; i++) {
			lista.remove(i);
		}
	}
	
	public static void imprimirFichero(List<Integer> lista) {
		System.out.println("Lista de valores:");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + "- \t" + lista.get(i));
		}
	}
	
	public static int suma (List<Integer> lista) {
		int resultado = 0;
		for (int i = 0; i < lista.size(); i++) {
			resultado += lista.get(i);
		}
		return resultado;
	}
	
	public static int media (List<Integer> lista) {
		int resultado = 0;
		
		return resultado = suma(lista) / lista.size();
	}
	
	public static int mayor (List<Integer> lista) {
		int resultado = lista.get(0);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > resultado)
				resultado = lista.get(i);
		}
			
		return resultado;
	}
	
	public static int menor (List<Integer> lista) {
		int resultado = lista.get(0);
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < resultado)
				resultado = lista.get(i);
		}
			
		return resultado;
	}
	
	
	
	
	
	
}	
