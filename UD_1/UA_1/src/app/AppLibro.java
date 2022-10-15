package app;

import clases.Autor;
import clases.Libro;
import clases.Tipo_Autor;

public class AppLibro {

	public static void main(String[] args) {

		Autor autor1 = new Autor("Pepe", "De Los Palotes", null);

		Libro libro1 = new Libro("123456789PO52", "Un libro Cualquiera", autor1, 403);

		// en este libro lo instanciamos poneiendo el constructor de autor dentro del
		// constructor de libro
		Libro libro2 = new Libro("123659LL52222", "Aprende programar con Java",
				new Autor("Alfonso", "Jiménes Marín", Tipo_Autor.NARRATIVA), 403);

		// Al ser un método estático es un método de clase y se invoca directamente
		// "llamando" a la clase no a la instancia que es cunado utilizamos el
		// constructor
		System.out.println(Libro.masPaginas(libro1, libro2));
	}

}
