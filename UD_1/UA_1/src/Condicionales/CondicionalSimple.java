package Condicionales;

public class CondicionalSimple {

	public static void main(String[] args) {

		int a = 3;
		String mensaje = "Hola";

		if (a + 1 < 10) {
			boolean prueba = true;
			System.out.println(prueba);
			a = 0;
			System.out.println(mensaje);
		}

		// System.out.println(prueba);
		System.out.println(a);

		int b = -5;

		if (b > 0) {
			// prueba = false;
			boolean pruebaDos = false;
			mensaje = "otro mensaje";
			System.out.println(mensaje);
			System.out.println(b);

		}

		System.out.println(mensaje);
		System.out.println(b);

		if (b < 0) {
			// prueba = false;
			boolean pruebaDos = false;
			mensaje = "otro mensaje";
			System.out.println(pruebaDos);
			System.out.println(mensaje);
			System.out.println(b);
		}
		// System.out.println(pruebaDos);
		System.out.println(mensaje);
		System.out.println(b);

	}

}
