package mx.com.everis.certjava.test;

import mx.com.everis.certjava.clases.Runner;
import mx.com.everis.certjava.padre.Person;

public class Testing {
	
	/**
	 * public: Para que puedan acceder
	 * static: Solo se instancia una vez y vive solo cuando la clase se crea o viva, y vive en la clase
	 * void:  no regresa ningun tipo de dato
	 * main: clase principal
	 * String args[]: Recibe parametros y el tipo se le puede cambiar
	 */
	public static void main (String... args){
		//Runner r = new Runner("a");
		//System.out.println(r);
		System.out.println(args[0]);
		System.out.println(args.length);
	}
}
