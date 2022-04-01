package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VComprobarParImpar;

public class ComprobarPIControlador implements ActionListener {
	
	VComprobarParImpar ventana;
	static double DOLARES = 0.91;
	
	public ComprobarPIControlador(VComprobarParImpar ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double divisas = ventana.obtenerNumero();
		
		if (divisas != null) {
			
			divisas = ventana.obtenerNumero() * DOLARES;
			String euros = String.valueOf(divisas);
			ventana.mostrarResultado(euros + " €");
			
		}
		
		
		
		
			
		}

	


}
