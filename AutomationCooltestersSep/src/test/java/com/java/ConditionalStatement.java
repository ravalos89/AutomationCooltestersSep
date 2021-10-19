package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// Ejercicio limite de velocidad

		int velocidad = 90; // Km/h
		int limiteVelocidad = 80; // km/h
		boolean carretera = true;

		if (carretera == true) {
			limiteVelocidad = 110;

			if (velocidad > limiteVelocidad) {
				System.out.println("MULTA");
			} else {
				System.out.println("PREMIO");
			}
		} else if (velocidad > limiteVelocidad) {
			System.out.println("MULTA");
		}  else {
			System.out.println("PREMIO");
		} 
	}

}
