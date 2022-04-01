package ej2.asociacion;

public class Carrera {

	public int distancia; 
	public int ronda;
	public long fecha;
	
	
	public Carrera(int distancia, int ronda, long fecha) {
		this.distancia = distancia;
		this.ronda = ronda;
		this.fecha = fecha;
	}


	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	public int getRonda() {
		return ronda;
	}


	public void setRonda(int ronda) {
		this.ronda = ronda;
	}


	public long getFecha() {
		return fecha;
	}


	public void setFecha(long fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
