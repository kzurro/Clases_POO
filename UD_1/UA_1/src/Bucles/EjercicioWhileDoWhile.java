package Bucles;

import java.util.Scanner;

public class EjercicioWhileDoWhile {

	public static void main(String[] args) {
		// llamada ejercicio 1
		collatz(2);

		// lamada ejercicio 2
		sonIguales();

		// llamada ejercicio 3

		sumaNumeros();
	}

	/*
	 * El problema planteado consiste en crear un programa que permita demostrar la
	 * conjetura de Collatz. La conjetura dice: Si es número par se divide entre 2 y
	 * si es número impar se multiplica por 3 y se suma 1 al resultado. Operar
	 * consecutivamente un valor numérico de entrada hasta obtener el valor de 1
	 * 
	 */
	public static void collatz(int n) {
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) { // n es par
				n = n / 2;
			} else { // n es impar
				n = n * 3 + 1;
			}
		}

	}

	/*
	 * Realiza un programa en Java que lea dos números pasados por teclado en un
	 * proceso repetitivo. Este proceso terminará cuando los números leídos sean
	 * iguales.
	 */
	public static void sonIguales() {
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		do {
			System.out.println("Introduce el número 1:");
			numero1 = sc.nextInt();
			System.out.println("Introduce el número 2:");
			numero2 = sc.nextInt();
		} while (numero1 != numero2);
		System.out.println("Has terminado, los números son iguales");
	}

	/*
	 * Programa que lea 10 números desde teclado en un proceso repetitivo y muestre
	 * la suma. Realizar el programa con do-while
	 */

	public static void sumaNumeros() {
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int suma = 0;

		do {
			contador++;
			System.out.println("Introduce el número: " + contador);
			numero = sc.nextInt();
			suma += numero;
		} while (contador < 10);
		System.out.println("La suma es: " + suma);
	}
}
