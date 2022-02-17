package Ejercicio2;

public class Cancion {

	private String titulo;
	private String integrantes;
	private int duracion;
	
	public Cancion(String titulo, String integrantes, int duracion) {
		this.titulo = titulo;
		this.integrantes = integrantes;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Canciones [titulo=" + titulo + ", integrantes=" + integrantes + ", duracion=" + duracion + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
}
