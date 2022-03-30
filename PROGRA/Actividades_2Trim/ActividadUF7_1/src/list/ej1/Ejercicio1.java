package list.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		/**
		 * Crea un programa para que un administrativo introduzca los datos de tres 
			ficheros que contienen la cantidad de kilos de fruta que entran cada 
			semana en un almacén. 
			El programa solicitará los datos de cada fichero de manera que cuando el 
			administrativo introduzca un cero indicará que ha terminado de introducir 
			los datos de ese fichero.
			Una vez introducidos los datos de los tres ficheros el programa unirá 
			todos los datos y los presentará ordenados crecientemente.
		 */
		sc = new Scanner(System.in);
		
		ArrayList<Integer> fichero1 = new ArrayList<Integer>();
		ArrayList<Integer> fichero2 = new ArrayList<Integer>();
		ArrayList<Integer> fichero3 = new ArrayList<Integer>();
		ArrayList<Integer> ficheroFinal = new ArrayList<Integer>();
		
		rellenarFichero(fichero1);
		rellenarFichero(fichero2);
		rellenarFichero(fichero3);
		
		ficheroFinal.addAll(fichero1);
		ficheroFinal.addAll(fichero2);
		ficheroFinal.addAll(fichero3);
		
		ficheroFinal.sort(null);
		
		mostrarFicheroFinal(ficheroFinal);
		
		sc.close();
	}

	private static void mostrarFicheroFinal(ArrayList<Integer> ficheroFinal) {
		System.out.println("\n***TOTAL DE KILOS ORDENADOS***");
		for (Integer kilos : ficheroFinal) {
			System.out.println(kilos);
		}
	}

	private static void rellenarFichero(ArrayList<Integer> fichero1) {
		int kilos = 1;
		
		while(kilos != 0) {
			kilos = solicitarKilos();
			if (kilos != 0) {
				fichero1.add(kilos);
			}
		}
		
		System.out.println("\n***Fichero rellenado***");
	}

	private static int solicitarKilos() {
		int k = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println("Introduce los kilos");
				k = Integer.parseInt(sc.nextLine());
				
				if (k < 0) {
					System.out.println("El valor no puede ser negativo");
				}else {
					valNoVal = false;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser entero");
			}
		}

		
		return 0;
	}

}
