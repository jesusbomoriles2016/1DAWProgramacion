package capitulo06.math;

import javax.swing.JOptionPane;

public class ej01 {
	/**
	 * Crear un programa que resuelva ecuaciones de segundo grado con una incógnita. 
	 * El programa debe pedir los parámetros a, b y c de la ecuación, e imprimir,
	 * en caso de que las haya, la solución o soluciones de la ecuación.
	 * @param args
	 */
	public static void main(String[] args) {
			
			double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a: "));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de b: "));
			double c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de c: "));
			
			System.out.println("Valor de a: " + a);
			System.out.println("Valor de b: " + b);
			System.out.println("Valor de c: " + c);
			
			double x = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
			
			System.out.println(x);
			
			x = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
			
			System.out.println(x);
			
		}
}
