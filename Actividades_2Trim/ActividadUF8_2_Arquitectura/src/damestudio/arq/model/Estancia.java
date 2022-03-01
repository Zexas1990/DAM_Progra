package damestudio.arq.model;

public class Estancia {
	
	public static final String[] ESTANCIAS = {"HALL", "COCINA", "SALON", "HABITACION", "BAÑO"};
	protected String nombre;
	protected double m2;
	protected int numPuertas;
	protected int numVentanas;
	
	
	public Estancia(String nombre, double m2, int numPuertas, int numVentanas) {
		this.nombre = nombre;
		this.m2 = m2;
		this.numPuertas = numPuertas;
		this.numVentanas = numVentanas;
	}


	public double getM2() {
		return m2;
	}


	@Override
	public String toString() {
		return "Estancia" + "\nNombre:" + nombre + ", m2 " + m2 + ", numero de puertas: " + numPuertas 
				+ ", numero de ventanas: " + numVentanas ;
	}


	

}
