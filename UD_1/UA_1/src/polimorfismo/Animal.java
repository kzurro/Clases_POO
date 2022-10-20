package polimorfismo;

public class Animal {

	private int numPatas;

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public Animal(int numPatas) {
		setNumPatas(numPatas);
	}

	public Animal() {
		this(0);

	}

	public void ruidoHago() {
		System.out.println("Hago algún ruido");
	}

}
