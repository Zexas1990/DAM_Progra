package dam.biblioteca.model;

public class CDAudio extends CD {
	
	private int numCanciones;

	public CDAudio(int totalEjem, int numEjemPrest, String nombre, double duracion, int numCanciones) {
		super(totalEjem, numEjemPrest, nombre, duracion);
		this.numCanciones = numCanciones;
	}

	@Override
	public String toString() {
		return super.toString() + "CDAudio" + "\nNumCanciones=" + numCanciones;
	}
	
	

}
