package ej2.asociacion;

public class Resultado {

	private double tiempo;
	private int posicion;
	private Carrera carrera;
	private Atleta atleta;
	
	
	public Resultado(double tiempo, int posicion, Carrera carrera, Atleta atleta) {
		this.tiempo = tiempo;
		this.posicion = posicion;
		this.carrera = carrera;
		this.atleta = atleta;
	}


	public double getTiempo() {
		return tiempo;
	}


	public int getPosicion() {
		return posicion;
	}


	public Carrera getCarrera() {
		return carrera;
	}


	public Atleta getAtleta() {
		return atleta;
	}
	
	
	
	
	
	
}
