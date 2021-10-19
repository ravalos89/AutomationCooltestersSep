package com.java;

public class Array {

	public static void main(String[] args) {
		
		// Arreglo Unidimensional
		String[] dias = {"L", "M", "Mi", "J", "V", "S", "D"};
		
		System.out.println("El dia de hoy es : "+ dias[6]);
		
		System.out.println("########################");
		
		for(int i=0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		// Arreglo bidimensional
		
		String[][] nombreCompleto = new String[2][2];
		
		nombreCompleto[0][0] = "Guillermo";
		nombreCompleto[0][1] = "Leon";
		nombreCompleto[1][0] = "Rey";
		nombreCompleto[1][1] = "Morales";
		
		System.out.println("El nombre completo es: "+ nombreCompleto[1][0] +" "+ nombreCompleto[0][1]);
		
		int[][] array = new int[9][3];
		
	}

}
