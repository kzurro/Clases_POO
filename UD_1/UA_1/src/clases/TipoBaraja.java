package clases;

import java.util.Arrays;

public class TipoBaraja {

	private String nombreBaraja;
	private int numeroCartas;
	private Palo[] palos;

	public String getNombreBaraja() {
		return nombreBaraja;
	}

	public int getNumeroCartas() {
		return numeroCartas;
	}

	public Palo[] getPalos() {
		return palos;
	}

	protected void setNombreBaraja(String nombreBaraja) {
		this.nombreBaraja = nombreBaraja;
	}

	protected void setNumeroCartas(int numeroCartas) {
		this.numeroCartas = numeroCartas;
	}

	protected void setPalos(Palo[] palos) {
		this.palos = palos;
	}

	public TipoBaraja() {
	}

	public TipoBaraja(String nombreBaraja, int numeroCartas, Palo[] palos) {
		setNombreBaraja(nombreBaraja);
		setNumeroCartas(numeroCartas);
		setPalos(palos);
	}

	@Override
	public String toString() {
		return "Tipo Baraja: " + getNombreBaraja() + ", con " + getNumeroCartas()
				+ "cartas y " + Arrays.toString(getPalos()) + " palos ";
	}
	
	

}
