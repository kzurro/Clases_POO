package polimorfismo;

public class Gato extends Animal {

	private int edad;

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public Gato() {
		this(5);
	}

	public Gato(int edad) {
		super(4);
		setEdad(edad);
	}

	public Gato(int numPatas, int edad) {
		super(numPatas);
		setEdad(edad);
	}

	@Override
	public void ruidoHago() {
		System.out.println("miau");

	}

}
