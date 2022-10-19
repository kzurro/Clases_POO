package herencia;

public abstract class Poligono {

	private int numLados;
	private String color;

	public int getNumLados() {
		return numLados;
	}

	public String getColor() {
		return color;
	}

	protected void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	public Poligono(int numLados, String color) {
		setNumLados(numLados);
		setColor(color);
	}

	public Poligono() {
		this(0, null);
	}

	public abstract double calcularArea();

}
