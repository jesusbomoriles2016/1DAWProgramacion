package capitulo04.EjerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.List;

public class PreguntaOpcion extends Pregunta {

	private List<String> respuestas;
	
	public PreguntaOpcion() {

	}

	public PreguntaOpcion(String enunciado) {
		super(enunciado);

	}

	@Override
	public void muestraPantalla() {

	}

	@Override
	public boolean esCorrecta() {

		return false;
	}

}
