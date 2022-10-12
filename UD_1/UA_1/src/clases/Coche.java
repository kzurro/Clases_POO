package clases;

import java.util.Objects;

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

	@Override
	public String toString() {
		return "Coche [numRuedas=" + numRuedas + ", bastidor=" + bastidor + ", necesitaCarne=" + necesitaCarne
				+ ", observaciones=" + observaciones + ", tipoMotor=" + tipoMotor + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(bastidor, other.bastidor) && necesitaCarne == other.necesitaCarne
				&& numRuedas == other.numRuedas && Objects.equals(observaciones, other.observaciones)
				&& Objects.equals(tipoMotor, other.tipoMotor);
	}
	
	
	
	
	
	
	

}
