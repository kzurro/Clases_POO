package clases;

public class Carta {

	public static final String[] PALOS = { "ESPADAS", "OROS", "COPAS", "BASTOS" };

	// ATRIBUTOS

	private int numero;
	private String palo;

	// Métodos accesores

	public static String[] getPalos() {
		return PALOS;
	}

	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected void setPalo(String palo) {
		this.palo = palo;
	}

	// constructores
	public Carta() {

	}

	public Carta(int numero, String palo) {
		setNumero(numero);
		setPalo(palo);

	}

	// Sobreescritos
	@Override
	public String toString() {
		return getNumero() + " " + getPalo();
	}

}
