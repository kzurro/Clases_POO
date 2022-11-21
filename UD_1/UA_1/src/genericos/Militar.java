package genericos;

public class Militar implements Identificable<Integer>, Alistable, ConRazocinio {
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

	@Override
	public String getPuesto() {
		return "Servir a la Patria";
	}

	@Override
	public String getPensamiento() {
		return "Lo importante es la misión";
	}



}
