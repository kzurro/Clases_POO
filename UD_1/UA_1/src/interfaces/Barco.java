package interfaces;

public class Barco implements Arrancable {

	private double metrosEslora;
	private int caballosPotencia;

	public double getMetrosEslora() {
		return metrosEslora;
	}

	public int getCaballosPotencia() {
		return caballosPotencia;
	}

	protected void setMetrosEslora(double metrosEslora) {
		this.metrosEslora = metrosEslora;
	}

	protected void setCaballosPotencia(int caballosPotencia) {
		this.caballosPotencia = caballosPotencia;
	}

	public Barco() {
		this(0, 0);
	}

	public Barco(double metrosEslora, int caballosPotencia) {
		this.metrosEslora = metrosEslora;
		this.caballosPotencia = caballosPotencia;
	}

	@Override
	public boolean esReparable() {
		return getCaballosPotencia() > 0;
	}

}
