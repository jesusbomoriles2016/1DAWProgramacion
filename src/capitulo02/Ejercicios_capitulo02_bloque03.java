package capitulo02;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo02_bloque03 {

	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
		Ejercicio3();
//		Ejercicio4();
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
		System.out.println("Pulsa 1 para realizar una ra�z.");
		System.out.println("Pulsa 2 para realizar una potencia.");
		System.out.println("Pulsa 3 para realizar el m�dulo de una divisi�n.");
		System.out.println("Pulsa cualquier otro n�mero para terminar.");
		
		String str = JOptionPane.showInputDialog("�Qu� quieres hacer?");
		elegirOperacion= Integer.parseInt(str);
		
		if (elegirOperacion == 1) {
			String str1 = JOptionPane.showInputDialog("Introduce un n�mero");
			numRaiz = Integer.parseInt(str1);
			resultadoRaiz = Math.sqrt(numRaiz);
			
			System.out.println("La ra�z de " + numRaiz + " es " + resultadoRaiz);
			System.out.println("El programa ha terminado.");
		}
		
		else if (elegirOperacion == 2) {
			String str2 = JOptionPane.showInputDialog("Introduce un n�mero ");
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
			
			System.out.println("El m�dulo de la divisi�n con dividendo " + dividendo + " y divisor " + divisor + " es: " + modDivision);
			System.out.println("El programa ha terminado.");
		}
		
		else {
			System.out.println("El programa ha terminado.");
		}
		
	}
	
	public static void Ejercicio3 () {
		int elegirOperacion, longCateto1, longCateto2, longRadioCircunferencia, baseRect�ngulo, alturaRect�ngulo, baseTri�ngulo, alturaTri�ngulo;
		
		System.out.println("MEN� DE C�LCULO (pulsa para ejecutar):");
		System.out.println("1. C�lculo de la hipotenusa de un tri�ngulo.");
		System.out.println("2. C�lculo de la superficie de una circunferencia.");
		System.out.println("3. C�lculo del per�metro de una circunferencia.");
		System.out.println("4. C�lculo del �rea de un rect�ngulo.");
		System.out.println("5. C�lculo del �rea de un tri�ngulo.");
		System.out.println("Salir de la aplicaci�n.");
		
		String str = JOptionPane.showInputDialog("Introduce un n�mero: ");
		elegirOperacion = Integer.parseInt(str);
		
		
		
	}
	
	public static void Ejercicio4 () {
		
	}
	
	
	
}
