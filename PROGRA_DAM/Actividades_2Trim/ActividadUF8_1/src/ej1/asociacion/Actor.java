package ej1.asociacion;

public class Actor {
	
	private String nombre;
	private long nacimiento;
	
	public Actor() {}
	

	public Actor(String nombre, long nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getNacimiento() {
		return nacimiento;
	}


	public void setNacimiento(long nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
	
	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", nacimiento=" + nacimiento + "]";
	}


	public void mostrarActor() {
		System.out.println(this);
	}
	
	
}
