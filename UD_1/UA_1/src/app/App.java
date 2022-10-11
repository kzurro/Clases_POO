package app;

import java.util.Objects;

import Clases.Coche;

public class App {

	public static void main(String[] args) {

		Coche miCoche = new Coche();
		Coche otroCoche = new Coche(4, "BCF67899", true);
		Coche otroCocheIgual = otroCoche;
		Coche miOtroCoche = new Coche(4, "BCF67899", true);
		
		
		
		System.out.println(otroCoche == otroCocheIgual);
		System.out.println(otroCoche == miOtroCoche);
		System.out.println(otroCoche.equals(miOtroCoche));
		System.out.print(Objects.equals(otroCoche, miOtroCoche));
		System.out.println(otroCoche.hashCode());
		System.out.println(miOtroCoche.hashCode());

	}

}
