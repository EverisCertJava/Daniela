package mx.com.everis.certjava.certification;

import mx.com.everis.certjava.interfaces.EjemploInterface;

public class ExamQuestion implements EjemploInterface{
	
	public ExamQuestion(){
		int a=1;
		int b=1;
		int c= a+b;
		System.out.println(c);
	}
	
	public ExamQuestion(String palabra){
		System.out.println("Mala " + palabra);
	}

	@Override
	public String Aprobado() {
		System.out.println("Aprobaste");
		return null;
	}

	@Override
	public int calificacion() {
		int a=2;
		int b=3;
		int suma = a + b;
		return suma;
	}
	
	
}
