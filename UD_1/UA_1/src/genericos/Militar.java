package genericos;

public class Militar implements Identificable<Integer> {
	private int numEscalafon;

	public int getNumEscalafon() {
		return numEscalafon;
	}

	protected void setNumEscalafon(int numEscalafon) {
		this.numEscalafon = numEscalafon;
	}
	
	public Militar() {
	}
	
	
	public Militar(int numeroEscalafon) {
		setNumEscalafon(numeroEscalafon);
	}

	@Override
	public Integer getId() {
		return getNumEscalafon();
	}

}
