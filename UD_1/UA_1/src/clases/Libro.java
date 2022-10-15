package clases;

public class Libro {

	// atributos
	private String ISBN;
	private String titulo;
	private Autor Autor;
	private int numeroPaginas;

	// accesores
	public String getISBN() {
		return ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return Autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	protected void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected void setAutor(Autor autor) {
		Autor = autor;
	}

	protected void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Libro() {

	}

	public Libro(String iSBN, String titulo, Autor autor, int numeroPaginas) {
		setTitulo(titulo);
		setISBN(iSBN);
		setAutor(autor);
		setNumeroPaginas(numeroPaginas);

	}

	// métodos Sobrescritos
	@Override
	public String toString() {
		return "El Libro con ISBN: " + getISBN() + " creado por " + getAutor().getNombre() + " "
				+ getAutor().getApellidos() + ", tiene " + getNumeroPaginas() + " páginas";
	}

}
