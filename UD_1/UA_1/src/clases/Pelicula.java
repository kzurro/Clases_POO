package clases;

public class Pelicula {

	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;

	public String getTitulo() {
		return titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public String getDirector() {
		return director;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	protected void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	public Pelicula() {

	}

	public Pelicula(String titulo, int duracion, int edadMinima, String director) {
		setTitulo(titulo);
		setDuracion(duracion);
		setEdadMinima(edadMinima);
		setDirector(director);
	}

	@Override
	public String toString() {
		return "'" + titulo + "' del director " + director + ", con una duracion de " + duracion
				+ " minutos y la edad minima es de " + edadMinima + " años";
	}

}
