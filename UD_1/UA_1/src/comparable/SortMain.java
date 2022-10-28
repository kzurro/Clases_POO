package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class SortMain {

	public static void main(String[] args) {
		List<String> listaStrings = Arrays.asList("a", "c", "b", "ab");
		Collection<String> strings = listaStrings;

		System.out.println(strings);

		listaStrings.sort(null);

		List<Objeto> listaObjetos = new ArrayList<>();

		listaObjetos.add(new Objeto(-15, "opli", '�', true));
		listaObjetos.add(new Objeto(5, "hola", 'A', false));
		listaObjetos.add(new Objeto(6, "Hola", 'a', true));
		listaObjetos.add(new Objeto(0, "pepe", 'B', false));
		listaObjetos.add(new Objeto(10, "tio", 'C', true));
		listaObjetos.add(new Objeto(-5, "kjnj", 'z', false));

		listaObjetos.sort(null);

		listaObjetos.forEach(System.out::println);

		listaObjetos.sort(new Comparator<Objeto>() {

			@Override
			public int compare(Objeto o1, Objeto o2) {

				return o1.getMensaje().compareTo(o2.getMensaje());
			}
		});

		CompardorString comparador = new CompardorString();

		listaObjetos.sort(comparador);

		listaObjetos.sort((o1, o2) -> o1.compareTo(o2));

	}

}
