package damestudio.arq.model;

public class Habitacion extends Estancia {
	
	private int numPuertasArm;
	private boolean accesoBanio;
	
	public Habitacion(String nombre, double m2, int numPuertas, int numVentanas, int numPuertasArm,
			boolean accesoBanio) {
		super(nombre, m2, numPuertas, numVentanas);
		this.numPuertasArm = numPuertasArm;
		this.accesoBanio = accesoBanio;
	}


	@Override
	public String toString() {
		return "Habitacion" + "\nNumPuertasArm: " + numPuertasArm + ", accesoBanio: " + accesoBanio;
	}
	
	

}
