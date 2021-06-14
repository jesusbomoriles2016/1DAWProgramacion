package capitulo04.EjerciciosSobreHerencia.articuloComestibles;

public class Tienda {

	public static void main(String[] args) {
		
		Perecedero peras = new Perecedero(2, "Peras", 3.2f, 2021);
		Comestible botellas = new Comestible(6, "Botellas", 4.99f);
		
		System.out.println(peras.toString());
		System.out.println(botellas.toString());

	}

}
