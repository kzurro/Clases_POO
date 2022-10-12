package clases;

public class Persona {

	// constantes

	private final static char SEXO_DEF = 'H';

	static final int INFRAPESO = -1;

	/**
	 * El peso de la persona esta en su peso ideal
	 */
	static final int PESO_IDEAL = 0;

	/**
	 * El peso de la persona esta por encima del peso ideal
	 */
	static final int SOBREPESO = 1;

	// atributos

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	// metodos accesores
	public static char getSexoDef() {
		return SEXO_DEF;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected void setSexo(char sexo) {
		this.sexo = sexo;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}

	protected void setAltura(double altura) {
		this.altura = altura;
	}

	// Constructores

	// Por defecto segun el enunciado

	public Persona() {
		this("", 0, "", SEXO_DEF, 0, 0);
	}

	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, "", sexo, 0, 0);
	}

	public Persona(String nombre, int edad, String dNi, char sexo, double peso, double altura) {
		setNombre(nombre);
		setEdad(edad);
		if (dNi.equalsIgnoreCase("")) {
			generarDni();
		} else {
			setDni(dNi);
		}
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
	}

	public int calcularIMC() {
		int imc;
		// Calculamos el peso de la persona
		double pesoActual = peso / (Math.pow(altura, 2));
		// Segun el peso, devuelve un codigo
		if (pesoActual >= 20 && pesoActual <= 25) {
			imc = PESO_IDEAL;
		} else if (pesoActual < 20) {
			imc = INFRAPESO;
		} else {
			imc = SOBREPESO;
		}
		return imc;
	}

	public boolean esMayorEdad() {
		return getEdad() >= 18;
	}

	private void comprobarSexo() {
		// Si el sexo no es una H o una M, por defecto es H
		if (sexo != 'H' && sexo != 'M') {
			this.sexo = SEXO_DEF;
		}
	}

	private void generarDni() {
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };

		// Generamos un número de 8 digitos
		int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
		int res = numDNI % letras.length;

		// lo seteo a mi Persona
		setDni(String.valueOf(numDNI) + "-" + letras[res]);
	}

	@Override
	public String toString() {
		return "Nombre = " + getNombre() + ", Edad = " + getEdad() + ", Dni= " + getDni() + " Sexo = " + getSexo()
				+ ", Peso = " + getPeso() + ", Altura = " + getAltura();
	}

}
