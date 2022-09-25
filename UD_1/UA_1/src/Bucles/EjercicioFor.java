package Bucles;

public class EjercicioFor {

	public static void main(String[] args) {
		// Ejercicio 1
		System.out.println("Ejercicio 1:");
		muestraCienNumeros();
		// Ejercicio 2
		System.out.println(" \nEjercicio 2:");
		muestraCienNumDecremento();

		// Ejercicio 3
		System.out.println(" \nEjercicio 3:");
		muestraDivisiblesDostres();

		// Ejercicio 4
		System.out.println(" \nEjercicio 4:");
		multiplicarDos();

		// Ejercicio 5
		System.out.println(" \nEjercicio 5:");
		factorial(-5);

		// Ejercicio 6
		System.out.println(" \nEjercicio :6");
		muestraNumeros(-10, -10);

		// Ejercicio 6
		System.out.println(" \nEjercicio :7");
		muestraCualquierNumeros(-20, -21);
	}

	/*
	 * Muestra los números del 1 al 100 (ambos incluidos).
	 */
	static void muestraCienNumeros() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ", ");

		}
	}

	/*
	 * Muestra los números del 99 al 0 (ambos incluidos).
	 */

	static void muestraCienNumDecremento() {
		for (int i = 99; i >= 0; i--) {
			System.out.print(i + ", ");

		}

	}

	/*
	 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
	 */

	static void muestraDivisiblesDostres() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + ", ");
			}

		}
	}

	/*
	 * Realiza la tabla de multiplicar del 2.
	 */

	static void multiplicarDos() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("2 x " + i + " = " + i * 2);
		}
	}

	/*
	 * Realiza un método que sirva para calcular el factorial de un número (utiliza
	 * un bucle for)
	 */

	static void factorial(int numero) {
		int resultado = 1;

		if (numero == 0) {
			System.out.println(resultado);
		} else if (numero < 0) {
			System.out.println("no existe el factorial de un número negativo");
		} else {
			for (int i = numero; i >= 1; i--) {

				resultado = resultado * i;

			}
			System.out.println(resultado);
		}

	}

	/*
	 * Refactoriza el primer ejercicio para que sirva para cualquier pareja de
	 * números
	 */

	static void muestraNumeros(int a, int b) {
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + ", ");
			}
		} else if (b < a) {
			for (int i = b; i <= a; i++) {
				System.out.print(i + ", ");
			}
		} else {
			System.out.println(a + " y " + b + " son iguales");
		}

	}

	/*
	 * Refactoriza el ejercicio 6 para que sirva para cualquier dos número s dados y
	 * que si el primero es mayor que el segundo muestre los números en decremento
	 * como en el ejercicio 2.
	 */

	static void muestraCualquierNumeros(int a, int b) {
		if (a > b) {
			for (int i = a; i >= b; i--) {
				System.out.print(i + ", ");
			}
		} else if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(i + ", ");
			}
		} else {
			System.out.println(a + " y " + b + " son iguales");
		}
	}
}
