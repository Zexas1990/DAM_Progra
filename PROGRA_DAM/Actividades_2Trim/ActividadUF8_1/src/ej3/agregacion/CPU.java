package ej3.agregacion;

public class CPU {
	
	private int memoria ;
	private double velocidad;
	
	
	public CPU(int memoria, double velocidad) {
		this.memoria = memoria;
		this.velocidad = velocidad;
	}

	public int getMemoria() {
		return memoria;
	}

	public double getVelocidad() {
		return velocidad;
	}
	
	
	
}
