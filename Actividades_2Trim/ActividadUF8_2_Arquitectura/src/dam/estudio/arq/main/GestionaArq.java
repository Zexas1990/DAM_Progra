package dam.estudio.arq.main;

import java.util.Scanner;

import damestudio.arq.model.Casa;
import damestudio.arq.model.Estancia;

public class GestionaArq {
	
	static Scanner sc;
	static Casa casa;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarCasa();
		
		int opcion = 0;
		
		while(opcion != 3) {
			opcion = solicitarOpcionMenu();
			
			switch (opcion) {
			case 1:
				addEstancia();
				break;
			case 2:
				mostrarCasa();
				break;

			default:
				System.out.println("****Fin del proceso****");
				break;
			}
		}
		
		
		
		sc.close();
	}
	
	
	private static void addEstancia() {
		int tipo = solicitarTipoEstancia();

		switch (tipo) {
		case 0:
			//addHall()
			break;
		case 1:
			//addCocina()
			break;
		case 2:
			//addSalon()
			break;
		case 3:
			//addHabitacion()
			break;
		case 4:
			//addBanio()
			break;

		}
	}
	
	private static int solicitarTipoEstancia() {
		int tipo = -1;
		boolean valNoVal = true;
		
		while(valNoVal) {
			try {
				System.out.println("\nIndica que tipo de estancia deseas introducir");
				for (int i = 0; i < Estancia.ESTANCIAS.length; i++) {
					System.out.println(i + " - para introducir una estancia de tipo " + Estancia.ESTANCIAS[i]);
					
				}
				tipo = Integer.parseInt(sc.nextLine());
				
				if(tipo >= 0 && tipo <= Estancia.ESTANCIAS.length - 1) {
					valNoVal = false;
				}else {
					throw new NumberFormatException();
				}
				
			}catch (NumberFormatException e) {
				System.out.println("El valor deber estar entre: " + 0 + " y " + (Estancia.ESTANCIAS.length - 1));
			}
		}
		
		return tipo;
	}
	
	private static void mostrarCasa() {
		
		System.out.println(casa);
		System.out.println("\nTotal m2: " + casa.calcularTotalM2());
	}

	private static int solicitarOpcionMenu() {
		int opc = 0;
		boolean valNoVal = true;
		while(valNoVal) {
			try {
				System.out.println("introduce la accion que deseas realizar" 
				+ "\n1 - para añadir estancia" 
				+ "\n2 - para mostrar casa" 
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


	private static void inicializarCasa() {
		System.out.println("Introduce la direccion");
		String direccion = sc.nextLine();
		
		Casa casa = new Casa(direccion);
	}

}
