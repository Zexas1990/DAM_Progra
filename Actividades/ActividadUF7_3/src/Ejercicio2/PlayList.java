package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;


public class PlayList {

	static ArrayList<Cancion> playList;
	static Scanner sc;
	static final int SEGUNDOS_MIN = 10;
	static final int SEGUNDOS_MAX = 600;
	
	public static void main(String[] args) {
		playList = new ArrayList<Cancion>();
		sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a tu PlayList");
		boolean activo = true;
		
		while(activo) {
			int respuesta = 0;
			System.out.println("\n1- Añadir una canción a la playlist" +
								"\n2- Eliminar una canción por nombre y grupo/solista" +
								"\n3- Mostrar las canciones de la lista " +
								"\n4- Reproducir una canción por posición" +
								"\n5- Reproducir toda la lista" +
								"\n6- Indicar tiempo total de la playlist" +
								"\n0- Salir de la playlist");
			respuesta = Integer.parseInt(sc.nextLine());
			
			switch (respuesta) {
			case 1:
				anadirCancion();
				break;
			case 2:
				eliminarCancion();
				break;
			case 3:
				mostrarCanciones();
				break;
			case  4:
				reproducirCancion();
				break;
			case 5:
				reproducirToda();
				break;
			case 6:
				tiempoTotal();
				break;
			case 0:
				System.out.println("** CERRANDO LA PLAYLIST **");
				break;

			default:
				break;
			}
		}
		
		sc.close();

	}

	private static void tiempoTotal() {
		int t = 0;
		
		for (int i = 0; i < playList.size(); i++) {
			
			t = t + playList.get(i).getDuracion();
		}
		System.out.println("TIEMPO TOTAL DE LA PLAYLIST: " + t + "segundos");
	}

	private static void reproducirToda() {
		System.out.println("REPRODUCIENDO:");
		for (int i = 0; i < playList.size(); i++) {
			
			System.out.println("** SE ESTÁ REPRODUCIENDO: " + playList.get(i).getTitulo() 
					+ " de " + playList.get(i).getIntegrantes() + "\nDuracion: " 
					+ playList.get(i).getDuracion() + " segundos");
		}
		
	}

	private static void reproducirCancion() {
		int posi;
		System.out.println("Introduzca la posicion de la cancion que desea reproducir");
		System.out.println("Si no recuerda la posicion pulse 0 y se le volveran a mostrar");
		posi = Integer.parseInt(sc.nextLine());
		
		if(posi == 0) {
			mostrarCanciones();
		}else {
			posi = posi - 1;
			System.out.println("Se esta reproduciendo " + playList.get(posi).getTitulo()
								+ " de " + playList.get(posi).getIntegrantes());
			
		}
		
		
	}

	private static void mostrarCanciones() {
		System.out.println("\nEstas son las canciones de tu PlayList y sus posiciones");
		int i = 0;
		for (Cancion cancion : playList) {
			i = i+1;
			System.out.println(i + "-" + cancion.getTitulo());
		}
		
	}

	private static void eliminarCancion() {
		String tituElim = null;
		String artisElim = null;
		boolean encontrada = false;
		
		System.out.println("Introduce el Titulo de la cancion que deseas eliminar");
		tituElim = sc.nextLine();
		
		System.out.println("Introduce el integrante de la cancion que deseas eliminar");
		artisElim = sc.nextLine();
		
		
		for (int i = 0; i < playList.size() && !encontrada; i++) {
			
			if(playList.get(i).getTitulo() == tituElim  && playList.get(i).getIntegrantes() == artisElim) {
				playList.remove(i);
				encontrada = true;
				
			}
		}
		
		
		System.out.println("LA CANCION HA SIDO ELIMINADA");
		System.out.println("Canciones en la lista: " + playList.size());
		
	}

	private static void anadirCancion() {
		String titulo;
		String integrantes;
		int duracion;

		System.out.println("Introduce el titulo de la canción");
		titulo = sc.nextLine();
			
		System.out.println("Introduce los integrantes o integrantes");
		integrantes = sc.nextLine();
			
		duracion = obtenerduracion();
		
		//Al ArrayList añadimos una nueva Cancion que tiene los siguientes atributos
		playList.add(new Cancion(titulo, integrantes, duracion));
		
		System.out.println("CANCIÓN AÑADIDA");
		System.out.println("Canciones en la lista: " + playList.size());
			
		
	}

	private static int obtenerduracion() {
		boolean valNoVal = true;
		int duracion = 0;
				
		while (valNoVal) {
			try {
				System.out.println("Introduce los segundos la cancion");
				duracion = Integer.parseInt(sc.nextLine());
				
				if (duracion <= SEGUNDOS_MIN && duracion >= SEGUNDOS_MAX) {
					System.out.println("La cancion tiene que tener una duracion minima de " + SEGUNDOS_MIN 
							+ "segundos y una maxima de " + SEGUNDOS_MAX + "segundos");
				}else {
					valNoVal = false;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser entero");
			}
		
		}
		return duracion;
	}
}