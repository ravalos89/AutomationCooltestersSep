package com.java;

public class PrimitiveTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short var1 = 130;
		short var2 = 20;
		
		int var3 = 1000;
		
		System.out.println("El valor: " + var3);
		
		var3 = 50;
		System.out.println("Ahora el valor es: "+var3);
		
		var3 = 57;
		System.out.println("Ahora el valor es: "+var3);
		
		double var4 = 2.24;
		System.out.println("La puerta mide: "+var4+"mts");
		
		char letra;
		letra = '\u00A9';
		System.out.println(letra);
		
		String var5 = "Hola";
		String var6 = " a todos!!!!";
		
		System.out.println(var5+var6+letra);
		
		
		// Operadores aritmeticos
		
		double x = 12.6;
		int y = 4;
		
		double suma = x / y;
		System.out.println("Esta es mi suma: "+suma);
		
		// Operadores unarios
		
		int a = 3;
		a--;
		--a;
		
		System.out.println(a);
		
//		if(!isDog) {
//			
//		}
		
		// Relacionales & condicional
		int var10 = 5;
		int var11 = 6;
		boolean isDog = true;
		
		if(var10>=var11 || isDog) {
			System.out.println("BLOCK CODE");
		}
		

		
	}

}
