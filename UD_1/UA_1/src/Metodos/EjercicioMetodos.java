package Metodos;

import java.util.Scanner;

public class EjercicioMetodos {
	/*
	 * Realice un Método que sirva para multiplicar dos números enteros
	 */
	static int multipilcar(int a, int b) {
		return a * b;
	}

	/*
	 * Realice un Método que nos diga si un número es positivo o negativo
	 */

	static boolean esPositivo(double numero) {
		return numero > 0;
	}

	/*
	 * Dadas las coordenadas x e y del centro de una circunferencia (xc, yc) y de
	 * uno de sus puntos (xp, yp), debe implementar el cálculo del área de dicha
	 * circunferencia.
	 */

	static double area(double xc, double yc, double xp, double yp) {
		double area;
		double radio;

		radio = distancia(xc, yc, xp, yp);
		area = Math.PI * cuadrado(radio);

		return area;
	}

	static double cuadrado(double radio) {
		return radio * radio;
	}

	static double distancia(double xc, double yc, double xp, double yp) {
		double distancia;
		double sumaDeLosCuadrados;
		double cuadradoX;
		double cuadradoY;
		double restaX;
		double restaY;

		restaX = resta(xc, xp);
		restaY = resta(yc, yp);
		cuadradoX = cuadrado(restaX);
		cuadradoY = cuadrado(restaY);
		sumaDeLosCuadrados = suma(cuadradoX, cuadradoY);
		distancia = Math.sqrt(sumaDeLosCuadrados);

		return distancia;
	}

	static double suma(double operando1, double operando2) {

		return operando1 + operando2;
	}

	static double resta(double minuendo, double sustraendo) {
		return minuendo - sustraendo;
	}

	/*
	 * Realice un método que calcule el factorial de un número y que controle que el
	 * factorial de un numero negativo no existe.
	 */

	static int factorial(int numero) {
		int resultado;

		if (numero != 1 && numero > 0) {
			resultado = factorial(numero - 1) * numero;
		} else if (numero < 0) {
			resultado = 0;
			System.out.println("NO SE PUEDE CALCULAR EL FACTORIAL DE UN NÚMERO NEGATIVO");
		} else {
			resultado = 1;
		}
		return resultado;
	}

	/*
	 * Crea un aplicación que nos convierta una cantidad de euros introducida por
	 * teclado a otra moneda, estas pueden ser a dólares, yenes o libras. El método
	 * tendrá como parámetros, la cantidad de euros y la moneda a pasar que será un
	 * String, este no devolverá ningún valor, mostrara un mensaje indicando el
	 * cambio (void). El cambio de divisas son:
	 * 
	 * 0.87 libras es un 1 € 0.99 $ es un 1 € 140.52 yenes es un 1 €
	 */

	static void conversor(double cantidad, String moneda) {
		double resultado = 0;

		// Este booleano lo utilizo en caso de que alguien, no introduzca un nombre de
		// moneda correcto
		boolean correcto = true;

		// Segun la moneda, calculamos la cantidad
		switch (moneda) {
		case "libras":
			resultado = cantidad * 0.87;
			break;
		case "dolares":
			resultado = cantidad * 99;
			break;
		case "yenes":
			resultado = cantidad * 140.50;
			break;
		default:
			System.out.println("No has introducido una moneda correcta");
			correcto = false;
		}

		// Solo si es correcto muestra el mensaje
		if (correcto) {
			System.out.println(cantidad + " euros en " + moneda + " son " + resultado);
		}

	}

	/*
	 * Crea una aplicación que nos calcule el área de un circulo, cuadrado o
	 * triangulo. Pediremos que figura queremos calcular su área y según lo
	 * introducido pedirá los valores necesarios para calcular el área. Crea un
	 * método por cada figura para calcular cada área, este devolverá un número
	 * real. Muestra el resultado por pantalla
	 */

	static double areaCirculo(int radio) {
		return Math.pow(radio, 2) * Math.PI;
	}

	static double areaTriangulo(int base, int altura) {
		return base * altura / 2;
	}

	static double areaCuadrado(int lado) {
		return lado * lado;
	}

	static void calcularArea(String nombrePoligono) {
		double resultado = 0;
		Scanner sc = new Scanner(System.in);
		switch (nombrePoligono) {
		case "circulo":
			System.out.println("Introduce el radio del circulo");
			int radio = sc.nextInt();
			resultado = areaCirculo(radio);
			break;
		case "triangulo":
			System.out.println("Introduce la base del triangulo");
			int baseTriangulo = sc.nextInt();
			System.out.println("Introduce la altura del triangulo");
			int alturaTriangulo = sc.nextInt();
			resultado = areaTriangulo(baseTriangulo, alturaTriangulo);
			break;
		case "cuadrado":
			System.out.println("Introduce el lado del Cuadrado");
			int ladoCuadrado = sc.nextInt();
			resultado = areaCuadrado(ladoCuadrado);
			break;

		default:
			System.out.println("No has introducido una figura correcta");
		}
		System.out.println("El area del " + nombrePoligono + " es " + resultado);
	}

	public static void main(String[] args) {
		/*
		 * Ejercicio 1
		 */

		System.out.println(multipilcar(5, -9));

		/*
		 * Ejercicio 2
		 */

		System.out.println(esPositivo(-5.2));

		/*
		 * Ejercicio 3
		 */

		System.out.println(area(0, 0, 2, 2));

		/*
		 * Ejercicio 4
		 */

		System.out.println(factorial(-5));

		/*
		 * Ejercicio 5
		 */

		conversor(500, "yenes");

		/*
		 * Ejercicio 6
		 */
		
		calcularArea("circulo");

	}

}
