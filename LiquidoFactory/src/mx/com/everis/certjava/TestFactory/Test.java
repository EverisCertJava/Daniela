package mx.com.everis.certjava.TestFactory;

import mx.com.everis.certjava.Interface.Padre;
import mx.comeveris.certjava.Factory.TazaFactory;

public class Test {

	public static void main(String[] args) {
		Padre padre = TazaFactory.getBatir("Leche");
		padre.Batir();
		
		padre= TazaFactory.getBatir("Cafe");
		padre.Batir();
	}

}
