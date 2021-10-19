package com.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Animal ricardo = new Humano();
		ricardo.speak();
		
		Animal puppy = new Perro();
		puppy.speak();
		
		Animal gardfield = new Gato();
		gardfield.speak();

	}

}
