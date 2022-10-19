package herencia;

public class Electrodomestico {

	private double precioBase;
	private ColorDisponbible color;
	private Consumo consumo;
	private double peso;

	public double getPrecioBase() {
		return precioBase;
	}

	public ColorDisponbible getColor() {
		return color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}

	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	protected void setColor(ColorDisponbible color) {
		this.color = color;
	}

	protected void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, ColorDisponbible color, Consumo consumo, double peso) {
		setPrecioBase(precioBase);
		setColor(color);
		setConsumo(consumo);
		setPeso(peso);

	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, ColorDisponbible.BLANCO, Consumo.F, peso);

	}

	public Electrodomestico() {
		this(100, ColorDisponbible.BLANCO, Consumo.F, 5);
	}

}
