package mx.com.everis.certjava.ejemplo;

import mx.com.everis.certjava.interfaces.MiInterface;

 abstract public class Persona extends Persona3 implements MiInterface{
	
	//Puede haber metodos normales o abstractos
	 //En una clase no abstacta no puedes definir metodos abstarctos
	 /**
	  * En una clase abstracta si puedo tener metodos normales y abstractos
	  */
	public abstract void getPersona();
	
	public abstract void getC();
	
	public void getNombre(){
		System.out.println("Daniela");
	}

}
