package dam.model;

public class Encuesta {
	
	public static final String PREG_EDAD = "Edad: ";
	public static final String PREG_COVID = "¿Ha pasado el Covid? ";
	public static final String PREG_SINT = "¿Qué sintomas padecio? ";
	public static final String PREG_GRAV = "Nivel de gravedad: ";
	
	public static final String[] NIVELES_GRAV = {"Ninguna", "Leve", "Media", "Alta", "Hospitalización"};
	
	private int edad;
	private boolean covid;
	private String sintomas;
	private int gravedad;
	
	public static final String[] RESP_COVID = {"SI","NO"};
	
	public Encuesta(int edad, boolean covid, String sintomas, int gravedad) {
		this.edad = edad;
		this.covid = covid;
		this.sintomas = sintomas;
		this.gravedad = gravedad;
	}

	
	@Override
	public String toString() {
		
		return PREG_EDAD + edad + "\n" + PREG_COVID + traducirCovid()
		+ "\n" + PREG_SINT + sintomas + "\n" + PREG_GRAV + traducirGravedad();
	}


	private String traducirGravedad() {
		
		return NIVELES_GRAV[gravedad - 1];
	}


	private String traducirCovid() {
		
		return covid? "SI" : "NO";
	}
	
	
}
