package genericos;

import java.text.ParseException;
import java.time.LocalDate;

public class AppGenericos {

	public static void main(String[] args) throws ParseException {

		Perro<Character> firulais = new Perro<Character>('A');

		System.out.println(firulais.getId());

		Perro<LocalDate> chucho = new Perro<LocalDate>(LocalDate.of(2022, 01, 01));

		System.out.println(chucho.getId());

	}

}
