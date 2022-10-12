package metodos;

public class Metodos {

	public static void main(String[] args) {

		nuevaLinea("Hola, ¡Buenos Días!", 5);
		nuevaLinea("|----------------- otra linea -----------------|");
		nuevaLinea(5);
		nuevaLinea("|----------------- otra linea -----------------|", 2);

	}

	public static void nuevaLinea(int num) {
		nuevaLinea("", num);
	}

	public static void nuevaLinea(String mensaje, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(mensaje);
		}
	}

	public static void nuevaLinea(String mensaje) {
		nuevaLinea(mensaje, 1);
	}

}
