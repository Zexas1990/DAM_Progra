package dam.empresa.model;

public class EmpleadoProduccion extends Empleado {
	
	public static final String[] TURNOS = {"MAÑANA", "TARDE", "NOCHE"};
	
	private String turno;
	private double plusNoct;
	
	
	public EmpleadoProduccion(String nombre, String dni, double salario, String turno, double plusNoct) {
		super(nombre, dni, salario);
		this.turno = turno;
		this.plusNoct = plusNoct;
	}


	public double getPlusNoct() {
		return plusNoct;
	}
	
	
	//@Override
//	public double getSalario() {
	//	return super.getSalario() + plusNoct;
	//}


	public String getTurno() {
		return turno;
	}


	@Override
	public String toString() {
		return "Empleado de produción: \n" + super.toString() + "\nTurno: " + turno + (turno.equals(TURNOS[2])? "\nPlus de nocturnidad: " + plusNoct : "");
	}
	
	

}
