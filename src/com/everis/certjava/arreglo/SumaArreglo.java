package com.everis.certjava.arreglo;

public class SumaArreglo {
	
	public static void main (String argd[]){
	
	int[] arreglo = new int[4];
	//int[] suma = new int[1]; 
	arreglo[0]= 1;
	arreglo[1]= 2;
	arreglo[2]= 3;
	arreglo[3]= 4;
	
	int suma=0;
	for(int i=0; i<arreglo.length; i++){
		System.out.println("Indices: " + i);
		suma+=arreglo[i];
		System.out.println("Suma Ascendente: " + suma);	
	}
	
	System.out.println("----------------");
	
	suma=0;
	for(int i=arreglo.length-1; i>=0; i--){
		System.out.println("Indices: " + i);
		suma+=arreglo[i];
		System.out.println("Suma Descendente: " + suma);
	}
	
}
}
