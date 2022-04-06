package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VPruebasUF9_3;

public class PruebasUF9_3_Controlador implements ActionListener {
	
	VPruebasUF9_3 ventana;
	
	public PruebasUF9_3_Controlador(VPruebasUF9_3 ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Realizar el ssaludo
		String nombre = ventana.obtenerDatos();
		if(!nombre.isEmpty()) {
			ventana.mostrarSaludo("Hola " + nombre);
		}
		

	}

}
