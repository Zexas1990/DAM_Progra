package dam.empresa.main;

import java.util.Scanner;

import dam.empresa.model.Empleado;
import dam.empresa.model.EmpleadoDistribucion;
import dam.empresa.model.EmpleadoProduccion;
import dam.empresa.model.Empresa;

public class GestionEmpresa {

	static Empresa empresa;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		crearEmpresa();
		
		int opcion = 0;
		
		while(opcion != 3) {
			opcion = solicitarOpcionMenu();
			
			switch (opcion) {
			case 1:
				addEmpleado();
				break;
			case 2:
				mostrarEmpresa();
				break;

			default:
				System.out.println("****FIN DEL PROCESO****");
				break;
			}
		}
		
		

	}

	private static void mostrarEmpresa() {
		System.out.println("\nDATOS EMPRESA");
		System.out.println(empresa);
		
		System.out.println("\nTOTAL SALARIOS");
		System.out.println(empresa.calcularTotalSalarios());
	}

	private static void addEmpleado() {
		String tipo = solicitarTipo();
		
		String nombre;
		String dni = solicitarDni();
		double salario = solicitarDouble();
		
		Empleado emple = null;
		
		if(tipo.equals(Empresa.TIPOS[0])) {
			//DATOS EMPLEADO PRODUCIÓN
			String turno = solicitarTurno();
			double plusNoct = 0;
			
			if(turno.equals(EmpleadoProduccion.TURNOS[2])) {
				plusNoct = solicitarDouble("Introduce el plus de nocturnidad")
			}
			emple = new EmpleadoProduccion(nombre, dni, salario, turno, plusNoct);
			
		}else {
			//DATOS EMPLEADO DISTRIBUCION
			String zona = solicitarZona();
			emple = new EmpleadoDistribucion(nombre, dni, salario, zona);
		}
		
		empresa.addEmpleado(emple);
		
		
		System.out.println("Introduce el nombre del empleado");
		nombre = sc.nextLine();
		
		dni = solicitarDni();
		
		
		Empleado empleado = new Empleado(nombre, dni, salario);
		
		
	}

	

	
	private static double solicitarDouble(String mensaje) {
		double cant = 0;
		boolean valNocal = true;
		
		while(valNocal) {
			try {
				System.out.println(mensaje);
				cant = Double.parseDouble(sc.nextLine());
				
				if (cant > 0) {
					valNocal = false;
				}else {
					throw new NumberFormatException();
				}
				
			} catch (Exception e) {
				System.out.println("El valor debe ser numerico y mayor que 0");
			}

		}
		
		return 0;
	}

	private static String solicitarTipo() {
		String tipo = "";
		String mensaje = "Indica el tipo de empleado: " + Empresa.TIPOS[0] + " o " + Empresa.TIPOS[1];
		
		while(!tipo.equals(Empresa.TIPOS[0]) && !tipo.equals(Empresa.TIPOS[1])) {
			System.out.println(mensaje);
			tipo = sc.nextLine().toUpperCase().trim();
			
			if(!tipo.equals(Empresa.TIPOS[0]) && !tipo.equals(Empresa.TIPOS[1])) {
				System.out.println("El valor debe ser " +  Empresa.TIPOS[0] + " o " + Empresa.TIPOS[1]);
			}
		}
		
		return tipo;
	}

	private static void crearEmpresa() {
		
	
		String nombre = soliciarCadena("Introduce el nombre de la empresa");
		
		Empresa empresa = new Empresa(nombre);
		
	}

	private static String soliciarCadena(String mensaje) {
		String cadena = "";
		
		while (cadena.isEmpty()) {
			System.out.println(mensaje);
			cadena = sc.nextLine().toUpperCase().trim();
			
			if(cadena.isEmpty()) {
				System.out.println("El valor introducido no puede estar vacío");
			}
		}
		
		return cadena;
	}

	private static int solicitarOpcionMenu() {
		int opc = 0;
		boolean valNoVal = true;
		
		while(valNoVal) {
			try {
				System.out.println("Introduce la accion que deseas realizar:" 
				+ "\n1 - para añadir un empleado." 
				+ "\n2 - para mostrar los datos de la empresa junto con el total de los salarios." 
				+ "\n3 - para finalizar la operacion");
				opc = Integer.parseInt(sc.nextLine());
				
				if(opc >= 1 && opc <= 3) {
					valNoVal = false;
				}else {
					throw new NumberFormatException();
				}
				
			}catch (NumberFormatException e) {
				System.out.println("El valor deber estar entre " + 1 +  " y " + 3);
			}
		}
		return opc;
	}

}
