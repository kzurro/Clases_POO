package app;

import clases.Cine;
import clases.Espectador;
import clases.Pelicula;

public class AppCine {

	public static void main(String[] args) {
		Cine cine = new Cine(10, 10, null, 0);

		cine.crearSala();

		cine.mostrarCine();
		System.out.println(cine.cuantosAsientosLibres());

		Espectador[] espectadores = { new Espectador("Pepe", 25, 12), new Espectador("Jose", 18, 10),
				new Espectador("Adriana", 25, 25), new Espectador("Manoli", 18, 33), new Espectador("Andres", 25, 25),
				new Espectador("Clara", 18, 10), new Espectador("Jimena", 25, 12), new Espectador("Tino", 18, 10),
				new Espectador("Miguel", 25, 12), new Espectador("Carlos", 18, 6), new Espectador("Ubaldo", 25, 12),
				new Espectador("Pedro", 12, 10), new Espectador("Tomas", 25, 7), new Espectador("Teresa", 17, 10),
				new Espectador("Noelia", 17, 7), new Espectador("Julia", 10, 10) };

		for (int i = 0; i < espectadores.length; i++) {
			cine.sentarRandomEspectador(espectadores[i]);
		}

		// cine.mostrarEspectadores();

		// ponemos que la pelicula del cine vale 12 y es para mayores de 18 años

		Pelicula pelicula = new Pelicula("SAW", 125, 18, "Darren Lynn Bousman");
		cine.cambiarPelicula(pelicula, 11.5);
		cine.mostrarEspectadores();

	}

}
