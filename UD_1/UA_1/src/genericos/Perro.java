package genericos;

public class Perro<T> implements Identificable<T> {

	T identificador;

	public T getIdentificador() {
		return identificador;
	}

	protected void setIdentificador(T identificador) {
		this.identificador = identificador;
	}

	public Perro(T identificador) {
		setIdentificador(identificador);
	}

	@Override
	public T getId() {
		return getIdentificador();
	}

}
