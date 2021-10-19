package com.herencia;

public class Ciclos {

	public static void main(String[] args) {
		
		//While
		
		int numero = 1;
		
		while(numero <= 10) {
			System.out.println("El numero es "+ numero);
			numero++;
		}
		
		// Do-While - Cuantas veces se tiene que sumar un numero a si mismo para llegar a 100?
		
		int numeroSum = 5;
		int sumTotal = 0;
		int count = 0;
		
		do {
			sumTotal = sumTotal + numeroSum;
			count++;
		}while(sumTotal<100); // Mientras sea true
		
		System.out.println("El numero se sumo "+count);
		
		// FOR contador hasta 10
		System.out.println("#############################");
		for(int i=1; i<numero ; i++) {
			// BLOCK CODE
			System.out.println("El numero es "+ i);
		}
		
		imprimeTodo();
		contador(10, true);
		contador(100);
		
		System.out.println("Suma int "+suma(1, 2));
		System.out.println("Suma double "+suma(1.3, 2.4));
		

	}
	
	public static void imprimeAlgo() {
		System.out.println("ALGO");
	}
	
	public static void imprimerNada() {
		System.out.println("NADA");
	}
	
	public static void imprimeTodo() {
		imprimeAlgo();
		imprimerNada();
	}
	
	private static int contador(int numero) {
		int count=0;
		for(int i=1; i<=numero ; i++) {
			System.out.println("El numero es "+ i);
			count++;
		}
		return count;
	}
	
	// Overloading
	public static int contador(int numero, boolean exit) {
		int count=0;
		for(int i=1; i<=numero ; i++) {
			System.out.println("El numero es del metodo sobrecargado "+ i);
			count++;
		}
		return count;
	}
	
	public static int suma(int x, int y) {
		return x+y;
	}
	
	public static double suma(double x, double y) {
		return x+y;
	}

}
