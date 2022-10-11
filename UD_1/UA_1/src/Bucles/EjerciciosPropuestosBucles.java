package Bucles;

import java.util.Scanner;

public class EjerciciosPropuestosBucles {
	public static void main(String[] args) {

//		piramideLetras();
//		limites();
//		cuantasMensualidades(100, 10);
//		cuantasCuotasUltimaCuota(100, 10);
//		datosCuotas(100, 10);
		System.out.println(sumatorioFactoriales());

	}

	/*
	 * Realice un método que muestre por consola la siguiente "piramide"
	 * ZYXWVUTSRQPONMLKJIHGFEDCBA 
	 * YXWVUTSRQPONMLKJIHGFEDCBA 
	 * XWVUTSRQPONMLKJIHGFEDCBA
	 * WVUTSRQPONMLKJIHGFEDCBA 
	 * VUTSRQPONMLKJIHGFEDCBA 
	 * UTSRQPONMLKJIHGFEDCBA
	 * TSRQPONMLKJIHGFEDCBA 
	 * SRQPONMLKJIHGFEDCBA 
	 * RQPONMLKJIHGFEDCBA 
	 * QPONMLKJIHGFEDCBA
	 * PONMLKJIHGFEDCBA 
	 * ONMLKJIHGFEDCBA 
	 * NMLKJIHGFEDCBA 
	 * LKJIHGFEDCBA 
	 * LKJIHGFEDCBA
	 * KJIHGFEDCBA 
	 * JIHGFEDCBA 
	 * IHGFEDCBA 
	 * HGFEDCBA 
	 * GFEDCBA 
	 * FEDCBA 
	 * EDCBA 
	 * DCBA 
	 * CBA 
	 * BA 
	 * A
	 */
	static void piramideLetras() {
		for (char x = 'Z'; x >= 'A'; x--) {
			for (char y = x; y >= 'A'; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

	/*
	 * Programe un método que pida, por teclado, el limite inferior y el superior de
	 * un intervalo. Si el límite inferior es mayor que el superior lo tiene que
	 * volver a pedir.
	 * 
	 * Posteriormente se van introduciendo números hasta que se introduzca el 0.
	 * Cuando termine el programa dará las siguientes informaciones:
	 * 
	 * La suma de los números que están dentro del intervalo Cuántos números están
	 * fuera del intervalo. Informar si hemos introducido algún número igual a los
	 * límites del intervalo.
	 */

	static void limites() {
		Scanner scanner = new Scanner(System.in);
		int inferior;
		int superior;
		int numero;
		int suma = 0;
		int contador = 0;
		boolean esLimite = false;
		// Pedimos límites al usuario
		do {
			System.out.print("Introduce el límite inferior: ");
			inferior = scanner.nextInt();
			System.out.print("Introduce el límite superior: ");
			superior = scanner.nextInt();
			if (inferior > superior) {
				System.out.println(
						"Error, el límite inferior debe ser que el superior. " + "Revisa los valores introducidos.");
			}
		} while (inferior > superior);

		// Pedimos al usuario insertar números
		do {
			System.out.println("Introduce un número: ");
			numero = scanner.nextInt();

			if (numero != 0) {
				if (numero > inferior && numero < superior) {
					suma += numero;
				} else if (numero <= inferior || numero >= superior) {
					contador++;
				}
				if (numero == inferior || numero == superior) {
					esLimite = true;
				}
			}
		} while (numero != 0);

		// Al introducir 0, mostramos resultados
		System.out.println("El valor de la suma de los números introducidos en el rango " + inferior + " --> "
				+ superior + " es de " + suma);
		System.out.println("Se han introducido un total de " + contador + " números fuera del intervalo " + inferior
				+ "-" + superior);
		if (esLimite) {
			System.out.println(
					"Alguno de los valores introducidos ha coincidido con alguno de los límites del intervalo");
		} else {
			System.out.println("No se ha introducido ningún valor igual a los límites del intervalo");
		}
	}

	/*
	 * Una persona compró un producto a pagar en 10 meses. El primer mes pago 10€,
	 * el segundo mes pago 20€, el tercer mes 40€ y así sucesivamente. Realice un
	 * método que se le pase por parámetros lo que cuesta el producto y cuanto
	 * quiere pagar en la primera mensualidad y nos diga cuantas mensualidades ha
	 * tenido que emplear.
	 */
	/**
	 * 
	 * @param precioProducto = double para indicar el precio del producto que hemos
	 *                       comprado
	 * @param primeraCuota   = double que indica el valor de la primera cuota que
	 *                       queremos pagar
	 * @return void => presentara por consola las cuotas que tendré que abonar
	 */

	static void cuantasMensualidades(double precioProducto, double primeraCuota) {
		int contador = 0;
		double sumaMensualidades = 0;

		while (sumaMensualidades < precioProducto) {
			sumaMensualidades += primeraCuota;
			primeraCuota *= 2;
			contador = contador + 1;
		}
		System.out.println("Vd. va a pagar el producto en: " + contador + " Cuotas");
	}

	/*
	 * Continuado con el ejercicio anterior: Programe otro método para que también
	 * que cuantía es la de la última cuota
	 */
	static void cuantasCuotasUltimaCuota(double precioProducto, double primeraCuota) {
		int contador = 0;
		double sumaMensualidades = 0;
		double cuotaPendiente = 0;

		while (sumaMensualidades < precioProducto) {
			contador = contador + 1;
			cuotaPendiente = precioProducto - sumaMensualidades;
			sumaMensualidades += primeraCuota;
			primeraCuota = (primeraCuota < cuotaPendiente) ? primeraCuota : cuotaPendiente;
			primeraCuota *= 2;

		}
		System.out.println("Vd. va a tener que abonar: " + contador + " Cuotas. " + "La última cuota será de: "
				+ cuotaPendiente + "€.");
	}

	/*
	 * Programe otro método que nos diga el total de cuotas y lo que vamos a pagar
	 * en cada cuota y el pendiente que nos queda en esa cuota.
	 */

	static void datosCuotas(double precioProducto, double primeraCuota) {
		cuantasMensualidades(precioProducto, primeraCuota);
		int contador = 0;
		double sumaMensualidades = 0;
		double cuotaPendiente = 0;

		while (sumaMensualidades < precioProducto) {
			contador = contador + 1;
			cuotaPendiente = precioProducto - sumaMensualidades;
			sumaMensualidades += primeraCuota;
			primeraCuota = (primeraCuota < cuotaPendiente) ? primeraCuota : cuotaPendiente;
			System.out.println("En la cuota nº " + contador + " tiene que abonar => " + primeraCuota
					+ "€. Queda pendiente " + (cuotaPendiente - primeraCuota) + "€.");
			primeraCuota *= 2;

		}

	}

	/*
	 * Leer por teclado un número entero N no negativo y mostrar la suma de los
	 * factoriales de todos los números desde 0 hasta N.
	 */

	static int sumatorioFactoriales() {
		int a;
		int factorial;
		int suma = 0;
		Scanner sc = new Scanner(System.in);

		// Leer un número entero >= 0
		do {
			System.out.print("Introduce un número > 0: ");
			a = sc.nextInt();
		} while (a < 0);

		for (int i = 0; i <= a; i++) { // para cada número desde 1 hasta N

			// se calcula su factorial
			factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}

			// se muestra el factorial
			System.out.println(i + factorial);

			// se suma el factorial o
			suma += factorial;
		}
		return suma;
	}

}