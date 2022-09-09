package operandos;

public class EjerciciosOperadores {

	public static void main(String[] args) {
		/**
		 * Si x, y y z son variables de tipo boolean con valores x = true, y = false, z
		 * = true, determina el valor de las siguientes expresiones lógicas:
		 */
		boolean x, y, z;
		x = true;
		y = false;
		z = true;

		System.out.println("Respuesta A: " + ((x && y) || (x && y)));
		System.out.println("Respuesta B: " + ((x || !y) && (!x || z)));
		System.out.println("Respuesta C: " + (x || y && z));
		System.out.println("Respuesta D: " + (!(x || y) && z));
		System.out.println("Respuesta E: " + (x || y || x && !z && !y));
		System.out.println("Respuesta F: " + (!x || !y || z && x && !y));

		/**
		 * Si a, b y c son variables enteras con valores a=8, b=3, c=-5, determina el
		 * valor de las siguientes expresiones aritméticas:
		 */

		int a, b, c;
		a = 8;
		b = 3;
		c = -5;

		System.out.println("Respuesta a: " + (a + b + c));
		System.out.println("Respuesta b: " + (2 * b + 3 * (a - c)));
		System.out.println("Respuesta c: " + (a / b));
		System.out.println("Respuesta d: " + (a % b));
		System.out.println("Respuesta e: " + (a / c));
		System.out.println("Respuesta f: " + (a % c));
		System.out.println("Respuesta g: " + (a * b / c));
		System.out.println("Respuesta h: " + (a * (b / c)));
		System.out.println("Respuesta i: " + ((a * c) % b));
		System.out.println("Respuesta j: " + (a * (c % b)));
		System.out.println("Respuesta k: " + ((3 * a - 2 * b) % (2 * a - c)));
		System.out.println("Respuesta l: " + (2 * (a / 5 + (4 - b * 3)) % (a + c - 2)));
		System.out.println("Respuesta m: " + ((a - 3 * b) % (c + 2 * a) / (a - c)));
		System.out.println("Respuesta n: " + (a - b - c * 2));

		/*
		 * Si x = p , y = q , z= r son variables de tipo double con valores x= 88, y =
		 * 3.5, z = -5.2, determina el valor de las siguientes expresiones aritméticas.
		 * Obtén el resultado de cada expresión con un máximo de cuatro decimales.
		 */

		double p = 88;
		double q = 3.5;
		double r = -5.2;
		System.out.println("Respuesta a: " + (p + q + r));
		System.out.println("Respuesta b: " + (2 * q + 3 * (p - r)));
		System.out.println("Respuesta c: " + (p / q));
		System.out.println("Respuesta d: " + (p % q));
		System.out.println("Respuesta e: " + (p / (q + r)));
		System.out.println("Respuesta f: " + ((p / q) + r));
		System.out.println("Respuesta g: " + (2 * p / 3 * q));
		System.out.println("Respuesta h: " + (2 * p / (3 * q)));
		System.out.println("Respuesta i: " + (p * q % r));
		System.out.println("Respuesta j: " + (p * (q % r)));
		System.out.println("Respuesta k: " + (3 * p - r - 2 * p));
		System.out.println("Respuesta l: " + (2 * p / 5 % q));
		System.out.println("Respuesta m: " + (p - 100 % q % r));
		System.out.println("Respuesta n: " + (p - q - r * 2));

		/*
		 * Dadas las variables tipo int firstNum, secondNum , apuntando a los valores 5,
		 * 10. Mediante un operador ternario , utilizando firstNum y secondNum, haga que
		 * una tercera variable denominada result tipo int apunte al valor -5;
		 */

		int firstNum, secondNum, result;
		
		firstNum = 5;
		secondNum = 10;
		
		result = firstNum < secondNum? firstNum - secondNum : secondNum;
		
		System.out.println(result);
	}
}
