package damestudio.arq.model;

public class Banio extends Estancia {
	
	private boolean ducha;
	private boolean banera;
	
	public Banio(String nombre, double m2, int numPuertas, int numVentanas, boolean ducha, boolean banera) {
		super(nombre, m2, numPuertas, numVentanas);
		this.ducha = ducha;
		this.banera = banera;
	}

	@Override
	public String toString() {
		return "Banio" + "\nDucha: " + ducha + ", banera: " + banera;
	}
	
	

}
