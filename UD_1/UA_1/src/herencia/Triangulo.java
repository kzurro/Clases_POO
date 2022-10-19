package herencia;

public class Triangulo extends Poligono {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	protected void setBase(double base) {
		this.base = base;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo(String color, double base, double altura) {
		super(3, color);
		setBase(base);
		setAltura(altura);

	}

	public Triangulo(String color) {
		this(color, 0, 0);

	}

	public Triangulo() {
		setNumLados(3);
	}

	@Override
	public double calcularArea() {

		return getBase() * getAltura() / 2;
	}

}
