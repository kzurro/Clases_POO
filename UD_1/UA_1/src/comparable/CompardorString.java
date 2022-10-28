package comparable;

import java.util.Comparator;

public class CompardorString implements Comparator<Objeto> {

	@Override
	public int compare(Objeto o1, Objeto o2) {

		return o1.getMensaje().compareTo(o2.getMensaje());
	}

}
