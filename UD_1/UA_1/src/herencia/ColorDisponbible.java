package herencia;

public enum ColorDisponbible {
	BLANCO("BLANCO"), NEGRO("NEGRO"), ROJO("ROJO"), AZUL("AZUL"), GRIS("GRIS");

	private String color;

	public String getColor() {
		return color;
	}

	private ColorDisponbible(String color) {
		this.color = color;
	}

}
