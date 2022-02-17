package Tetris_HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
//import java.util.TreeSet;


public class Tetris {

	static HashMap<String, Integer> datosJugador;
	static Scanner sc;

	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		datosJugador = new HashMap<String, Integer>();
		int respuesta = 0;
		boolean activo = true;
		
		System.out.println("INTRODUCE:");
		
		while(activo) {
			
			System.out.println("\n2- Para mostrar las puntuaciones"  + "\n1- Para registrar un nuevo resultado"
							+ "\n0- Para salir del programaa ");
			respuesta = Integer.parseInt(sc.nextLine());
			
			switch (respuesta) {
			case 2:
				mostrarPuntuaciones();
				break;
			case 1:
				registrarResultado();
				break;
			case 0:
				activo = false;
				break;

			default:
				break;
			}
		
	}
		System.out.println("Finalizando del programa");
}

	private static void mostrarPuntuaciones() {
		
//		if(datosJugador.isEmpty()) {
//			System.out.println("AUN NO SE HA INTRODUCCIDO NINGUNA PUNTUACION");
//		}else {
//			TreeSet<String> ordenJugador;
//			ordenJugador = new TreeSet<String>();
//			ordenJugador.addAll(datosJugador.keySet());
//			
//			System.out.println("**Listado de puntuaciones**");
//			for (String nick : ordenJugador) {
//				System.out.println(nick + ": " + datosJugador.get(nick));
//			}
//		}		
//	}
		TreeMap<String, Integer> ordenJugador;
		ordenJugador = new TreeMap<String, Integer>();
		ordenJugador.putAll(datosJugador);
		
		if(ordenJugador.isEmpty()) {
			System.out.println("AUN NO SE HA INTRODUCCIDO NINGUNA PUNTUACION");
		}else {
			System.out.println("**Listado de puntuaciones**");
			for (String nick : ordenJugador.keySet()) {
				System.out.println(nick + ": " + ordenJugador.get(nick));
			}
		}		
	}

	private static void registrarResultado() {
		String nick = null;
		int punt; 
		System.out.println("Introduce tu Nick :");
		nick = sc.nextLine();
		
		
		punt = obtenerPuntuacion();
		
		if(!datosJugador.containsKey(nick)) {
			datosJugador.put(nick, punt);
			System.out.println("¡PUNTUACIÓN ALMACENADA!");
			
		}else {
			if(punt > datosJugador.get(nick)) {
				datosJugador.put(nick, punt);
				System.out.println("¡NUEVO RECORD!");
				
			}else {
				System.out.println("¡PUNTUACIÓN NO SUPERADA!");
			}
		}		
	}

	private static int obtenerPuntuacion() {
		boolean valNoOK = true;
		int p = 0;;
		
		while(valNoOK) {
			try {
				System.out.println("Introduce tu puntucación :");
				p = Integer.parseInt(sc.nextLine());
				
				if(p > 0) {
					valNoOK = false;
				
				}else {
					throw new Exception("El valor nos es valido, debe ser un numero entero superior a 0");
				}
				
				
			}catch (NumberFormatException e) {
				System.out.println("El valor introducido no es valido debe ser un valor entero");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return p;
		}
	}
