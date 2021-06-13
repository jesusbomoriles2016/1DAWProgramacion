package capitulo06.math;

public class ej04 {
	/**
	 * Dado un triángulo rectángulo cuyos catetos miden 4 cm y 5 cm respectivamente, hallar cuanto mide la hipotenusa.
	 * @param args
	 */
	public static void main(String[] args) {
		double cateto1 = 4;
		double cateto2 = 5;
		
		double hipotenusa = Math.hypot(cateto1, cateto2);
		System.out.println(hipotenusa);

	}
}
