package bucles;

import java.util.Scanner;

public class EjerciciosBucles {
	/*
	 * Crea una aplicación que permita adivinar un número. La aplicación genera un
	 * número aleatorio del 1 al 100. A continuación va pidiendo números y va
	 * respondiendo si el número a adivinar es mayor o menor que el introducido, a
	 * demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El
	 * programa termina cuando se acierta el número (además te dice en cuantos
	 * intentos lo has acertado), si se llega al limite de intentos te muestra el
	 * número que había generado.
	 */

	public static void adivinaNumero() {
		Scanner scanner = new Scanner(System.in);
		int numeroAleatorio;
		int intento;
		int contador = 10;
		// Obtención de número aleatorio
		/**
		 * (int)=> El casteo (casting) es un procedimiento para transformar una variable
		 * primitiva de un tipo a otro, o transformar un objeto de una clase a otra
		 * clase siempre y cuando haya una relación de herencia entre ambas.
		 */
		numeroAleatorio = (int) (Math.random() * 100 + 1);
		System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. " + "Tienes 10 intentos.");
		System.out.println(numeroAleatorio);
		// Realización del bucle do-while
		do {
			System.out.println("Número contador: " + contador);
			System.out.print("Introduce el número que creas posible: ");
			intento = scanner.nextInt();
			if (intento > numeroAleatorio) {
				System.out.println("El número que buscas es menor, te quedan " + (contador - 1) + " intentos: ");
			} else if (intento < numeroAleatorio) {
				System.out.println("El número que buscas es mayor, te quedan " + (contador - 1) + " intentos: ");
			} else {
				System.out.print("¡CORRECTO! " + numeroAleatorio + " era el número que estabas "
						+ "buscando, has necesitado " + (10 - (contador - 1)) + " intentos.");
			}
			contador--;
		} while (intento != numeroAleatorio && contador > 0);
		if (contador == 0) {
			System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		}

	}

	static void pideNumeros() {
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int contador;
		int mayor = 0;
		int igual = 0;
		int menor = 0;
		// Solicitud de datos al usuario
		System.out.println(
				"El programa pide una cantidad de números indicada e indica cuantos son positivos, negativos o iguales a cero.");
		System.out.print("Introduce la cantidad de número que vamos a introducir: ");
		contador = scanner.nextInt();
		do {
			if (contador <= 0) {
				System.out.println(
						"El número introducido debe ser un entero positivo. Por favor, introduce un nuevo valor.");
				contador = scanner.nextInt();
			}
		} while (contador <= 0);
		while (contador > 0) {
			System.out.println("Introduce un número: ");
			numero = scanner.nextInt();
			contador = contador - 1;
			if (numero > 0) {
				mayor++;
			} else if (numero < 0) {
				menor++;
			} else {
				igual++;
			}
		}
		System.out.println("Has introducido todos los números:\n" + mayor + " son mayores a 0\n" + menor
				+ " son menores a 0\n" + igual + " son iguales a 0.");
	}

	static void cuantosNumPares(int num1, int num2) {
		int maximo;
		int minimo;
		int contador = 0;
		if (num1 > num2) {
			minimo = num2;
			maximo = num1;
		} else {
			minimo = num1;
			maximo = num2;
		}

		for (int i = minimo + 1; i < maximo; i++) {
			if (i % 2 == 0) {
				contador++;
			}

		}
		System.out.println(contador + " Numeros pares");

	}

	public static void main(String[] args) {

		// adivinaNumero();
		// pideNumeros();
		//cuantosNumPares(4, 10);

	}

}
