package xm.com.everis.general;

import mx.com.everis.clasepadre.Liquido;
import mx.com.everis.claseshijas.Cafe;
import mx.com.everis.claseshijas.Leche;

public class Taza {
	Liquido liquido;
	
	public void agregarLiquido(Liquido liquido){
		liquido.batir();
		if(liquido instanceof Cafe) {
			System.out.println("Cafe");
		}else if (liquido instanceof Leche){
			System.out.println("Leche");
		}
	}
}
