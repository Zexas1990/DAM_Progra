package dam.biblioteca.main;

import java.util.ArrayList;
import java.util.Scanner;

import dam.biblioteca.model.Ejemplar;

public class SimularBiblioteca {

	static ArrayList<Ejemplar> biblioteca;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		
		inicializarBiblio();
		
		//TODO: mostrar menu
		int opcion = 0;
		
		while(opcion != 3) {
			opcion = solicitarOpcionMenu();
			
			switch (opcion) {
			case 1:
				visualizarListado();
				break;
			case 2:
				alquilarEjemplar();
				break;
			case 3:
				devolverEjemplar();
				break;

			default:
				System.out.println("****FIN DEL PROCESO****");
				break;
			}
		}
		
		//TODO: gestionar opcion
		
		
	}

	private static int solicitarOpcionMenu() {
		int opc = 0;
		boolean valNoVal = true;
		
		while(valNoVal) {
			try {
				System.out.println("Introduce la accion que deseas realizar:" 
				+ "\n1 - para visualizar el listado." 
				+ "\n2 - para alquilar el ejemplar." 
				+ "\n3 - para devolver el ejemplar"
				+ "\n4 - para finalizar el proceso");
				opc = Integer.parseInt(sc.nextLine());
				
				if(opc >= 1 && opc <= 4) {
					valNoVal = false;
				}else {
					throw new NumberFormatException();
				}
				
			}catch (NumberFormatException e) {
				System.out.println("El valor deber estar entre " + 1 +  " y " + 4);
			}
		}
		return opc;
	}

}
