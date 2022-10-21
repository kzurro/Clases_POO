package interfaces;

public interface Arrancable extends Reparable {

	public default void arrancar() {
		System.out.println("Soy un " + getClass().getSimpleName() + " estoy arrancando...");
	}

}
