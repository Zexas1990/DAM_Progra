package list.ej2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

		static Scanner sc;
		static ArrayList<Producto> listaCompra;
		
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		incializarArray();
		
		mostrarMenu();
		
		System.out.println("Gracias por organizar su compra con nosotros");
		

	}

	private static void mostrarMenu() {
		int resp = 0;
		
		System.out.println("\nTienes las siguientes opciones:");
		System.out.println("1 - Añadir producto a la lista de la compra" + "\n2 - Eliminar producto de la lista de la compra" 
				+ "\n3 - Mostrar la lista de la compra" + "\n4 - Para terminar");
		System.out.println("Indique su eleccion");
		resp = Integer.parseInt(sc.nextLine());
		
		switch (resp) {
		case 1: resp = 1;
			añadirProducto();
			break;
		case 2: resp = 2;
			eliminarProducto();
			break;
		case 3: resp = 3;
			mostrarProductos();
			break;
		case 4: resp = 4;
		break;	
		default:
			break;
		}
		

		
	}

	private static void eliminarProducto() {
		int num = 0;
		System.out.println("Estos son los productos que contiene la lista:");
		System.out.println();
		mostrarProductos();
		
		System.out.println("Que puesto ocupa en la lista el elemento que quiere eliminar?");
		num = Integer.parseInt(sc.nextLine()) - 1;

		listaCompra.remove(num);
		
		mostrarMenu();
	}

	private static void mostrarProductos() {
//		for (Producto Producto : listaCompra) {
//			System.out.println(Producto + " ");
//		}
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println((i + 1) + "º " + listaCompra.get(i));
		}
		
		mostrarMenu();
		
	}

	private static void añadirProducto() {
		String nombre = null;
		int cantidad = 0;
		
		System.out.println("¿Cuál es el nombre del producto?");
		nombre = sc.nextLine();
		
		System.out.println("¿Qué cantidad has comprado?");
		cantidad = Integer.parseInt(sc.nextLine());
		
		listaCompra.add(new Producto(nombre, cantidad));
		
		mostrarMenu();
	}

	private static void incializarArray() {
		
		listaCompra = new ArrayList<Producto>();
	}

}
