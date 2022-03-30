package damestudio.arq.model;

public class Salon extends Estancia {
	
	private int numPuntosRed;
	private boolean tieneTerraza;
	private double m2ter;
	
	
	public Salon(String nombre, double m2, int numPuertas, int numVentanas, int numPuntosRed, boolean tieneTerraza,
			double m2ter) {
		super(nombre, m2, numPuertas, numVentanas);
		this.numPuntosRed = numPuntosRed;
		this.tieneTerraza = tieneTerraza;
		this.m2ter = m2ter;
	}


	public double getM2ter() {
		return m2ter;
	}


	public boolean isTieneTerraza() {
		return tieneTerraza;
	}


	@Override
	public String toString() {
		return super.toString() + traducirTerraza() +  "\nTerraza" + m2ter + "m2";
	}


	private String traducirTerraza() {
		return "\n¿Tiene terraza?" + (tieneTerraza? "SI":"NO");
	}
	
	

}
