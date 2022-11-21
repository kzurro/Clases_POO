package genericos;

public class Espia implements Alistable, ConRazocinio {

	public Espia() {
	}

	@Override
	public String getPuesto() {
		return "Pasar información";
	}

	@Override
	public String getPensamiento() {
		return "Lo importante es la Información";
	}

}
