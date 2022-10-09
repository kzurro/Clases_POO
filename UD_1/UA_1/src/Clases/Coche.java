package Clases;

public class Coche {

	int numRuedas = 4;
	private String bastidor;
	protected boolean necesitaCarne;
	public String observaciones;
	protected static String color;
	Motor tipoMotor;

	public int getNumeroRuedas() {
		return numRuedas;
	}

	public String getBastidor() {
		return bastidor; 
	}

	private boolean isNecesitaCarne() {
		return necesitaCarne;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public static String getColor() {
		return color;
	}

	void setNumRuedas(int numeroRuedas) {
		this.numRuedas = numeroRuedas;
	}

	protected void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	protected void setNecesitaCarne(boolean necesitaCarne) {
		this.necesitaCarne = necesitaCarne;
	}

	protected void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	protected static void setColor(String color) {
		Coche.color = color;
	}
	
	public Coche() {}

	public Coche(int numRuedas, String bastidor, boolean necesitaCarne, String observaciones, Motor tipoMotor) {
		this.numRuedas = numRuedas;
		this.bastidor = bastidor;
		this.necesitaCarne = necesitaCarne;
		this.observaciones = observaciones;
		this.tipoMotor = tipoMotor;
	}

	public Coche(int numRuedas, String bastidor, boolean necesitaCarne) {
		this.numRuedas = numRuedas;
		this.bastidor = bastidor;
		this.necesitaCarne = necesitaCarne;
	}
	
	public Coche(String bastidor) {
		this(0,bastidor,false);
	}
	
	
	

}
