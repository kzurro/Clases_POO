package clases;

import java.util.Arrays;
import java.util.Random;

public class Baraja {

	private Carta cartas[];
	private String tipoBaraja;
	private int posSiguienteCarta;

	public Carta[] getCartas() {
		return cartas;
	}

	public String getTipoBaraja() {
		return tipoBaraja;
	}

	public int getPosSiguienteCarta() {
		return posSiguienteCarta;
	}

	protected void setPosSiguienteCarta(int posSiguienteCarta) {
		this.posSiguienteCarta = posSiguienteCarta;
	}

	protected void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	protected void setTipoBaraja(String tipoBaraja) {
		this.tipoBaraja = tipoBaraja;
	}

	public Baraja() {
		setTipoBaraja("Española");
		crearBarajaEspañola();
		setPosSiguienteCarta(0);
	}

	// Crear una baraja nueva española
	private void crearBarajaEspañola() {
		setCartas(new Carta[40]);
		int contador = 0;
		for (String palo : Carta.getPalos()) {
			for (int i = 1; i <= 12; i++) {
				if (i == 8 || i == 9) {
					continue;
				} else {
					getCartas()[contador] = new Carta(i, palo);
				}
				contador++;
			}
		}

	}

	public void barajar() {
		int posAleatoria = 0;
		Carta carta;
		/*
		 * Devuelve un valor int pseudoaleatorio, uniformemente distribuido entre 0
		 * (inclusive) y el valor especificado (exclusivo), extraído de la secuencia de
		 * este generador de números aleatorios. NUNCA REPITE EL MISMO NUMERO
		 */
		Random random = new Random();

		for (int i = 0; i < getCartas().length; i++) {
			posAleatoria = random.nextInt(getCartas().length);
			// OtraForma
			// posAleatoria =(int) (Math.random() * (0 - (getCartas().length + 1)) +
			// (getCartas().length + 1));

			// Intercambiar
			carta = getCartas()[i];
			getCartas()[i] = getCartas()[posAleatoria];
			getCartas()[posAleatoria] = carta;
		}
		// despues de barajar volvemos a poner la carta al inicio
		setPosSiguienteCarta(0);

	}

	public Carta siguienteCarta() {
		Carta carta = null;

		if (posSiguienteCarta == getCartas().length) {
			System.out.println("No hay más cartas");
		} else {
			carta = getCartas()[getPosSiguienteCarta()];
		}
		// setPosSiguienteCarta(posSiguienteCarta++);
		posSiguienteCarta++;

		return carta;
	}

	public int cartasDisponibles() {
		return getCartas().length - getPosSiguienteCarta();
	}

	public Carta[] darCartas(int numeroCartas) {
		Carta[] cartasDar = null;

		if (numeroCartas > getCartas().length) {
			System.out.println("No se pueden dar más cartas de las que hay");
		} else if (cartasDisponibles() < numeroCartas) {
			System.out.println("No hay suficientes cartas que dar");
		} else {
			cartasDar = new Carta[numeroCartas];
			// recorrer el array para ir llenandolo con las cartas disponibles
			for (int i = 0; i < cartasDar.length; i++) {
				cartasDar[i] = siguienteCarta();
			}
		}

		return cartasDar;
	}

	public void cartasMonton() {
		if (cartasDisponibles() == getCartas().length) {
			System.out.println("No se ha sacado ninguna carta");
		} else {
			// recorrer el array de las cartas que han salido( hasta siguientePosición)
			for (int i = 0; i < getPosSiguienteCarta(); i++) {
				System.out.print(getCartas()[i] + ", ");
			}
			/*
			 * de otra forma =>
			 * System.out.println(Arrays.toString(Arrays.copyOf(getCartas(),
			 * getPosSiguienteCarta())));
			 */
		}
		System.out.println("");
	}

	public void mostrarBaraja() {
		if (getPosSiguienteCarta() == getCartas().length) {
			System.out.println("No hay cartas que mostrar");
		} else {
			for (int i = getPosSiguienteCarta(); i < cartas.length; i++) {
				System.out.print(getCartas()[i] + " ");
			}
		}

	}

}