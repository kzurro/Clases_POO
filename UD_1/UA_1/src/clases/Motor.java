package clases;

public class Motor {
	String combustible;
	double cilidrada;
	int numCilindros;

	public String getCombustible() {
		return combustible;
	}

	public double getCilidrada() {
		return cilidrada;
	}

	public int getNumCilindros() {
		return numCilindros;
	}

	protected void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	protected void setCilidrada(double cilidrada) {
		this.cilidrada = cilidrada;
	}

	protected void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}

	public Motor() {
	}

	public Motor(String combustible, double cilidrada, int numCilindros) {
		this.combustible = combustible;
		this.cilidrada = cilidrada;
		this.numCilindros = numCilindros;
	}

}
