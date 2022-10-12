package app;

import clases.Persona;

public class AppPersona {

	public static void main(String[] args) {

		String nombre = "Manolo";
		int edad = 17;
		char sexo = 'H';
		double peso = 92.5;
		double altura = 178;

		Persona persona1 = new Persona(nombre, edad, "12659843-P", sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona();

		// si quiero utilizar los set para la tercera persona debo cambiar la
		// visibilidad de los setters a publica

		System.out.println(persona1.calcularIMC());
		System.out.println(persona2.calcularIMC());
		System.out.println(persona3.calcularIMC());

		System.out.println(persona1.esMayorEdad());
		System.out.println(persona2.esMayorEdad());
		System.out.println(persona3.esMayorEdad());

		System.out.println((persona1.toString()));
		System.out.println((persona2.toString()));
		System.out.println((persona3.toString()));

	}

}
