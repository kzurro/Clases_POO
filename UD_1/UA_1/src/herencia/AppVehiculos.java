package herencia;

public class AppVehiculos {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo(4, "Seat", "rojo");
		Vehiculo coche1 = new Coche("XC-90", 6, 4, "Volvo", "azul");
		Vehiculo moto1 = new Moto(2, 999);
		Coche coche2 = new Coche(4, "Mercedes", "negro");
		Moto moto2 = new Moto("Honda", "verde");

		Vehiculo[] vehiculos = { vehiculo1, coche1, moto1 };

		for (Vehiculo vehiculo : vehiculos) {

			System.out.println(vehiculo.toString());
		}

		// Moto[] motos = {moto1, moto2};// ojo que esto es un error la moto1 es un
		// vehiculos habría que castearlo
	}

}
