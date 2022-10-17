package clases;

public class Asiento {

	private char letra;
	private int fila;
	private Espectador espectador;

	public char getLetra() {
		return letra;
	}

	public int getFila() {
		return fila;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	protected void setLetra(char letra) {
		this.letra = letra;
	}

	protected void setFila(int fila) {
		this.fila = fila;
	}

	protected void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}

	public Asiento() {

	}

	public Asiento(char letra, int fila, Espectador espectador) {
		setLetra(letra);
		setFila(fila);
		setEspectador(espectador);
	}

	public Asiento(char letra, int fila) {
		this(letra, fila, null);
	}

	public boolean isOcupado() {
		return getEspectador() != null;
	}

	@Override
	public String toString() {
		return String.valueOf(getFila()) + getLetra();
	}

}
