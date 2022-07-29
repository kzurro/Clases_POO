package operandos;

public class Aritmetico {

	public static void main(String[] args) {
		int operando1 = 2;
		int operando2 = 3;
		int operando3 = operando1 + operando2;
		int resultado;

		System.out.println("Sumo operando1 y operando2 ");
		resultado = operando1 + operando2;
		System.out.println(resultado);

		System.out.println("Resto operando1 y operando2 ");
		resultado = operando1 - operando2;
		System.out.println(resultado);

		System.out.println("Multiplico operando1 y operando2 ");
		resultado = operando1 * operando2;
		System.out.println(resultado);

		System.out.println("Operando1 entre operando2 "); // fijarse de que tipo son los operandos y resultado
		resultado = operando1 / operando2;
		System.out.println(resultado);

		System.out.println("Resto del operando1 entre operando2 ");
		resultado = operando1 % operando2;
		System.out.println(resultado);
		
		double otroOperando1 = 2;
		double otroOperando2 = 3;
		double OtroOperando3 = operando1 + operando2;
		double otroResultado;
		
		System.out.println("Sumo operando1 y operando2 ");
		otroResultado = otroOperando1 + otroOperando2;
		System.out.println(otroResultado);

		System.out.println("Resto operando1 y operando2 ");
		otroResultado = otroOperando1 - otroOperando2;
		System.out.println(otroResultado);

		System.out.println("Multiplico operando1 y operando2 ");
		otroResultado = otroOperando1 * otroOperando2;
		System.out.println(resultado);

		System.out.println("Operando1 entre operando2 "); // fijarse de que tipo son los operandos y resultado
		otroResultado = otroOperando1 / otroOperando2;
		System.out.println(otroResultado);

		System.out.println("Resto del operando1 entre operando2 ");
		otroResultado = otroOperando1 % otroOperando2;
		System.out.println(otroResultado);

	}

}
