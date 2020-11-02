package capitulo02;

import javax.swing.JOptionPane;

public class Ejercicios_capitulo02_bloque02 {
	
	public static void main (String args[]) {
//		Ejercicio1();
//		Ejercicio2();
	}
	

	public static void Ejercicio1 () {
		int numIntroducido, numNeg = 0, num0_25 = 0, num26_250 = 0, numGran = 0;
		String str1 = JOptionPane.showInputDialog("Introduce el primer número: ");
		numIntroducido = Integer.parseInt(str1);
		if (numIntroducido < 0) {
			numNeg = numNeg + numIntroducido;	
		}
		else if (numIntroducido >= 0 && numIntroducido < 26) {
			num0_25 = num0_25 + numIntroducido;	
			}	
		else if (numIntroducido >= 26 && numIntroducido <= 250) {
			num26_250 = num26_250 + numIntroducido;	
			}				
		else if (numIntroducido > 250) {
			numGran = numGran + numIntroducido;			
		}
		String str2 = JOptionPane.showInputDialog("Introduce el segundo número: ");
		numIntroducido = Integer.parseInt(str2);
		if (numIntroducido < 0) {
			numNeg = numNeg + numIntroducido;	
		}
		else if (numIntroducido >= 0 && numIntroducido < 26) {
			num0_25 = num0_25 + numIntroducido;	
			}	
		else if (numIntroducido >= 26 && numIntroducido <= 250) {
			num26_250 = num26_250 + numIntroducido;	
			}				
		else if (numIntroducido > 250) {
			numGran = numGran + numIntroducido;			
		}
		String str3 = JOptionPane.showInputDialog("Introduce el tercer número: ");
		numIntroducido = Integer.parseInt(str3);
		if (numIntroducido < 0) {
			numNeg = numNeg + numIntroducido;	
		}
		else if (numIntroducido >= 0 && numIntroducido < 26) {
			num0_25 = num0_25 + numIntroducido;	
			}	
		else if (numIntroducido >= 26 && numIntroducido <= 250) {
			num26_250 = num26_250 + numIntroducido;	
			}				
		else if (numIntroducido > 250) {
			numGran = numGran + numIntroducido;			
		}
		String str4 = JOptionPane.showInputDialog("Introduce el cuarto número: ");
		numIntroducido = Integer.parseInt(str4);
		if (numIntroducido < 0) {
			numNeg = numNeg + numIntroducido;	
		}
		else if (numIntroducido >= 0 && numIntroducido < 26) {
			num0_25 = num0_25 + numIntroducido;	
			}	
		else if (numIntroducido >= 26 && numIntroducido <= 250) {
			num26_250 = num26_250 + numIntroducido;	
			}				
		else if (numIntroducido > 250) {
			numGran = numGran + numIntroducido;			
		}
		String str5 = JOptionPane.showInputDialog("Introduce el quinto número: ");
		numIntroducido = Integer.parseInt(str5);
	
		if (numIntroducido < 0) {
			numNeg = numNeg + numIntroducido;	
		}
		else if (numIntroducido >= 0 && numIntroducido < 26) {
			num0_25 = num0_25 + numIntroducido;	
			}	
		else if (numIntroducido >= 26 && numIntroducido <= 250) {
			num26_250 = num26_250 + numIntroducido;	
			}				
		else if (numIntroducido > 250) {
			numGran = numGran + numIntroducido;			
		}
		
		System.out.println("La suma de los números negativos es: " + numNeg);
		System.out.println("La suma de los números del 0 al 25 es: " + num0_25);
		System.out.println("La suma de los números del 26 al 250 es: " + num26_250);
		System.out.println("La suma de los números del 250 en adelante es: " + numGran);
	}

	public static void Ejercicio2 () {
		int numIntroducido = 0, num0_25 = 0, num26_250 = 0, numGran = 0;
		String str1 = JOptionPane.showInputDialog("Introduce el primer número: ");
		numIntroducido = Integer.parseInt(str1);
		if (numIntroducido < 0) {
			System.out.println("El programa ha terminado");
		}
		else if (numIntroducido >= 0 && numIntroducido < 25) {
			num0_25 = num0_25 + 1;			
		}
		
		String str2 = JOptionPane.showInputDialog("Introduce el segundo número: ");
		numIntroducido = Integer.parseInt(str2);
		if (numIntroducido < 0) {
			System.out.println("El programa ha terminado");
		}
		else if (numIntroducido >= 0 && numIntroducido < 25) {
			num0_25 = num0_25 + 1;			
		}
		
		String str3 = JOptionPane.showInputDialog("Introduce el tercer número: ");
		numIntroducido = Integer.parseInt(str3);
		if (numIntroducido < 0) {
			System.out.println("El programa ha terminado");
		}
		else if (numIntroducido >= 0 && numIntroducido < 25) {
			num0_25 = num0_25 + 1;			
		}
		
		String str4 = JOptionPane.showInputDialog("Introduce el primer número: ");
		numIntroducido = Integer.parseInt(str4);
		if (numIntroducido < 0) {
			System.out.println("El programa ha terminado");
		}
		else if (numIntroducido >= 0 && numIntroducido < 25) {
			num0_25 = num0_25 + 1;			
		}
		
		String str5 = JOptionPane.showInputDialog("Introduce el primer número: ");
		numIntroducido = Integer.parseInt(str5);
		if (numIntroducido < 0) {
			System.out.println("El programa ha terminado");
		}
		else if (numIntroducido >= 0 && numIntroducido < 25) {
			num0_25 = num0_25 + 1;			
		}
		
		System.out.println("Hay " + num0_25 + "números del 0 al 25");
		System.out.println("Hay " + num26_250 + "números del 26 al 250");
		System.out.println("Hay " + numGran + "números mayores de 250");
		
		
		
	}
}