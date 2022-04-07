package dam.main;

import java.awt.EventQueue;

import dam.control.EncuestasControlador;
import dam.view.VEncuestas;

public class EncuestaInicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				VEncuestas ventana = new VEncuestas();
				
				EncuestasControlador controlador = new EncuestasControlador(ventana);
				
				ventana.setControlador(controlador);
				
				ventana.hacerVisible();
			}
		});
		

	}

}
