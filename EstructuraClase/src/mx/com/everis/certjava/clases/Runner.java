package mx.com.everis.certjava.clases;


import mx.com.everis.certjava.interfaces.Athelete;
import mx.com.everis.certjava.interfaces.AtheleteDos;
import mx.com.everis.certjava.padre.Person;

//Una clase no puede ser privada
/**
 * 
 * @author everis
 *Modificadores de acceso: private, default (package), protected, public
 *Solo puede exisistir una clase publica
 *
 *Extends: Obtengo las caracteristicas de la clase de la que extiendo (Heredo)
 *Implements: Implementas de la interfaz, en una interfaz haces declaraciones de metodos pero no le dices que van a hacer los metodos
 *Por default en interfaces son publicas si no se le pone un modificador de acceso
 *No se puede hacer herencia multiple, no la soporta java pero si puedo hacere varias implementaciones y con eso se simula
 *Una clase se compone de un constructor, variables de instancia, variables de clase o estaticas
 */




/**
 * Variables de clase o instancia
 * @author everis
 *
 */
public class Runner extends Person implements Athelete, AtheleteDos{
	
	/**
	 * La clase Object es la clase padre de todas las clases y todas heredan de el.
	 * La clase mas arriba es Person porque de ahi lo estamos heredando  
	 */
	
	/**
	 * Constructor
	 * @author everis
	 *Generalmente se inicializan las variables aqui
	 *Sobre carga de constructores
	 *super hace refencia a la clase padre (en este caso padre)
	 */
	
	 public Runner(){
		 	super("DAniela");
			//System.out.println("Clase hija (Runner)");
		 }
	/**
	 * Sobre carga de constructores, cuando hay varios y se le pasan argumentos	 
	 * @param nombre
	 */
	 
		 Runner(String nombre){
			 System.out.println("Constructor runner class nombre " + nombre);
		 }
		 
		 /**
		  * Es un arreglo de strings que puedes usar como parametros
		  * Te permite ahorrarte los corchetes
		  * varargs
		  */
		 public Runner(String... name){
			 //System.out.println(name[0]);
			 //System.out.println(name[1]);
			 //System.out.println(name[2]);
		 }

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Sobreescribir nos permite darle otro comportamiento al que usualmente tiene
	 */
	@Override
	public String toString() {
		
		return super.toString();
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}

}
