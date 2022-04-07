package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import dam.model.Encuesta;
import dam.model.ListaEncuesta;
import dam.view.VEncuestas;

public class EncuestasControlador implements ActionListener, ItemListener {
	
	VEncuestas ventana;
	ListaEncuesta listaEncuesta;
	
	public EncuestasControlador(VEncuestas ventana) {
		this.ventana = ventana;
		listaEncuesta = new ListaEncuesta();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//obtengo el componente en el que se ha producido el evento
		e.getSource();

		//obtengo el comando asociado al componente en el que se ha producido el evento
		e.getActionCommand();
		
		if(e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VEncuestas.BTN_LIMPIAR)){
				ventana.limpiarComponentes();
				ventana.habilitarComponentes(true);
			}else if(e.getActionCommand().equals(VEncuestas.BTN_GUARDAR)) {
				Encuesta encuesta = ventana.obtenerEncuesta();
				
				listaEncuesta.addEncuesta(encuesta);
			}else if(e.getActionCommand().equals(VEncuestas.BTN_VER)) {
				ventana.mostrarEncuestas(listaEncuesta.getListado());
			}
		}else if(e.getSource() instanceof JComboBox) {
			if(ventana.getCombocOVID().getSelectedIndex() == 0) {
				// selecionado el si
				ventana.habilitarComponentes(true);
			}else {
				// selecionado el si
				ventana.habilitarComponentes(false);
				//ventana.seleccionarComponentes(false);
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() instanceof JCheckBox) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				ventana.limpiarChckSintomas();
			}
			
		}
		
	}

}
