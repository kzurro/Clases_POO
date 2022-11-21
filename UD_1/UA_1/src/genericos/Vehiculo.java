package genericos;

public class Vehiculo implements Identificable<String>, Alistable {

	String matricula;

	public String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Vehiculo(String matricula) {
		setMatricula(matricula);
	}

	@Override
	public String getId() {
		return getMatricula();
	}

	@Override
	public String getPuesto() {
		return "Llevar Tropas";
	}

	

}
