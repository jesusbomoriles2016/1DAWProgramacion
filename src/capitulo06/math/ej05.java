package capitulo06.math;

public class ej05 {
	/**
	 * Hallar los cinco primero máximos locales de la función y = x * sen(x) con una precisión de 0.01.
	 * @param args
	 */
	public static void main(String[] args) {

		double x = 0.00001;
		double y, y1, y2, fin = 0;

		do {
			y = x * Math.sin(x);
			y1 = (x - 0.00001) * Math.sin(x - 0.00001);
			y2 = (x + 0.00001) * Math.sin(x + 0.00001);

			if (y > y1 && y > y2) {
				System.out.println("x: " + x +"\ty: " + y);
				fin++;
			}
			
			x += 0.00001;

		} while (fin < 5);
	}
}
