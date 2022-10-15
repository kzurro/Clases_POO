package clases;

public class Autor {

	private String nombre;
	private String Apellidos;
	private Tipo_Autor tipoAutor;

	// métodos accesores
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public Tipo_Autor getTipoAutor() {
		return tipoAutor;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	protected void setTipoAutor(Tipo_Autor tipoAutor) {
		this.tipoAutor = tipoAutor;
	}

	// Constructores
	public Autor() {
		this("", "", null);
	}

	public Autor(String nombre, String apellidos, Tipo_Autor tipoAutor) {
		setNombre(nombre);
		setApellidos(apellidos);
		setTipoAutor(tipoAutor == null ? Tipo_Autor.OTROS : tipoAutor);
	}

	// métodos sobreescritos

	@Override
	public String toString() {
		return "Autor: \n" + getNombre() + " " + getApellidos() + ", de " + getTipoAutor();
	}

}
