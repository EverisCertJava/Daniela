package mx.com.everis.certjava.clases;

public final class Persona {
	
	final String  nombre ;
	
	Persona(){
		nombre = "f";
	}
	
	public final void getNmbre(){
		/**
		 * Hace referencia al momento de la instancia, a la variable
		 */
		//nombre = nombre;
		System.out.println("Tu nombre ") ;
	}
}
