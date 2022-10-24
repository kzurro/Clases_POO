package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import herencia.Electrodomestico;
import herencia.Lavadora;
import herencia.Television;

public class ColeccionesApp {

	public static void main(String[] args) {

		Collection<Electrodomestico> listaElectrodomesticos = new ArrayList<>();

		Electrodomestico electrodomestico1 = new Electrodomestico(200, 60, 'C', "Verde");
		Lavadora lavadora1 = new Lavadora(150, 30);
		Television television1 = new Television(500, 80, 'E', "negro", 42, false);
		Electrodomestico electrodomestico2 = new Electrodomestico();
		Electrodomestico electrodomestico3 = new Electrodomestico(600, 20, 'D', "gris");
		Lavadora lavadora2 = new Lavadora(300, 40, 'Z', "blanco", 40);
		Television television2 = new Television(250, 70);
		Lavadora lavadora3 = new Lavadora(400, 100, 'A', "verde", 15);
		Television television3 = new Television(200, 60, 'C', "naranja", 30, true);
		Electrodomestico electrodomestico4 = new Electrodomestico(50, 10);

		// boolean add(E elem) => para añadir a la lista
		listaElectrodomesticos.add(electrodomestico1);
		listaElectrodomesticos.add(electrodomestico2);
		listaElectrodomesticos.add(electrodomestico3);
		listaElectrodomesticos.add(electrodomestico4);
		listaElectrodomesticos.add(lavadora1);
		listaElectrodomesticos.add(lavadora2);
		listaElectrodomesticos.add(lavadora3);
		listaElectrodomesticos.add(television1);
		listaElectrodomesticos.add(television2);
		listaElectrodomesticos.add(television3);

		// boolean remove (Object ob) => elimina un nodo ob de una lista
		listaElectrodomesticos.remove(television3);

		// void clear() => eliminar todos los nodos de una lista y dejarla vacía
		// listaElectrodomesticos.clear();

		// int size() => número de elementos (o nodos) insertados en una lista
		System.out.println(listaElectrodomesticos.size());

		// boolean isEmpty() => permite saber si una lista está vacía

		System.out.println(listaElectrodomesticos.isEmpty());

		// boolean contains(Object ob) => si un elemento ob determinado está en una
		// lista

		System.out.println(listaElectrodomesticos.contains(television2));

		// String toString() => devuelve una cadena que representa la colección

		System.out.println(listaElectrodomesticos.toString());

		// boolean conteinsAll(Collection <?> c) => true si todos los elementos de e
		// están en la colección que hace la llamada

		List<Television> televisiones = new ArrayList<>();
		televisiones.add(television1);
		televisiones.add(television2);

		// System.out.println(listaElectrodomesticos.containsAll(televisiones));

		// boolean addAll(Collection <? extends E> c) => inserta al final de la
		// colección que hace la llamada todos los nodos de la colección c

		listaElectrodomesticos.addAll(televisiones);

		// boolean removeAll(Collections <?> c) => elimina de la colección invocante
		// todos los nodos que estén contenidos en c

		listaElectrodomesticos.removeAll(televisiones);

		// Object[] toArray() ==> <T>T[] toArray(T[] t) => devuelve una tabla de tipo
		// Object/ T con los mismos elementos de la colección

		Object[] arrayTelevisiones = televisiones.toArray();

		for (Object television : arrayTelevisiones) {
			System.out.println(television);
		}

		// List
		System.out.println("MÉTODOS DE List");
		List<Electrodomestico> electrodomesticos = new ArrayList<>();
		// Creamos una lista con los electrodomesticos que tenemos en
		// listaElectrodomesticos
		electrodomesticos.addAll(listaElectrodomesticos);

		// E get(int indice) =>devuelve el elemento que ocupa el lugar índice en la
		// lista, siendo O el índice del primer elemento, como en los arrays.
		System.out.println(
				"El elemento que está en la posición 5 de la List electrodomesticos es: " + electrodomesticos.get(5));

		// E set (int indice, E elem) => guarda el elemento elem en la posición índice,
		// machacando el valor que hubiera previamente en esa posición, que es devuelto
		// por el método
		electrodomesticos.set(5, television3);
		// comprobamos que ha cambiado el elemento d ela posicion 5
		System.out.println(
				"El elemento que está en la posición 5 de la List electrodomesticos es: " + electrodomesticos.get(5));
		// void add(int indice, E elem) => inserta el valor elem en la posición índice,
		// añadiéndose, sin machacar el valor previo.

		electrodomesticos.add(5, television3);

		// boolean addAll(int índice, Collection<? extends E> c) => inserta todos los
		// elementos de la colección c en la lista que invoca al método, empezando por
		// el lugar índice y desplazando hacia el final todos los nodos de la lista
		// original a partir de índice

		electrodomesticos.addAll(0, televisiones);

		// E remove(int indice) => elimina el nodo que ocupa el lugar índice y devuelve
		// el elemento eliminado.

		electrodomesticos.remove(0);

		// int indexOf(Object ob) => devuelve el índice de la primera ocurrencia de ob
		// en la lista. Si no está, devuelve - 1.

		System.out.println(electrodomesticos.indexOf(electrodomestico3));

		// int lastIndexOf(Object ob) => hace lo mismo que indexOf(), pero empezando la
		// búsqueda por el final

		System.out.println(electrodomesticos.lastIndexOf(lavadora1));

		// boolean equals (Object otraLista) => las listas, tanto ArrayList como
		// LinkedList, se pueden comparar por medio del método equals (), que devuelve
		// true si ambas tienen exactamente los mismos elementos en el mismo orden

		List<Electrodomestico> otrosElectrodomesticos = electrodomesticos;
		// comprobamos que las dos listas son la misma
		System.out.println("La lista electrodomesticos es igual que la lista otroElectrodomestiocos"
				+ electrodomesticos.equals(otrosElectrodomesticos));
		// comprobamos que dos listas no son iguales
		System.out.println("La lista electrodomesticos  NO es igual que la lista televisiones "
				+ electrodomesticos.equals(televisiones));

		// ORDENAR COLECCIONES
		// static void sort(List<T> lista):
		System.out.println("ORDENAR COLECCIONES");

		electrodomesticos.forEach(System.out::println);

		// ordenar por criterio natural que es pasando null en el método y va a buscar
		// como hemos implementado el metodo compare en la Clase Electrodomestico
		electrodomesticos.sort(null);
		System.out.println("*******************************");
		electrodomesticos.forEach(System.out::println);
		System.out.println("*******************************");

		// Podemos implementar en el mismo método un nuevo comparador para ordenar por
		// otro criterio
		electrodomesticos.sort(new Comparator<Electrodomestico>() {

			@Override
			public int compare(Electrodomestico o1, Electrodomestico o2) {

				return (int) (o1.getPrecioBase() - o2.getPrecioBase());
			}
		});

		electrodomesticos.forEach(System.out::println);
		System.out.println("*******************************");

		/*
		 * hay una tercera forma que es creando un nuevo comparador en una clase
		 * externa. Esto se usaraá cuando se vaya a utlizar varais veces
		 */

		ComaparadorPesos comaparadorPesos = new ComaparadorPesos();

		electrodomesticos.sort(comaparadorPesos);

		// imprimir la lista
		electrodomesticos.forEach(System.out::println);

		// MÉTODOS DE BUSQUEDA
		System.out.println("MÉTODOS DE BÚSQUEDA");

		// binarySearch() => Búsqueda Binaria. Devuelve indice de la b´suqueda

		System.out.println(Collections.binarySearch(electrodomesticos, television1));

		// static void swap(List<?> lista, int i, int j) ​intercambia los nodos con
		// índices i y j entre sí.

		Collections.swap(electrodomesticos, 0, 8);

		// static boolean replaceAll(List<T> lista, valorAntiguo, T valorNuevo)
		// reemplaza el nodo valorAntiguo, en todos los lugares en que aparezca en la
		// lista, por valorNuevo.

		Collections.replaceAll(electrodomesticos, lavadora3, television3);

		/*
		 * static void fill(List<? super T> lista, T valorDeRelleno) sustituye todos los
		 * valores de los nodos de la lista por el de valorDeRelleno
		 */

		// Collections.fill(electrodomesticos, television2);

		/*
		 * static void copy (List<? super T> destino, List<? extends T> origen) copia
		 * los elementos de la lista origen en la lista destino, empezando por el
		 * principio y sobrescribiendo
		 */

//		otrosElectrodomesticos.addAll(listaElectrodomesticos);
//
//		Collections.copy(electrodomesticos, otrosElectrodomesticos);

		// OTROS METODOS DE INTERES

		System.out.println("OTROS MÉTODOS");

		/*
		 * static void shuffle(List<?> lista)=> desordena los elementos de lista.
		 */

		Collections.shuffle(electrodomesticos);

		otrosElectrodomesticos.forEach(System.out::println);
		/*
		 * void reverse (List<?> lista)=> invierte lista, colocando los nodos en orden
		 * inverso
		 */
		System.out.println("*******************************");
		Collections.reverse(electrodomesticos);

		otrosElectrodomesticos.forEach(System.out::println);

		/*
		 * static T max(Collection<? extends T> col)=> nos devuelve el valor máximo de
		 * una colección según el orden natural (no tiene por qué ser una lista)
		 */
		System.out.println("*******************************");
		System.out.println(Collections.max(electrodomesticos));

		/*
		 * static T max(Collection<? extends T> col, Comparator<? super T> comp)=>
		 * devuelve el máximo utilizando comp como criterio de comparación
		 */

		System.out.println(Collections.max(electrodomesticos, comaparadorPesos));
	}
}
