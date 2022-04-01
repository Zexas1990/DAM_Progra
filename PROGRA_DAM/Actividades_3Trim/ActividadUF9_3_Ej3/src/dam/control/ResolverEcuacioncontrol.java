package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.model.Ecuacion2G;
import dam.view.VResolverEcuacion;

public class ResolverEcuacioncontrol implements ActionListener {
	
	VResolverEcuacion ventana;
	
	public ResolverEcuacioncontrol(VResolverEcuacion ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Ecuacion2G eq = ventana.obtenerDatos();
		
		if(eq != null) {
			double[] soluciones = eq.resolverEcuacion();
			
			if(soluciones == null) {
				ventana.mostrarResultado("No existen soluciones para la ecuacion introducida");
			}else {
				ventana.mostrarResultado("Soluciones " + soluciones[0] + " y " + soluciones[1]);
			}
		}
	}

}
