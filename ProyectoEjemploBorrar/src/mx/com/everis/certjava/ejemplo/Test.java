package mx.com.everis.certjava.ejemplo;
import mx.com.everis.certjava.ejemplo2.Clase2;
import mx.com.everis.certjava.estatico.Estatico;
import mx.com.everis.certjava.interfaces.Interfaces;
import static mx.com.everis.certjava.estatico.Estatico.getValidStatus;
import static mx.com.everis.certjava.estatico.Estatico.lugar;
import static mx.com.everis.staticimport.StaticImportAmbig.*;
import static mx.com.everis.certjava.ejemplo2.Clase2.lugar2;
import static mx.com.everis.certjava.estatico.Estatico.obj;
import static java.lang.Long.MAX_VALUE;

public class Test implements Interfaces{

	/*
	 * Identifiers must start with a letter, a concurrency character ($), or a connecting character such the 
	 * underscore(_). Identifiers cannot start with a digit
	 */
//	String 5hola;
	String hola;
	String $hola;
	String _hola;
	
	/*
	 * After the first character, identifiers can contain any combination of letters, concurrency characters, connecting characters
	 * or numbers. 
	 */

	String holaJGDJFD;
	String ol1324234;
	//String Hol###;
	String hola$$$;
	String nombrea;
//	String jdasjda--;
	String hola___;
	
	/*
	 * In practice, there is no limit to the number of characters an identifier can contain.
	 */
	
	String odkasdalskndañklsdasñlkdnaskdnalskndaslndlaskndaslkdnalskdnañsldnaskñdnasndlaskdasñndasñkl;
//	String 112321321321321231;
	String daskdajks132132132312312321312312312312312312;
	
	/*
	 * You can use a Java keyword as an identifiers.
	 */
	
	//int int;
	//int package;
	
	/*
	 * Identifiers in java are case-sensitive; foo and FOO are two different identifiers
	 */
	
	String foo;
	String FOO;
	String FoO;

	public static void main(String[] args){
		getValidStatus();
		
		Long age = MAX_VALUE;
		//Integer edad = MAX_VALUE;
		
		String data= lugar;
		Clase2 obj;
	}

	
	
	@Override
	public void Clase() {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}
	
	static void Habla(Interfaces sujeto){
		sujeto.Clase();
	}
	

}


