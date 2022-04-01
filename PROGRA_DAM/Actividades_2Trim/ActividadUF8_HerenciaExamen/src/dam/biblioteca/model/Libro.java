package dam.biblioteca.model;

public class Libro extends Ejemplar {
	
	private String libro;
	private String autor;
	private int numPag;
	
	
	
	public Libro(int totalEjem, int numEjemPrest, String libro, String autor, int numPag) {
		super(totalEjem, numEjemPrest);
		this.libro = libro;
		this.autor = autor;
		this.numPag = numPag;
	}



	@Override
	public String toString() {
		return super.toString() + "Libro" + "\nLibro=" + libro + ", autor=" + autor + ", numPag=" + numPag;
	}

	
	
	
	
}
