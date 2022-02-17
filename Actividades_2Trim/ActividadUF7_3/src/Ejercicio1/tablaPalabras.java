package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class tablaPalabras {

	static HashMap<String, Integer> tablaPalabras;
	static TreeMap<String, Integer> ordenPalabras;
	static TreeMap<String, Integer> ordenContrario;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		tablaPalabras = new HashMap<String, Integer>();
		
		
		solicitarPalabras();
		mostrarAlfabetido();
		mostrarOrden();
		
		
	}

	private static void mostrarOrden() {
//		ordenContrario = new TreeMap<String, Integer>();
//		for( String key : ordenContrario.keySet()) {
//			System.out.println(ordenContrario.get(key));
//		}
		
		System.out.println("\nTabla ordenada de menor a mayor");

		ArrayList<Entry<String, Integer>> listaOrd = new ArrayList<>(tablaPalabras.entrySet());
		listaOrd.addAll(tablaPalabras.entrySet());

		listaOrd.sort(Entry.comparingByValue()); // Le decimos que compare por valores

		for (Entry<String, Integer> palabra : listaOrd) {

			System.out.println("La palabra: " + palabra.getKey() + " contiene: " + palabra.getValue() + " caracteres");

		}
		
		
		System.out.println("\nPalabras ordenadas por valor de menor a mayor (opción 2)");
		ArrayList<String> palabrasOrd = new ArrayList<String>(tablaPalabra.keySet());	

		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String uno, String dos) {
				return uno.length() - dos.length();
			}
		};

		palabrasOrd.sort(comp);
		for (String palabra : palabrasOrd) {
	  		System.out.println(palabra + " - " + palabra.length() + " número caracteres");
	  		System.out.println("La palabra: " + palabra + " contiene: " + tablaPalabra.get(palabra) + " caractares");
		}

		
		
	}

	private static void mostrarAlfabetido() {
		//Volcamos el HashMap en un TreeMap ya que este ordena automaticamente las keys
		ordenPalabras = new TreeMap<String, Integer>();
		ordenPalabras.putAll(tablaPalabras);
		
		//System.out.println(ordenPalabras.keySet());
		//Esto seri si solo quisieramos las Key
		
		for (String palabra : ordenPalabras.keySet()) {
			System.out.println("La palabra " + palabra + " tiene " + ordenPalabras.get(palabra) + " caracteres");
		}
		
	}

	private static void solicitarPalabras() {
		String palabra = null;
		
		
		System.out.println("Introduce 10 palabas");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Introduce la " + (i+1) + "º palabra");
			palabra = sc.nextLine();
			
			
			if (tablaPalabras.containsKey(palabra)) {
				System.out.println("La palabra introducida ya se encuentra en la lista");
				i = i-1;
			}else {
				tablaPalabras.put(palabra, palabra.length());
			

			}
			
			
		}
		
		
		
		
	}

}
