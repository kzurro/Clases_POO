package genericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppDuda {
	
	public static <T extends Alistable & ConRazocinio> void main(String[] args) {
		
		Espia espia = new Espia();
		Militar militar = new Militar(123456);
		
		List<T> listaDuda= new ArrayList<>();
		
		listaDuda.add((T) espia);// NO ENTIENDO EL CASTEO
		listaDuda.add((T) militar);
		
		//¿ESTO PORQUE NO ES VALIDO?
		
		List<? extends T> otraListaDuda = new ArrayList<>();
		//otraListaDuda.add(espia); //esto no funciona ¿que habria que hacer para que funcionara?
		
		//¿esto otro porque no funciona?
		
		//Collections.addAll(listaDuda, espia);
		
		
		imprimir(listaDuda);
		imprimir(otraListaDuda);
		
	}
	
	private static <T extends Alistable & ConRazocinio> void imprimir(List<? extends T> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getPuesto());
		}

	}

}
