package clases;

import java.util.Arrays;

public class AppBaraja {

	public static void main(String[] args) {

		Baraja baraja = new Baraja();

		// barajar baraja
		baraja.barajar();
		System.out.println(Arrays.toString(baraja.getCartas()));

		// Sacar cartas
		System.out.println("La siguiente carta es: " + baraja.siguienteCarta().toString());
		System.out.println("La siguiente carta es: " + baraja.siguienteCarta().toString());

		// Ver las cartas disponibles
		System.out.println("Las cartas disponibles en el montón es: " + baraja.cartasDisponibles());

		// Dar 10 cartas
		System.out.println("Dar diez cartas a un jugador: " + Arrays.toString(baraja.darCartas(10)));

		// mostrar cartas dispoibles
		System.out.println(baraja.cartasDisponibles());

		// Mostrar las cartas que ya han salido que son 12
		System.out.print("Mostrar las cartas que han salido: ");
		baraja.cartasMonton();

		// Mostrar las cartas disponibles
		baraja.mostrarBaraja();

		// empezamos con una baraja de pocker
		Palo[] palosPocker = { new Palo("CORAZONES"), new Palo("DIAMANTES"), new Palo("PICAS"), new Palo("TREBOLES") };
		TipoBaraja barajaPock = new TipoBaraja("pocker", 52, palosPocker);
		Baraja barajaPoker = new Baraja(barajaPock);

		System.out.println("\n POCKER");
		// barajar baraja
		//mostrar baraja de pocker sin barajar
		System.out.println(Arrays.toString(barajaPoker.getCartas()));
		barajaPoker.barajar();
		System.out.println(Arrays.toString(barajaPoker.getCartas()));

		// Sacar cartas
		System.out.println("La siguiente carta es: " + barajaPoker.siguienteCarta().toString());
		System.out.println("La siguiente carta es: " + barajaPoker.siguienteCarta().toString());

		// Ver las cartas disponibles
		System.out.println("Las cartas disponibles en el montón es: " + barajaPoker.cartasDisponibles());

		// Dar 10 cartas
		System.out.println("Dar diez cartas a un jugador: " + Arrays.toString(barajaPoker.darCartas(10)));

		// mostrar cartas dispoibles
		System.out.println(barajaPoker.cartasDisponibles());

		// Mostrar las cartas que ya han salido que son 12
		System.out.print("Mostrar las cartas que han salido: ");
		barajaPoker.cartasMonton();

		// Mostrar las cartas disponibles
		barajaPoker.mostrarBaraja();

	}

}
