package comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

	}

}
