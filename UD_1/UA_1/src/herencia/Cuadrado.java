package herencia;

public class Cuadrado extends Poligono {

	private double lado;

	public double getLado() {
		return lado;
	}

	protected void setLado(double lado) {
		this.lado = lado;
	}

	public Cuadrado(String color, double lado) {
		super(4, color);
		setLado(lado);
	}

	public Cuadrado(String color) {
		super(4, color);

	}

	public Cuadrado() {
		setNumLados(4);
	}

	@Override
	public double calcularArea() {
		return Math.pow(getLado(), 2);
		// return getLado()*getLado();
	}

}
