package herencia;

public class PoligonoApp {

	public static void main(String[] args) {

		Poligono figura = new Poligono() {

			@Override
			public double calcularArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		Poligono cuadrado = new Cuadrado("ROJO", 2);

		System.out.println(cuadrado.calcularArea());

		Cuadrado cuadrado2 = new Cuadrado("AZUL", 4);

		System.out.println(cuadrado2.calcularArea());

		Triangulo triangulo = new Triangulo("VERDE", 12, 10);

		System.out.println(triangulo.calcularArea());

	}

}
