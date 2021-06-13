  
package capitulo06.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class ejercicio2 {

	public static void main(String[] args) {	
		
		Calendar horaRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Italy"));
		Calendar horaSidnei = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
		System.out.println("Hora en Roma: " + horaRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en Sidney: " + horaSidnei.get(Calendar.HOUR_OF_DAY));
		System.out.println("La diferencia horaria es de " + Math.abs(horaSidnei.get(Calendar.HOUR_OF_DAY) -horaRoma.get(Calendar.HOUR_OF_DAY)) + " horas.");
	}

}
