package herencia;

public class Electrodomestico {

	private final static char CONSUMO_DEFECTO = 'F';
	private final static char[] CONSUMOS_TIPOS = { 'A', 'B', 'C', 'D', 'E', 'F' };

	private double precioBase;
	private ColorDisponbible color;
	private char consumo;
	private double peso;

	public double getPrecioBase() {
		return precioBase;
	}

	public ColorDisponbible getColor() {
		return color;
	}

	public char getConsumo() {
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

	protected void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, ColorDisponbible color, char consumo, double peso) {
		setPrecioBase(precioBase);
		comprobarColor(String.valueOf(color));
		comprobarConsumoEnergetico(consumo);
		setPeso(peso);

	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, ColorDisponbible.BLANCO, CONSUMO_DEFECTO, peso);

	}

	public Electrodomestico() {
		this(100, ColorDisponbible.BLANCO, CONSUMO_DEFECTO, 5);
	}

	private void comprobarConsumoEnergetico(char letra) {
		for (char c : CONSUMOS_TIPOS) {
			if (c == letra) {
				setConsumo(letra);
			} else {
				setConsumo(CONSUMO_DEFECTO);
			}
		}
	}

	private void comprobarColor(String color) {
		for (ColorDisponbible c : ColorDisponbible.values()) {
			if (color.toUpperCase().equals(c)) {
				setColor(c);
			} else {
				setColor(ColorDisponbible.BLANCO);
			}
		}
	}

	public double precioFinal() {
		double plus = 0;
		switch (getConsumo()) {
		case 'A':
			plus += 100;
			break;
		case 'B':
			plus += 80;
			break;
		case 'C':
			plus += 60;
			break;
		case 'D':
			plus += 50;
			break;
		case 'E':
			plus += 30;
			break;
		case 'F':
			plus += 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			plus += 10;
		} else if (peso >= 20 && peso < 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}

		return precioBase + plus;
	}

}
