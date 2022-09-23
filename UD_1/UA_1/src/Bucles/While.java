package Bucles;

public class While {

	public static void main(String[] args) {
		// BUCLE WHILE

		int edad = 20;

		while (edad >= 18) {
			System.out.println("Es usted mayor de edad porque tiene " + edad);
			edad--;
		}

		System.out.println("He salido del bucle while porque edad es = " + edad + " y es menor que 18");

		// BUCLE DO-WHILE

		int i = 0;

		do {
			System.out.println("El valor del contador es: " + i);
			i++;

		} while (i < 4);

		System.out.println("He salido del bucle porque i es = " + i + 
				" y la condición es que sea menor que 4");

	}

}
