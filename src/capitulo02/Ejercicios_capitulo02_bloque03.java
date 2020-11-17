package capitulo02;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo02_bloque03 {

	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
//		Ejercicio3();
		Ejercicio4();
	}
	
	public static void Ejercicio1 () {
		int nota = 0;
		
		String str = JOptionPane.showInputDialog("Introduce la nota: ");
		nota = Integer.parseInt(str);
		switch (nota) {
			case 0:
			System.out.println("Muy deficiente");
			break;
			case 1:
			System.out.println("Muy deficiente");
			break;			
			case 2:
			System.out.println("Muy deficiente");
			break;
			case 3:
			System.out.println("Deficiente");
			break;
			case 4:
			System.out.println("Deficiente");
			break;
			case 5:
			System.out.println("Suficiente");
			break;
			case 6:
			System.out.println("Bien");
			break;
			case 7:
			System.out.println("Notable");
			break;
			case 8:
			System.out.println("Notable");
			break;
			case 9:
			System.out.println("Sobresaliente");
			break;
			case 10:
			System.out.println("Sobresaliente");
			break;
		}
	}
	
	public static void Ejercicio2 () {
		int elegirOperacion, numRaiz = 0, basePotencia, exponente = 0, resultadoPotencia, dividendo, divisor, modDivision = 0;
		double resultadoRaiz;
		System.out.println("Bienvenido a la calculadora avanzada: ");
		System.out.println("Pulsa 1 para realizar una raíz.");
		System.out.println("Pulsa 2 para realizar una potencia.");
		System.out.println("Pulsa 3 para realizar el módulo de una división.");
		System.out.println("Pulsa cualquier otro número para terminar.");
		
		String str = JOptionPane.showInputDialog("¿Qué quieres hacer?");
		elegirOperacion= Integer.parseInt(str);
		
		if (elegirOperacion == 1) {
			String str1 = JOptionPane.showInputDialog("Introduce un número");
			numRaiz = Integer.parseInt(str1);
			resultadoRaiz = Math.sqrt(numRaiz);
			
			System.out.println("La raíz de " + numRaiz + " es " + resultadoRaiz);
			System.out.println("El programa ha terminado.");
		}
		
		else if (elegirOperacion == 2) {
			String str2 = JOptionPane.showInputDialog("Introduce un número ");
			basePotencia = Integer.parseInt(str2);
			String str3 = JOptionPane.showInputDialog("Introduce el exponente: ");
			exponente = Integer.parseInt(str3);
			resultadoPotencia = (int) Math.pow(basePotencia, exponente);
			
			System.out.println("La potencia de " + basePotencia + " con exponente" + exponente + " es " + resultadoPotencia);
			System.out.println("El programa ha terminado.");
		}
		
		else if (elegirOperacion == 3) {
			String str4 = JOptionPane.showInputDialog("Introduce el dividendo ");
			dividendo = Integer.parseInt(str4);
			String str5 = JOptionPane.showInputDialog("Introduce el divisor: ");
			divisor = Integer.parseInt(str5);
			modDivision = dividendo % divisor;
			
			System.out.println("El módulo de la división con dividendo " + dividendo + " y divisor " + divisor + " es: " + modDivision);
			System.out.println("El programa ha terminado.");
		}
		
		else {
			System.out.println("El programa ha terminado.");
		}
		
	}
	
	public static void Ejercicio3 () {
		int elegirOperacion, longCateto1, longCateto2, longRadioCircunferencia, baseRectángulo, alturaRectángulo, baseTriángulo, alturaTriángulo;
		
		System.out.println("MENÚ DE CÁLCULO (pulsa para ejecutar):");
		System.out.println("1. Cálculo de la hipotenusa de un triángulo.");
		System.out.println("2. Cálculo de la superficie de una circunferencia.");
		System.out.println("3. Cálculo del perímetro de una circunferencia.");
		System.out.println("4. Cálculo del área de un rectángulo.");
		System.out.println("5. Cálculo del área de un triángulo.");
		System.out.println("Salir de la aplicación.");
		
		String str = JOptionPane.showInputDialog("Introduce un número: ");
		elegirOperacion = Integer.parseInt(str);
		
		if (elegirOperacion != 0) {
					
			if (elegirOperacion == 1) {
				
				String str1 = JOptionPane.showInputDialog("Introduce la longitud del primer cateto: ");
				longCateto1 = Integer.parseInt(str1);
				
				String str2 = JOptionPane.showInputDialog("Introduce la longitud del segundo cateto: ");
				longCateto2 = Integer.parseInt(str2);
				
				System.out.println("La longitud de la hipotenusa es: " + ((longCateto1 * longCateto1) + (longCateto2 + longCateto2)));
			}
			
			else if (elegirOperacion == 2) {
				
				String str3 = JOptionPane.showInputDialog("Introduce la longitud del radio: ");
				longRadioCircunferencia = Integer.parseInt(str3);
				
				System.out.println("La superficie de la circunferencia es: " + 3.1416 * longRadioCircunferencia);
			}
			
			else if (elegirOperacion == 3) {
				
				String str4 = JOptionPane.showInputDialog("Introduce la longitud del radio: ");
				longRadioCircunferencia = Integer.parseInt(str4);
				
				System.out.println("La longitud de la circunferencia es: " + 2 * longRadioCircunferencia * 3.1416);
			}
			
			else if (elegirOperacion == 4) {
				
				String str5 = JOptionPane.showInputDialog("Introduce la longitud de la base del rectángulo: ");
				baseRectángulo = Integer.parseInt(str5);
				
				String str6 = JOptionPane.showInputDialog("Introduce la longitud de la altura del rectágulo: ");
				alturaRectángulo = Integer.parseInt(str6);
				
				System.out.println("El área del rectángulo es: " + baseRectángulo * alturaRectángulo);
			}
			
			else if (elegirOperacion == 5) {
				
				String str7 = JOptionPane.showInputDialog("Introduce la base del triángulo: ");
				baseTriángulo = Integer.parseInt(str7);
				
				String str8 = JOptionPane.showInputDialog("Introduce la altura del triángulo: ");
				alturaTriángulo = Integer.parseInt(str8);
				
				System.out.println("El área del triángulo es: " + (baseTriángulo * alturaTriángulo) / 2);
			}
			
			else if (elegirOperacion == 0) {
				System.out.println("El programa ha terminado.");	
			}
			
			else {
				System.out.println("Opción incorrecta");
			}
			
		}
		
		else {
			System.out.println("El programa ha terminado");
		}
		
	}
	
	public static void Ejercicio4 () {
		
		int importe, mon100, resto = -1, mon50, mon25, mon5, mon1;
		
		String str = JOptionPane.showInputDialog("Introduce el importe de la compra: ");
		importe = Integer.parseInt(str);
	
		mon100 = importe / 100;
		resto = importe % 100;
		System.out.println("Monedas de 100: " + mon100);
		
		
		if (resto >= 50) {
			mon50 = resto / 50;
			resto = resto % 50;
			System.out.println("Monedas de 50: " + mon50);
		}
		
		if (resto >= 25) {
			mon25 = resto / 25;
			resto = resto % 25;
			System.out.println("Monedas de 25: " + mon25);
		}
			
		if (resto >= 5) {
			mon5 = resto / 5;
			resto = resto % 5;
			System.out.println("Monedas de 5: " + mon5);
		}
		
		if (resto >= 1) {
			mon1 = resto / 1;
			System.out.println("Monedas de 1: " + mon1);
		}

	}
	
}
