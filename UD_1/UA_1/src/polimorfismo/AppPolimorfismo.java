package polimorfismo;

public class AppPolimorfismo {

	public static void main(String[] args) {

		Animal gatoPepe = new Gato(5);
		Animal perroFirulais = new Perro(true);
		Animal bicho = new Animal(8);

		gatoPepe.ruidoHago();
		perroFirulais.ruidoHago();
		bicho.ruidoHago();

	}

}
