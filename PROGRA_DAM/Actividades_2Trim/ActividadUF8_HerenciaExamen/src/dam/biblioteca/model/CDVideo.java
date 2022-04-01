package dam.biblioteca.model;

public class CDVideo extends CD {
	
	private String clasificacion;

	public CDVideo(int totalEjem, int numEjemPrest, String nombre, double duracion, String clasificacion) {
		super(totalEjem, numEjemPrest, nombre, duracion);
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return  super.toString() + "CDVideo" + "\nClasificacion=" + clasificacion;
	}
	
	

}
