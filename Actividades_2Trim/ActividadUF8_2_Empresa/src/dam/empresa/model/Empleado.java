package dam.empresa.model;

public class Empleado {
	
	protected String nombre;
	protected String dni;
	protected double salario;
	
	
	public Empleado(String nombre, String dni, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}


	public double getSalario() {
		return salario;
	}


	@Override
	public String toString() {
		return "Empleado" + "\nNombre: " + nombre + ", dni: " + dni + ", salario: " + salario;
	}
	

	
	
	
}
