package eje3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Utilidades {

	
	static final int MIN = 1;
	static final int MAX = 100;
	static ArrayList<Integer> listaNumAlea;
	static ArrayList<Integer> noRepetidos;
	
	public static void main(String[] args) {
		
		listaNumAlea = new ArrayList<Integer>();
		
		
		rellenarLista();
		
		imprimirLista();
		
		mostrarNoRepetidos();
		
		mostrarNoRepesOrdDesc();
		

	}

	private static void mostrarNoRepesOrdDesc() {
		// Opción 1
				System.out.println("\nElementos no repetidos en orden descendente (opcion1)");
				noRepetidos.sort(null);
				for (int i = noRepetidos.size() - 1; i >= 0; i--) {
					System.out.print(noRepetidos.get(i) + " ");
				}
				System.out.println();
				
				
				// Opción 2
				System.out.println("\nElementos no repetidos en orden descendente (opcion2)");
				noRepetidos.sort(null);
				Collections.reverse(noRepetidos);
				for (Integer entero : noRepetidos) {
					System.out.print(entero + " ");
				}
				System.out.println();
				
				// Opción 3
				System.out.println("\nElementos no repetidos en orden descendente (opcion3)");
				Comparator<Integer> comparador = Collections.reverseOrder();
				noRepetidos.sort(comparador);
				for (Integer entero : noRepetidos) {
					System.out.print(entero + " ");
				}
				System.out.println();
		
	}

	private static void mostrarNoRepetidos() {
		noRepetidos = new ArrayList<Integer>();
		
		System.out.println("\nLos elementos sin repetir de la lista son: ");
	
		for (int num = MIN; num < MAX; num++) {
			//Si el numero i se encuentra en la lista y la posicion de su primera aparicion coincide con la posicion de la ultima
			//aparicion es que el numero no esta repetido
			if(listaNumAlea.indexOf(num) !=-1 && listaNumAlea.indexOf(num) == listaNumAlea.lastIndexOf(num)) {
				noRepetidos.add(num);
				System.out.print(num + " ");
			}
		
		}
	}

	private static void imprimirLista() {
		System.out.println("Los numeros dentro de la lista son:");
		
		for (int i = 0; i < listaNumAlea.size(); i++) {
			System.out.print(listaNumAlea.get(i) + " ");
		}
		
	}

	private static void rellenarLista() {
		for (int i = 0; i < MAX; i++) {
			listaNumAlea.add(generarAleatorio());
		}
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		int alea = 0;
		
		alea = rd.nextInt(MAX + 1 - MIN) + MIN;
			
		return alea;
			
		
	}

}
