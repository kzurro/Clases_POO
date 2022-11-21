package genericos;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AppGenericos {

	public static void main(String[] args) throws ParseException {

		Perro<Character> firulais = new Perro<Character>('A');

		System.out.println("Mostrando a Firulais");
		System.out.println(firulais.getId());

		Perro<LocalDate> chucho = new Perro<LocalDate>(LocalDate.of(2022, 01, 01));
		System.out.println("------------------------------------");
		System.out.println("Mostrando a chucho");
		System.out.println(chucho.getId());
		System.out.println("------------------------------------");
		Militar militar1 = new Militar(12345660);
		Vehiculo nissan = new Vehiculo("4562-BBB");
		Espia anacleto = new Espia();

		System.out.println("Mostrando identificables con boundary");
		mostrarIdentificable(militar1);
		mostrarIdentificable(nissan);
		// mostarIdentificable(anacleto); esto falla porque la clase Espia no implementa
		// Identificable
		mostrarIdentificable(chucho);
		System.out.println("------------------------------------");
		System.out.println("Mostrando Alistables con boundary");
		mostrarAlistables(militar1);
		mostrarAlistables(nissan);
		mostrarAlistables(anacleto);
		System.out.println("------------------------------------");
		System.out.println("Mostrando Alistables y ConRazocinio con boundary");
		mostrarAlistablesConRazocinio(militar1);
		mostrarAlistablesConRazocinio(anacleto);
		// mostrarAlistablesConRazocinio(nissan);// esto no funciona porque nissan no
		// cumple con las dos interfaces
		System.out.println("------------------------------------");
		System.out.println("Mostrando uso de WildCard");
		imprimirIdentificables(Arrays.asList(new Militar(12345600), new Vehiculo("2563-EEE"), chucho, firulais));
		System.out.println("------------------------------------");
		System.out.println("Mostrando uso de WildCard con Boundary ");
		imprimirAlistables(Arrays.asList(new Militar(12345600), new Militar(), new Espia(), new Vehiculo("12365-UIJ")));
		System.out.println("------------------------------------");
		System.out.println("Mostrando uso de WildCard con Boundary ");
		imprimirOtrosAlistables(Arrays.asList(new Militar(12345600), new Militar(), new Espia()));

	}

	private static <V extends Alistable & ConRazocinio> void mostrarAlistablesConRazocinio(V algo) {
		System.out.println("Tengo el puesto: " + algo.getPuesto() + " y pienso: " + algo.getPensamiento());

	}

	private static <V extends Alistable> void mostrarAlistables(V alistable) {
		System.out.println(alistable.getPuesto());

	}

	private static <V extends Identificable<T>, T> void mostrarIdentificable(V identificable) {
		System.out.println(identificable.getId());

	}

	private static <P extends Alistable & ConRazocinio> void imprimirOtrosAlistables(List<? extends P> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getPuesto() + " y que opinas:  " + lista.get(i).getPensamiento());
		}

	}

	private static <T extends Alistable> void imprimirAlistables(List<? extends T> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getPuesto());
		}

	}

	private static <T extends Alistable & ConRazocinio> void imprimirOtrosIdentificables(List<? extends T> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getPuesto());
		}

	}

	private static void imprimirIdentificables(List<Identificable<?>> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getId());
		}

	}

}
