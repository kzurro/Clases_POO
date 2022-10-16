package clases;

public class Carta {

	public static final String[] PALOS = { "ESPADAS", "OROS", "COPAS", "BASTOS" };

	// ATRIBUTOS

	private int numero;
	private Palo palo;

	// Métodos accesores

	public static String[] getPalos() {
		return PALOS;
	}

	public int getNumero() {
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

	protected void setPalo(Palo palo) {
		this.palo = palo;
	}

	// constructores
	public Carta() {

	}

	public Carta(int numero, Palo palo) {
		setNumero(numero);
		setPalo(palo);

	}

	// Sobreescritos
	@Override
	public String toString() {
		return getNumero() + " " + getPalo();
	}

}
