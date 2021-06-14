package capitulo04.EjerciciosSobreHerencia.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		Libro libro = new Libro(2021, "Julio Verne", 1864, "Viaje al centro de la Tierra");
		Joya perla = new Joya(2021, "Mina", 10000, "Diamante");
		Vinilo aBBA = new Vinilo(2021, "Sevilla", 2000, "Redención");
		Recreativa spaceInvaders = new Recreativa(1970, "PAC-MAN", 2000, 1979);
		
		System.out.println(libro.toString());
		System.out.println(perla.toString());
		System.out.println(aBBA.toString());
		System.out.println(spaceInvaders.toString());

	}

}
