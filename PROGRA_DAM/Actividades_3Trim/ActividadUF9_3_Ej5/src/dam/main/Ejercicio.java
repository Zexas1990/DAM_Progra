package dam.main;

import java.awt.EventQueue;

import dam.control.Controlador;
import dam.view.VComprobarSalario;

public class Ejercicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VComprobarSalario v =new VComprobarSalario();
				
				Controlador c = new Controlador(v);
				
				v.setControlador(c);
				
				v.hacervisible();
				
			}
		});

	}

}
