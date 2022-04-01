package dam.biblioteca.model;


public class Ejemplar {
	
	private int totalEjem;
	private int numEjemPrest;
	

	
	public Ejemplar(int totalEjem, int numEjemPrest) {
		super();
		this.totalEjem = totalEjem;
		this.numEjemPrest = numEjemPrest;
	}


	public boolean prestar() {
		boolean prestado = false;
		
		if(totalEjem > 0 && numEjemPrest < totalEjem) {
			prestado = true;
			numEjemPrest++;
		}
		return false;
	}
	
	
	public boolean devolver() {
		boolean devuelto = false;
		
		if(numEjemPrest > 0 ) {
			devuelto = true;
			numEjemPrest--;
		}
		return devuelto;
	}
	
	public void mostrardatos() {
		System.out.println(this);
	}


	@Override
	public String toString() {
		return "Ejemplar" + "\ntotalEjem=" + totalEjem + ", numEjemPrest=" + numEjemPrest;
	}
	
	
	
}
