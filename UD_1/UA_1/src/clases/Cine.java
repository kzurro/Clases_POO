package clases;

import java.util.Random;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	private Asiento asientos[][];

	public Pelicula getPelicula() {
		return pelicula;
	}

	public double getPrecio() {
		return precio;
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	protected void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	protected void setPrecio(double precio) {
		this.precio = precio;
	}

	protected void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public Cine() {

	}

	public Cine(Pelicula pelicula, double precio, Asiento[][] asientos) {
		setPelicula(pelicula);
		setPrecio(precio);
		setAsientos(asientos);
	}

	public Cine(int filas, int columnas, Pelicula pelicula, double precio) {
		this(pelicula, precio, new Asiento[filas][columnas]);
	}

	public void crearSala() {
		for (int i = 0; i < getAsientos().length; i++) {
			for (int j = 0; j < getAsientos()[0].length; j++) {
				getAsientos()[i][j] = new Asiento((char) ('A' + j), i + 1);

			}

		}
	}

	public void mostrarCine() {
		for (Asiento[] filaColumna : getAsientos()) {
			for (Asiento butaca : filaColumna) {
				System.out.print(butaca + "\t");
			}
			System.out.println("");
		}

	}

	public boolean haySitio() {
		boolean sitioLibre = false;
		for (Asiento[] filaColumna : getAsientos()) {
			for (Asiento butaca : filaColumna) {
				if (!butaca.isOcupado()) {
					sitioLibre = true;
					break;
				}

			}
		}

		return sitioLibre;
	}

	public int cuantosAsientosLibres() {
		int sitioLibre = 0;
		for (Asiento[] filaColumna : getAsientos()) {
			for (Asiento butaca : filaColumna) {
				if (!butaca.isOcupado()) {
					sitioLibre++;
				}

			}

		}
		return sitioLibre;
	}

	public void sentarEspectador(int fila, char letra, Espectador espectador) {
		getAsiento(fila, letra).setEspectador(espectador);
	}

	private Asiento getAsiento(int fila, char letra) {
		return getAsientos()[fila - 1][letra - 'A'];
	}

	public void sentarRandomEspectador(Espectador espectador) {

		Random random = new Random();
		Asiento asiento;
		do {
			int fila = random.nextInt(getAsientos().length);
			int columna = random.nextInt(getAsientos()[0].length);
			asiento = getAsientos()[fila][columna];

		} while (asiento.isOcupado());

		asiento.setEspectador(espectador);

	}

	public void venderEntrada(Espectador espectador) {
		if (espectador.tieneDinero(getPrecio()) && espectador.tieneEdad(espectador.getEdad())) {
			sentarRandomEspectador(espectador);
		}
	}

	public void mostrarEspectadores() {
		for (Asiento[] filaColumna : getAsientos()) {
			for (Asiento butaca : filaColumna) {
				System.out.print(butaca.isOcupado() ? butaca + ": " + butaca.getEspectador().getNombre() + "\t"
						: butaca + ": LIBRE" + "\t");
			}
			System.out.println("");
		}
	}

	public void cambiarPelicula(Pelicula pelicula, double precio) {
		setPelicula(pelicula);
		setPrecio(precio);
	}
}
