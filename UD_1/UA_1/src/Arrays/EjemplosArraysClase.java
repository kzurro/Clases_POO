package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class EjemplosArraysClase {

	public static void main(String[] args) {
		String[] mensajes = { "hola", "adios", "Hasta luego", "", "", "" };
		// Para mostrar las longitud de la array
		System.out.println("El tamaño de la array es: " + mensajes.length);
		// Mostrar la array
		System.out.println(mensajes);
		System.out.println(Arrays.toString(mensajes));

		// Iniciarla /rellenar

		Arrays.fill(mensajes, 3, 5, "Rellenando con fill"); // observar Sobrecarcas de fill
		System.out.println(Arrays.toString(mensajes));

		int[] array1 = { 2, 1, 3, 9, 0, 1 };
		int[] array2 = { 2, 1, 3, 9, 0, 1 };
		int[] array3 = array1;

		// comparar dos arrays
		System.out.println(array1 == array2); // aunque tienen elementos iguales no son el mismo espacio de memoria
		System.out.println(array3 == array1); // en este caso las dos variables apuntan al mimso espacio de memoria
		System.out.println(array1 + "-->" + array2 + "-->" + array3);
		System.out.println(Arrays.equals(array1, array2)); // el método equals compara 1 a 1 cada elemento de las arrays

		// ordenar arrays
		Arrays.sort(array1);
		System.out.println(array1);
		System.out.println(Arrays.toString(array1));

		// ¿siguen siendo iguales las array1 y array2?
		System.out.println(Arrays.equals(array1, array2));

		// ¿y la array1 y la array3?
		System.out.println(array1 + " --> " + array3);
		System.out.println(Arrays.toString(array3));

		// ¿Como se ordenan los String[]?
		System.out.println(Arrays.toString(mensajes));
		Arrays.sort(mensajes);
		System.out.println(Arrays.toString(mensajes));

		/*
		 * Buscar en una Array => el metodo binarySearch (búsqueda dicotómica) devuelve
		 * el indice donde está el elemento buscado o el indice de inserción si no estás
		 * ==> -pos -1
		 */

		System.out.println(Arrays.binarySearch(mensajes, "hola"));
		System.out.println(mensajes[5]);
		System.out.println(Arrays.binarySearch(mensajes, "pepe"));

		/*
		 * Copiar Array
		 */

		System.out.println(Arrays.toString(mensajes));
		String[] mensajesCopiados = Arrays.copyOf(mensajes, 6);
		System.out.println(Arrays.toString(mensajesCopiados));
		// demostramos qeu no es la misma array
		System.out.println(mensajes + "<------>" + mensajesCopiados);
		// demostramos que las dos arrays son iguales
		System.out.println(Arrays.equals(mensajes, mensajesCopiados));

		/*
		 * 
		 */
		System.out.println(Arrays.toString(mensajes));
		System.out.println(Arrays.toString(Arrays.copyOfRange(mensajes, 1, 3))); // fijarse que indices copia
		/*
		 * Generalmente el "desde, hasta" incluye el desde pero no el hasta.
		 */

		/*
		 * Recorrer una array con un bucle for
		 */
		for (int i = 0; i < mensajes.length; i++) {
			System.out.println("mensaje de la rray mensajes en la posición " + i + "==>" + mensajes[i]);

			/**
			 * FOR MEJORADO
			 */

			for (String s : mensajesCopiados) {
				System.out.println(s);

			}

			/*
			 * Matrices de dos dimensiones
			 */

			int[][] matriz = { { 1, 2, 3, 4, 5, 6 }, { 9, 8, 7, 6, 8, 9 }, { 9, 8, 7, 6, 8, 9 }, { 9, 8, 7, 6, 8, 9 },
					{ 9, 8, 7, 6, 8, 9 } };
			System.out.println(matriz.length);
			System.out.println(matriz);
			System.out.println(Arrays.toString(matriz));

			for (int k = 0; k < matriz.length; k++) {
				for (int j = 0; j < matriz[0].length; j++) {
					// hacer la operación que se necesite
					System.out.print(matriz[k][j] + "\t");
					// uso \t para alinear las columnas
				}
				System.out.println(); // siguiente fila

			}

			System.out.println("----------------------------------------------------------------------------");

			for (int[] numero : matriz) {
				for (int num : numero) {
					System.out.print(num + "\t");
				}
				System.out.println();
			}
		}

	}

}
