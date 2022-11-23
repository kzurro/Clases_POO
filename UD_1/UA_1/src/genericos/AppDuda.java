package genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import clases.Autor;

public class AppDuda {

	/**
	 * Los Genéricos en el main Al final List<T> en ejecución debe ser de un tipo
	 * concreto. Normalmente lo que hace Java es asignar un tipo compatible en
	 * ejecución.
	 * 
	 */
	public static <T extends Alistable & ConRazocinio> void main(String[] args) {

		T espia = (T) new Espia();
		Militar militar = new Militar(123456);

		List<T> listaDuda = new ArrayList<>();

		listaDuda.add(espia);
		listaDuda.add((T) militar);
		agregarItemEnLista(listaDuda, espia);
		imprimir(listaDuda);

		listaDuda.forEach(System.out::println);

		List<T> otraListaDuda = new ArrayList<>();
		agregarItemEnLista(otraListaDuda, (T) new Espia());
		imprimir(otraListaDuda);

		otraListaDuda.forEach(System.out::println);

		
		//tipos crudos
		/*
		 * https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
		 */
		List masListaDuda = new ArrayList<>();
		masListaDuda.add(espia);
		masListaDuda.add(militar);
		
		imprimir(masListaDuda);

		Perro perroCrudo = new Perro<T>(null);
		masListaDuda.add(perroCrudo);
		masListaDuda.add(new Autor());
		otraImprimir(masListaDuda);

		Collection<Object> tiposVariables = new ArrayList<>();
		Arrays.stream(masListaDuda.getClass().getTypeParameters())
				.forEach(t -> Arrays.stream(t.getBounds()).forEach(u -> tiposVariables.add(u)));
		// sale que los límites de los tipos variables de la clase de otraListaDuda (que
		// es la que he puesto como raw) es Object
		System.out.println(tiposVariables);

	}

	// VER LO QUE PONE EN EL WARNING
	// MUCHO OJO eso no es la panacea, desde ese momento el IDE no puede comprobarte
	// en tiempo de compilación la seguridad de tipos con lo que te puede petar si
	// no sabes lo que haces
	private static void otraImprimir(List lista) {
		lista.forEach(System.out::println);

		// entonces podría meterse cualquier cosa, pero lo bueno es que eso es en tiempo
		// de ejecución. En tiempo de compilación si intentas añadir por ejemplo un
		// String con el método de añadir que te he pasado antes pues te sale el error
		// porque String claramente no es un tipo T

		// entonces se puede decir que funciona y tú ya eres el que decide si puedes
		// pasar de los warnings o si tienes que cambiar el diseño

		/*
		 * todo esto de todas formas hay que verlo desde la perspectiva de que Java no
		 * se creó con genéricos. Creo que lo metieron en la versión 6. Y como debe ser
		 * retrocompatible pues tiene sus limitaciones
		 */
	}

	public static <T extends Alistable & ConRazocinio> boolean agregarItemEnLista(List<T> lista, T item) {
		return lista.add(item);
	}

	private static <T extends Alistable & ConRazocinio> void imprimir(List<T> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getPuesto());
		}

	}

}
