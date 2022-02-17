package list.ej3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Seleccion {
	
	static HashMap<Integer, String> campo;
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		campo = new HashMap<Integer, String>();
		
		campo.put(1, "Casillas");
		campo.put(3, "Pique");
		campo.put(5, "Puyol");
		campo.put(6, "Iniesta");
		campo.put(7, "Villa");
		campo.put(8, "Xavi Hernandez");
		campo.put(11, "Capdevila");
		campo.put(14, "Xabi Alonso");
		campo.put(15, "Ramos");
		campo.put(16, "Busquets");
		campo.put(18, "Pedrito");
		
		salidaCampo();
		
		introducirFalta();
		
		finalPartido();

	}

	private static void finalPartido() {
		System.out.println("Procedamos al fin del partido");
		campo.clear();
		
		
	}

	private static void introducirFalta() {
		int num = 0;
		boolean valNoVal = true;
		
		
		while(valNoVal) {
			System.out.println("Introduzca el numero del jugador que ha cometido la falta");
			num = Integer.parseInt(sc.nextLine());
			
			if(campo.containsKey(num)) {
				valNoVal = false;
				System.out.println("El jugador " + campo.get(num) + " ha sido expulsado del campo");
				campo.remove(num);

			}else {
				System.out.println("El jugador indicado no esta en el equipo");
			}
		}
		
		
		
	}

	private static void salidaCampo() {
		System.out.println("Los jugadores se preparan para salir al campo:");
		for (Entry<Integer, String> elemento : campo.entrySet()) {
			System.out.println("Con el número " + elemento.getKey() + "-" + elemento.getValue());
		}
		
	}

}
