package herencia;

public class Coche extends Vehiculo {

	private String modelo;
	private int numeroPlazas;

	public String getModelo() {
		return modelo;
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}

	public Coche() {
		// super();
	}

	public Coche(int numeroRuedas, String marca, String color) {
		super(numeroRuedas, marca, color);
	}

	public Coche(String modelo, int numeroPlazas) {
		super();
		setModelo(modelo);
		setNumeroPlazas(numeroPlazas);
	}

	public Coche(String modelo, int numeroPlazas, int numeroRuedas, String marca, String color) {
		super(numeroRuedas, marca, color);
		setModelo(modelo);
		setNumeroPlazas(numeroPlazas);
	}

	@Override
	public String toString() {
		return "Coche " + getColor() + " modelo " + getModelo() + ", con " + getNumeroPlazas() + " plazas";
	}

}
