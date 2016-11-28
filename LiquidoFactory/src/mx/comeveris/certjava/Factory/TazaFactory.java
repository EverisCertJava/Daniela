package mx.comeveris.certjava.Factory;
import mx.com.everis.certjava.Classes.Cafe;
import mx.com.everis.certjava.Classes.Leche;
import mx.com.everis.certjava.Interface.Padre;

public class TazaFactory {
	public static Padre getBatir(String accion){
		if(accion.equals("Leche")){
			return new Leche();
		}
		else if(accion.equals("Cafe")){
			return new Cafe();
		}
		return null;
	}
}
