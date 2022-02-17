package eje2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class PruebaMAp {

	static final int MIN = 1;
	static final int MAX = 100;
	static HashMap<Integer, Integer> tablaAlea;

	
	public static void main(String[] args) {
		
		tablaAlea = new HashMap<Integer, Integer>();
		
		insertarAleatorio();
		
		mostarNoAparecidos();
		
		mostrarRepetidos();
		
		mostrarTabla();
		

	}

	private static void mostrarTabla() {
		System.out.println();
		System.out.println("Estos son los valores de la tabla:");
		System.out.print(tablaAlea.toString());
		
	}

	private static void mostrarRepetidos() {
		int apa5 = 5;
		int apa2 = 2;
		System.out.println();
		System.out.println("Estos son los numeros que estan repetidos 5 veces:");
//		for (int i = MIN; i < MAX; i++) {
//			
//			if(tablaAlea.containsKey(i) && tablaAlea.get(i) == apa5) {
//				System.out.print(i + " ");
//			}
//		}
		for (Integer key : tablaAlea.keySet()) {
			if (tablaAlea.get(key) == apa5) {
				System.out.print(key + " ");
			}
		}
		
//		for (Map.Entry<Integer, Integer> entrada : tablaAlea.entrySet()) {
//			if (entrada.getValue() == apa5) {
//				System.out.println(entrada.getKey() + " ");
//			}
//		}
		System.out.println();
		System.out.println("Estos son los numeros que estan repetidos 2 veces:");
		
		for (Integer key : tablaAlea.keySet()) {
			if (tablaAlea.get(key) == apa2) {
				System.out.print(key + " ");
			}
		}
	}

	private static void mostarNoAparecidos() {
		System.out.println("Estos son los numeros que no han aparecido:");
		
		for (int i = MIN; i < MAX; i++) {
			
			if (!tablaAlea.containsKey(i)) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
	}

	private static void insertarAleatorio() {
		int alea = 0;
		int e = 1;
		for (int i = 0; i < MAX; i++) {
		
			alea = generarAleatorio();
			//e = tablaAlea.get(alea);
			
			
			if(tablaAlea.containsKey(alea) ) {
				e = tablaAlea.get(alea) + 1;
				tablaAlea.put(alea, e);
			}else {
				tablaAlea.put(alea, 1);
			}
		}
		
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		int alea = 0;
	
		alea = rd.nextInt(MAX + 1 - MIN) + MIN;
		
		return alea;
		
	}

}
