package mx.com.everis.certjava.university;

import mx.com.everis.certjava.certification.ExamQuestion;

public class AnnualExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamQuestion eq = new ExamQuestion(); 
		ExamQuestion eq2 = new ExamQuestion("Hola"); 
		System.out.println(eq.Aprobado());
		System.out.println(eq.calificacion());
		
	}

}
