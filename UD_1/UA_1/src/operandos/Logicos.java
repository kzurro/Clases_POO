package operandos;

public class Logicos {

	public static void main(String[] args) {

		boolean operando1, operando3;
		boolean operando2 = false;
		operando1 = true;
		operando3 = operando1;

		System.out.println(operando1 && operando2);
		System.out.println(operando1 && operando3);

		System.out.println(operando1 || operando2);
		System.out.println(operando1 || operando3);

		System.out.println(operando1 && !operando2);
		System.out.println(operando1 && !operando3);

		int a, b, c, resultado;
		a = 1;
		b = 2;
		c = 3;
		resultado = a + b;

		System.out.println(a + b == resultado && resultado >= c);
		System.out.println(a + b == resultado && resultado < c);
		System.out.println(a + b == resultado || resultado < c);
		System.out.println(a + b == resultado && !(resultado < c));
	}

}
