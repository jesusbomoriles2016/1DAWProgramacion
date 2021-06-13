package capitulo06.dateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;


public class ejercicio1 {

	public static void main(String[] args) {
		String date = JOptionPane.showInputDialog("Introduce una fecha con el siguiente formato: día/mes/año (dd/mm/yyyy)");
		Date fecha = null;
		try {
			fecha = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			System.out.println("El formato introducido no es correcto");
		}
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fecha);
		
		System.out.println(fecha.toString());
		System.out.println("Años: " + fecha.getYear());
		System.out.println("Meses: " + fecha.getMonth());
		System.out.println("Días: " + fecha.getDay());
		System.out.println("Horas: " + fecha.getHours());
		System.out.println("Minutos: " + fecha.getMinutes());
		System.out.println("Segundos: " + fecha.getSeconds());
		
		
		calendario.add(Calendar.DAY_OF_MONTH, 3);
		
		System.out.println("Calendario tras sumar 3 días: " + calendario.getTime());
		
		calendario.setTime(fecha);
		calendario.add(Calendar.WEEK_OF_YEAR, -2);
		
		System.out.println("Calendario tras restar 2 semanas: " + calendario.getTime());
		
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_YEAR, 300);
		
		System.out.println("Calendario tras sumar 300 días: " + calendario.getTime());
		
		calendario.setTime(fecha);
		calendario.add(Calendar.YEAR, + 4);
		
		System.out.println("Calendario tras sumar 4 años: " + calendario.getTime());

	}

}