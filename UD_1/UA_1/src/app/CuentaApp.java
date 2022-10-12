package app;

import clases.Cuenta;

public class CuentaApp {
	public static void main(String[] args) {

		// Declaramos un par de cuentas usando los dos constructores

		Cuenta miCuenta = new Cuenta("Manolo", 2000.00);
		Cuenta otraCuenta = new Cuenta("Pepe");

		// Imprimimos por consola el getTitular() y el getCantidad de las dos cuentas

		System.out.println("La cuenta de " + miCuenta.getTitular() + ". Con un saldo de: " + miCuenta.getCantidad());
		System.out
				.println("La cuenta de " + otraCuenta.getTitular() + ". Con un saldo de: " + otraCuenta.getCantidad());

		// Vamos a ingresar 105.33 euros a cada cuenta

		miCuenta.ingresar(105.33);
		otraCuenta.ingresar(105.33);

		// usamos el toString que hemos sobreescrito para comprobar el ingreso

		System.out.println(miCuenta.toString());
		System.out.println(otraCuenta.toString());

		// VAMOS A RETIRAR 2000€ DE CADA CUENTA

		miCuenta.retirar(2000);
		otraCuenta.retirar(20000);

		// comprobamos los datos de la cuenta de nuevo con el toString();

		System.out.println(miCuenta.toString());
		System.out.println(otraCuenta.toString());

	}

}
