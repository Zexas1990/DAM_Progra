package dam.biblioteca.model;

public class CD extends Ejemplar {
	
	protected String nombre;
	protected double duracion;
	
	
	public CD(int totalEjem, int numEjemPrest, String nombre, double duracion) {
		super(totalEjem, numEjemPrest);
		this.nombre = nombre;
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return  super.toString() + "CD" + "\nNombre=" + nombre + ", duracion=" + duracion;
	}

	
}
