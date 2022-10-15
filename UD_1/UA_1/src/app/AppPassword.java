package app;

import clases.Password;

public class AppPassword {

	public static void main(String[] args) {

		Password[] passwords = new Password[10];
		boolean[] passwordsEsFuerte = new boolean[passwords.length];

		for (int i = 0; i < passwords.length; i++) {
			// http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
			passwords[i] = new Password((int) Math.floor(Math.random() * (12 - 3 + 1) + 3));

			passwordsEsFuerte[i] = passwords[i].isFuerte();

			// para comprobar resultados

			System.out.println("Contraseña " + (i + 1) + " =\t" + passwords[i] + "\t y es : \t\t\t"
					+ (passwordsEsFuerte[i] ? " fuerte" : " débil"));

		}

	}

}
