package polimorfismo;

public class Perro extends Animal {

	private boolean soyDeCaza;

	public boolean isSoyDeCaza() {
		return soyDeCaza;
	}

	public void setSoyDeCaza(boolean soyDeCaza) {
		this.soyDeCaza = soyDeCaza;
	}

	public Perro() {
		this(false);

	}

	public Perro(boolean soyDeCaza) {
		super(4);
		setSoyDeCaza(soyDeCaza);
	}

	@Override
	public void ruidoHago() {
		System.out.println("guauuuuu");

	}

}
