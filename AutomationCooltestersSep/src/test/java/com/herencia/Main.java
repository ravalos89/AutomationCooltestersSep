package com.herencia;

public class Main {

	public static void main(String[] args) {
		
		Padre nicolas = new Padre();		
		System.out.println("Nicolas tiene " + nicolas.colorOjos());
		
		Hijo arturo = new Hijo();		
		System.out.println("Arturo tiene " + arturo.colorOjos());
		
		Nieto rodrigo = new Nieto();
		System.out.println("Rodrigo tiene " + rodrigo.colorOjos());
		
		Ciclos ciclos = new Ciclos();
//		ciclos.contador(100);
	}

}
