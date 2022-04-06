package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.view.VComprobarSalario;

public class Controlador implements ActionListener {
	
	VComprobarSalario ventana;
	static int CUARENTAoMENOS = 16;
	static int EXTRAS = 20;
	static int HORAS = 40;
	
	
	public Controlador(VComprobarSalario ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double salario = ventana.obtenerNumero();
		
		if (salario != null) {
			
			if(salario <= HORAS) {
				
				salario = ventana.obtenerNumero() * CUARENTAoMENOS;
				String euros = String.valueOf(salario);
				ventana.mostrarResultado(euros + " €");
				
			}else {
				double diferencia = 0;
				
				salario = ventana.obtenerNumero();
				diferencia = salario - HORAS;
				salario = ((salario - diferencia) * CUARENTAoMENOS) + (diferencia * EXTRAS);
				String euros = String.valueOf(salario);
				ventana.mostrarResultado(euros + " €");
			}
			

			
		}
		
		
		
		
			
		}

	


}
