package capitulo04.Bloque01.PrimerosObjetos;

import java.util.ArrayList;
import java.util.List;

public class Cromos {

	public static void main(String[] args) {
		CromoBaloncesto jug1 = new CromoBaloncesto("Juan", 170, 88, 12);
		CromoBaloncesto jug2 = new CromoBaloncesto("Pablo", 186, 96, 24);
		CromoBaloncesto jug3 = new CromoBaloncesto("Kiko", 175, 66, 20);
		CromoBaloncesto jug4 = new CromoBaloncesto("Jesus", 185, 79, 17);
		CromoBaloncesto jug5 = new CromoBaloncesto("Fer", 184, 88, 28);
		
		List<CromoBaloncesto> lista = new ArrayList<CromoBaloncesto>();
		
		lista.add(jug1); 
		lista.add(jug2); 
		lista.add(jug3);
		lista.add(jug4); 
		lista.add(jug5);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString() + "\n");
		}
	}

}
