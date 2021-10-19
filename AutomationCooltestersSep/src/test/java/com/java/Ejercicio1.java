package com.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Variables
		int velocidad = 60;
		int limiteVelocidad = 60;
		boolean isCarretera = false;
		boolean isZonaEscolar = true;
		
		if(isCarretera && isZonaEscolar) {
			System.out.println("ERROR");
		}else if(isCarretera && !isZonaEscolar) {
			limiteVelocidad = 110;

			if (velocidad > limiteVelocidad) {
				System.out.println("CARRETERA - MULTA");
			} else {
				System.out.println("CARRETERA - PREMIO");
			}
		} else if(!isCarretera && isZonaEscolar) {
			limiteVelocidad = 40;

			if (velocidad > limiteVelocidad) {
				System.out.println("SCHOOL - MULTA");
			} else {
				System.out.println("SCHOOL - PREMIO");
			}
		} else {
			if (velocidad > limiteVelocidad) {
				System.out.println("CALLE - MULTA");
			} else {
				System.out.println("CALLE - PREMIO");
			}
		}

	}
}
