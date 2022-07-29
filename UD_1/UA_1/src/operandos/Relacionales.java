package operandos;

public class Relacionales {

	public static void main(String[] args) {

		int operando1 = 2;
		int operando2 = 3;
		int operando3 = operando1 + operando2;
		boolean resultado;

		System.out.println("¿operando1 es igual a operando2 ?");
		resultado = operando1 == operando2;
		System.out.println(resultado);

		System.out.println("¿operando1 + operando2 es igual operando3? ");
		resultado = (operando1 + operando2) == operando3;
		System.out.println(resultado);

		System.out.println("¿operando1 es disitinto a operando2 ?");
		resultado = operando1 != operando2;
		System.out.println(resultado);

		System.out.println("¿operando1 es menor a operando2?");
		resultado = operando1 < operando2;
		System.out.println(resultado);

		System.out.println("¿operando1 es mayor a operando2?"); // fijarse de que tipo son los operandos y resultado
		resultado = operando1 > operando2;
		System.out.println(resultado);

		System.out.println("¿operando1 + operando2 es igual o mayor que operando3?");
		resultado = (operando1 + operando2) >= operando3;
		System.out.println(resultado);
	}

}
