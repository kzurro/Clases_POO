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

	}

}
