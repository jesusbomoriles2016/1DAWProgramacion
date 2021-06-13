package capitulo06.math;

public class ej02 {
	/**
	 * 2º.- Averiguar, con una precisión inferior a 0.001, en qué punto (x, y) se cortan las gráficas de las siguientes funciones:
		y = sqrt(x)
		y = - ln(x)
	 * @param args
	 */
	public static void main(String[] args) {
		double y, x, y2;
		
		//x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a: "));
		x = 0.00001;
		do {
			
			y = Math.sqrt(x);
			y2 = - Math.log(x);
			
			x += 0.00001;
			
		} while (Math.abs(y - y2) > 0.001);
		
		System.out.println(x);
		
		System.out.println(y2);

	}
}
