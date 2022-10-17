package herencia;

public class Moto extends Vehiculo {

	int numTiempos;
	int cubicaje;

	public int getNumTiempos() {
		return numTiempos;
	}

	public int getCubicaje() {
		return cubicaje;
	}

	protected void setNumTiempos(int numTiempos) {
		this.numTiempos = numTiempos;
	}

	protected void setCubicaje(int cubicaje) {
		this.cubicaje = cubicaje;
	}

	public Moto() {
		super();
	}

	public Moto(String marca, String color) {
		super(2, marca, color);
	}

	public Moto(int numTiempos, int cubicaje) {
		super();
		setNumTiempos(numTiempos);
		setNumeroRuedas(cubicaje);
		setNumeroRuedas(2);
	}

	@Override
	public String getColor() {
		return "LAS MOTOS NO TIENEN COLOR";
	}

	@Override
	public String toString() {
		return "Moto " + getColor() + " de " + getNumTiempos() + " tiempos  y " + getCubicaje() + " cc";
	}

}
