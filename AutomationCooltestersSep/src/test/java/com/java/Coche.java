package com.java;

public class Coche {
	
	private String marca;
	private String color;
	private String modelo;
	private int llantas;
	private int puertas;
	private boolean hybrid;
	
	// Default
	public Coche() {
		
	}
	
	public Coche(String marca, String color, String modelo, int llantas, int puertas, boolean hybrid) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.llantas = llantas;
		this.puertas = puertas;
		this.hybrid = hybrid;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public boolean isHybrid() {
		return hybrid;
	}

	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}
	
	

}
