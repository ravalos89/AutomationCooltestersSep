package com.java;

public class GenerarCoche {

	public static void main(String[] args) {
		
		// Tesla
		Coche cocheTestla = new Coche("Tesla", "Rojo", "2020", 4, 2, false);
		cocheTestla.setMarca("FORD");
		cocheTestla.setColor("Gris");
		cocheTestla.setLlantas(3);
		
		System.out.println("Mi coche Tesla es de color "+ cocheTestla.getColor());
		System.out.println("Mi coche Tesla es de color "+ cocheTestla.getLlantas());
		// Nissan
		Coche nissan = new Coche("Nissan", "Azul", "2019", 4, 4, false);
		System.out.println("Mi coche Nissan es de color "+ nissan.getColor());
		
		// Desconocido
		Coche coche = new Coche();
	}

}
