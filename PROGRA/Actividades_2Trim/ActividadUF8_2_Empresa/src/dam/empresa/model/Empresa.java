package dam.empresa.model;

import java.util.ArrayList;

public class Empresa {
	
	public static final String[] TIPOS = {"PRODUCIÓN", "DISTRIBUCIÓN"};
	
	private String nombre;
	private ArrayList<Empleado> listaEmp;
	
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.listaEmp = new ArrayList<Empleado>();
		//inicializamos la lista a una lista vacia.
	}

	public ArrayList<Empleado> getListaEmp() {
		return listaEmp;
	}
	
	
	
	
	public void addEmpleado(Empleado emple) {
		this.listaEmp.add(emple);
	}
	
	
    public double calcularTotalSalarios() {
        double totalSalarios = 0;
        
        for (Empleado empleado : listaEmp) {
        	totalSalarios += empleado.getSalario();
        	
        	if(empleado instanceof EmpleadoProduccion) {
        		if(((EmpleadoProduccion) empleado).getTurno().equals(EmpleadoProduccion.TURNOS[2])) {
        			totalSalarios += ((EmpleadoProduccion) empleado).getPlusNoct();
        		}
        	}
        }

        return totalSalarios;
    }

	@Override
	public String toString() {
		String toString = " - " + nombre + "\n";
		for (Empleado empleado : listaEmp) {
			toString += "\n" + empleado;

			
		}
		return toString;
	}
    
}

	
