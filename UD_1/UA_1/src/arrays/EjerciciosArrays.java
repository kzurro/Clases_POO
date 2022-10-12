package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {

	public static void main(String[] args) {

		/**
		 * Cree una Array de tipo int de longitud 100 y que cada posición tenga su
		 * índice. Ejemplo : int[] ejemplo = {0,1,2}
		 */

		int[] numeros = new int[100];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}

		System.out.println(Arrays.toString(numeros));
		cambioEjercicio(2);

		/*
		 * En la anterior array las posiciones estén ocupadas al revés. Ejemplo: int[]
		 * ejemplo = { 2,1,0};
		 */

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros.length - i - 1;
		}

		System.out.println(Arrays.toString(numeros));
		cambioEjercicio(3);

		/*
		 * Dadas dos Array de tipo char. La 1ª esta formada por el abecedario en
		 * mayúsculas, rellene la 2ª a partir de la 1ª pero en orden inverso.
		 */

		char[] abcdarioDirecto = new char[26];
		char[] abcdarioInverso = new char[abcdarioDirecto.length];
		int contador = 0;

		for (char i = 'A'; i <= 'Z'; i++) {
			abcdarioDirecto[contador] = i;
			contador++;
		}

		System.out.println(Arrays.toString(abcdarioDirecto));

		for (int i = 0; i < abcdarioDirecto.length; i++) {
			abcdarioInverso[i] = abcdarioDirecto[abcdarioDirecto.length - 1 - i];
		}

		System.out.println(Arrays.toString(abcdarioInverso));

		cambioEjercicio(4);

		// Mostrar ejercicio 4
		int[] miArray = new int[10];

		// mostrarArray(rellenarArray(miArray));

		// mostrar Ejercicio 5
		cambioEjercicio(5);

		// mostrarArray(rellenarNumAleatorioArray(crearArray(), 5, 3));

		// mostrar Ejercicio 6
		cambioEjercicio(6);

		muestraMatriz(construyeMatrizIdentidad(10));

		// mostrar Ejercicio 7
		cambioEjercicio(7);
		// cuantosPositivos(rellenarArray(miArray));

		// mostrar Ejercicio 8
		cambioEjercicio(8);
		// calculaMedias(rellenarArray(miArray));

		// mostrar Ejercicio 9
		cambioEjercicio(9);

		// mediaAltura();

		// mostrar Ejercicio 10
		cambioEjercicio(10);

		String[] clase = { "Pepe", "María", "Josefina", "jose", "Manuel", "alonso", "Valentina" };

		System.out.println(Arrays.toString(ordenaNombres(clase)));

	}

	/**
	 * PARA SEPARAR UN EJERCICO DE OTRO EN LA CONSOLA
	 */
	static void cambioEjercicio(int numEjercicio) {
		System.out.println(
				"---o-------o-------o-------o-------o-------o-------o-------o-------o-------o-------o-------o----");
		System.out.println("Ejercicio ===> " + numEjercicio);
	}

	/*
	 * Cree un array de 10 posiciones de números con valores pedidos por teclado.
	 * Muestra por consola el índice y el valor al que corresponde. Haz dos métodos,
	 * uno para rellenar valores y otro para mostrar
	 */
	static int[] rellenarArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el número " + (i + 1) + " de la array");
			array[i] = sc.nextInt();
		}
		return array;
	}

	static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("En el índice " + i + " está el valor " + array[i]);
		}
	}

	/*
	 * 5. Cree un array de números donde le indicamos por teclado el tamaño del
	 * array, rellenaremos el array con números aleatorios entre 0 y 9, al final
	 * muestra por pantalla el valor de cada posición y la suma de todos los
	 * valores. Haz un método para rellenar el array (que tenga como parámetros los
	 * números entre los que tenga que generar), para mostrar el contenido y la suma
	 * del array y un método para generar número aleatorio.
	 */
	static int[] crearArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud de la array que desea");
		int[] array = new int[sc.nextInt()];
		return array;
	}

	static int[] rellenarNumAleatorioArray(int array[], int a, int b) {
		for (int i = 0; i < array.length; i++) {
			// Generamos un número entre los parámetros pasados
			array[i] = ((int) Math.floor(Math.random() * (a - b) + b));
		}
		return array;
	}

	/*
	 * Realice un método que construya una matriz identidad de dos dimensiones.
	 * Programe otro método que la muestre por pantalla de forma formateada
	 */
	static void muestraMatriz(int[][] matriz) {
		for (int[] numero : matriz) {
			for (int num : numero) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}

	static int[][] construyeMatrizIdentidad(int dimension) {
		int[][] matriz = new int[dimension][dimension];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (j == i) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}
		return matriz;

	}

	/*
	 * 7. Partiendo del ejercicio 4, realiza un método que nos diga cuantos números
	 * son positivos y cuantos negativos.
	 */

	static void cuantosPositivos(int[] array) {
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorceros = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				contadorPositivos++;
			} else if (array[i] < 0) {
				contadorNegativos++;
			} else {
				contadorceros++;
			}

		}
		System.out.println(((contadorceros > 0) ? "Hay " + contadorceros + " ceros en el array, " : " ")
				+ ((contadorPositivos > 0) ? "hay " + contadorPositivos + " positivos en el array, " : " ")
				+ ((contadorNegativos > 0) ? "Hay " + contadorNegativos + " negativos1 en el array " : " "));
	}

	/*
	 * 8. Programa Java que llene un array con 10 números enteros que se leen por
	 * teclado. A continuación calcula y muestra la media de los valores positivos y
	 * la de los valores negativos del array.
	 */

	static void calculaMedias(int[] array) {
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		int contadorceros = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;

		for (int numero : array) {
			if (numero > 0) {
				contadorPositivos++;
				sumaPositivos += numero;
			} else if (numero < 0) {
				contadorNegativos++;
				sumaNegativos += numero;
			} else {
				contadorceros++;
			}
		}
		System.out.println(((contadorceros > 0) ? "Hay " + contadorceros + " ceros en el array, " : " ")
				+ ((contadorPositivos > 0)
						? "hay " + contadorPositivos + " positivos en el array y la media es "
								+ sumaPositivos / contadorPositivos + ", "
						: " ")
				+ ((contadorNegativos > 0)
						? "hay " + contadorNegativos + " negativos en el array y la media es "
								+ sumaNegativos / contadorNegativos
						: " "));
	}

	/*
	 * 9. Programa Java para leer la altura de N personas y calcular la altura
	 * media. Calcular cuántas personas tienen una altura superior a la media y
	 * cuántas tienen una altura inferior a la media. El valor de N se pide por
	 * teclado y debe ser entero positivo.
	 */

	static void mediaAltura() {
		double[] alturaPersonas;
		double mediaAlturas = 0;
		Scanner sc = new Scanner(System.in);
		int numeroPersonas = 0;
		int contadorMas = 0;
		int contadorMenos = 0;
		int contadorMedia = 0;

		do {
			System.out.println("Introduce el numero de personas: ");
			numeroPersonas = sc.nextInt();
		} while (numeroPersonas <= 0);

		alturaPersonas = new double[numeroPersonas];

		System.out.println("Introduce altura personas: ");

		for (int i = 0; i < alturaPersonas.length; i++) {
			System.out.print("persona " + (i + 1) + " = ");
			alturaPersonas[i] = sc.nextDouble();
			mediaAlturas += alturaPersonas[i];
		}

		mediaAlturas /= alturaPersonas.length;

		for (int i = 0; i < alturaPersonas.length; i++) {
			if (mediaAlturas > alturaPersonas[i]) {
				contadorMas++;
			} else if (mediaAlturas < alturaPersonas[i]) {
				contadorMenos++;
			} else {
				contadorMedia++;
			}
		}
		System.out.println("Estatura media: " + mediaAlturas);
		System.out.println("Personas con estatura superior a la media: " + contadorMas);
		System.out.println("Personas con estatura inferior a la media: " + contadorMenos);
		System.out.println((contadorMedia > 0) ? "Personas con estatura inferior a la media: " + contadorMenos : "");

	}

	/**
	 * Aplicado Método intercambio con cadenas
	 * 
	 * @author kzurro
	 * @param array String
	 * @return array ordnenada. \n
	 * @see <a href=
	 *      "https://www.discoduroderoer.es/formas-de-ordenar-un-array-en-java/"/>
	 *      Ver</a>
	 */

	static String[] ordenaNombres(String[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					String auxiliar = array[i];
					array[i] = array[j];
					array[j] = auxiliar;
				}
			}
		}

		return array;
	}
}
