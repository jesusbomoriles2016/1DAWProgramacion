package capitulo06.math;

public class ej03 {
	/**
	 *  Aproximar, con una precisión de 0.00001 décimas, el número PI. 
	 *  Para esto debes utilizar el método "Calcular el valor de PI utilizando series infinitas".
	 * @param args
	 */
	public static void main(String[] args) {
		
		double x = 3;
		double pi = 4;
		int signo = -1;
		
		do {
			
			pi += signo * 4.0 / x;
			signo *= -1;
			x += 2;
			
		} while(Math.abs(Math.PI - pi) >= 0.00001);
		
		System.out.println(pi);

	}
}
