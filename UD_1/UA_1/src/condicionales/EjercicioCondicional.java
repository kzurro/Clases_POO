package condicionales;

import java.util.Scanner;

public class EjercicioCondicional {

	public static void main(String[] args) {
		/*
		 * Realice las sentencias necesarias para que se evalúe si un numero es par o
		 * impar
		 */

		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero entero");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " es un número par");
		} else {
			System.out.println(num + " es un número impar");
		}

		/*
		 * Declare dos variables de tipo entero y que apunten a dos números diferentes.
		 * Realice las sentencias necesarias para indicar cuál es el número mayor.
		 */

		int num1, num2;

		System.out.println("Introduzca un numero entero");
		num1 = sc.nextInt();

		System.out.println("Introduzca otro numero entero");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " Es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " Es mayor que " + num1);
		} else {
			System.out.println(num2 + " Es igual que " + num1);
		}

		/*
		 * Realice un programa que solicite por teclado tres números enteros y los
		 * ordene de mayor a menor
		 */
		int numA, numB, numC;

		System.out.println("Introduzca un numero entero");
		numA = sc.nextInt();

		System.out.println("Introduzca otro numero entero");
		numB = sc.nextInt();

		System.out.println("Introduzca el último numero entero");
		numC = sc.nextInt();

		if (numA > numB && numA > numC && numB > numC) {
			System.out.println("El orden es: " + numA + " " + numB + " " + numC);
		} else if (numA < numB && numA > numC && numB > numC) {
			System.out.println("El orden es: " + numB + " " + numA + " " + numC);
		} else if (numA < numB && numA < numC && numB > numC) {
			System.out.println("El orden es: " + numB + " " + numC + " " + numA);
		} else if (numA > numB && numA > numC && numB > numC) {
			System.out.println("El orden es: " + numA + " " + numC + " " + numB);
		} else if (numA > numB && numA < numC && numB < numC) {
			System.out.println("El orden es: " + numC + " " + numA + " " + numB);
		} else {
			System.out.println("El orden es: " + numC + " " + numB + " " + numA);
		}

		/*
		 * Realice un programa que solicite por teclado una palabra y nos diga: (Utilice
		 * switch) Si tiene una letra Si tiene dos letras Si tiene más de dos letras que
		 * nos diga "Tengo muchas letras"
		 */

		String mensaje;

		System.out.println("Introduzca su palabra");

		mensaje = sc.nextLine();
		int longitudmensaje = mensaje.length();

		switch (longitudmensaje) {
		case 1:
			System.out.println("tengo " + longitudmensaje + "letra");
			break;
		case 2:
			System.out.println("tengo " + longitudmensaje + "letras");
			break;
		default:
			System.out.println("Tengo muchas letras");
			break;
		}

	}
}
