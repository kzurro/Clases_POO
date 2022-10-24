package colecciones;

import java.util.ArrayList;
import java.util.Collection;
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

		System.out.println(listaElectrodomesticos.containsAll(televisiones));

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

		// imprimir la lista
		// listaElectrodomesticos.forEach(System.out::println);
	}
}
