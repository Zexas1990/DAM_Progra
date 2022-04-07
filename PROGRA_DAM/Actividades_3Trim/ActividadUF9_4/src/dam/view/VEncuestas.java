package dam.view;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import dam.control.EncuestasControlador;
import dam.model.Encuesta;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class VEncuestas extends JFrame {
	
	public static final String BTN_GUARDAR = "Guardar";
	public static final String BTN_LIMPIAR = "Limpiar";
	public static final String BTN_VER = "Ver Encuestas Realizadas";
	
	private final ButtonGroup NivelesGravedad = new ButtonGroup();
	private JSpinner spnEdad;
	private JLabel lblEdad;
	private JLabel lblCovid;
	private JComboBox combocOVID;
	private JLabel lblSintomas;
	private JCheckBox chckSintomasRespiratorios;
	private JCheckBox chckCansancioMalestar;
	private JCheckBox chckPérdidaOlfato;
	private JCheckBox chckPerdidaGusto;
	private JCheckBox chckDolorCabeza;
	private JCheckBox chckFiebre;
	private JCheckBox chckSinSintomas;
	private JCheckBox chckTosSeca;
	private JLabel lblNivelGravedad;
	private JRadioButton rdbtnNinguna;
	private JRadioButton rdbtnLeve;
	private JRadioButton rdbtnMedia;
	private JRadioButton rdbtnAlta;
	private JRadioButton rdbtnHospitalizacion;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JButton btnVerEncuestas;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	public VEncuestas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Encuestas COVID");
		getContentPane().setLayout(null);
		
		spnEdad = new JSpinner();
		spnEdad.setBounds(119, 32, 61, 20);
		getContentPane().add(spnEdad);
		
		lblEdad = new JLabel(Encuesta.PREG_EDAD);
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEdad.setBounds(35, 32, 61, 17);
		getContentPane().add(lblEdad);
		
		lblCovid = new JLabel(Encuesta.PREG_COVID);
		lblCovid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCovid.setBounds(35, 76, 214, 20);
		getContentPane().add(lblCovid);
		
		combocOVID = new JComboBox();
		combocOVID.setFont(new Font("Tahoma", Font.BOLD, 12));
		combocOVID.setModel(new DefaultComboBoxModel<String>(Encuesta.RESP_COVID));
		combocOVID.setBounds(273, 77, 46, 20);
		getContentPane().add(combocOVID);
		
		lblSintomas = new JLabel(Encuesta.PREG_SINT);
		lblSintomas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSintomas.setBounds(35, 121, 161, 20);
		getContentPane().add(lblSintomas);
		
		chckSintomasRespiratorios = new JCheckBox("S\u00EDntomas respiratorios");
		chckSintomasRespiratorios.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckSintomasRespiratorios.setBounds(86, 158, 175, 21);
		getContentPane().add(chckSintomasRespiratorios);
		
		chckCansancioMalestar = new JCheckBox("Cansancio / Malestar");
		chckCansancioMalestar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckCansancioMalestar.setBounds(289, 158, 175, 21);
		getContentPane().add(chckCansancioMalestar);
		
		chckPérdidaOlfato = new JCheckBox("P\u00E9rdida del olfato");
		chckPérdidaOlfato.setHorizontalAlignment(SwingConstants.LEFT);
		chckPérdidaOlfato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckPérdidaOlfato.setBounds(86, 206, 175, 21);
		getContentPane().add(chckPérdidaOlfato);
		
		chckPerdidaGusto = new JCheckBox("P\u00E9rdida del gusto");
		chckPerdidaGusto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckPerdidaGusto.setBounds(289, 207, 175, 21);
		getContentPane().add(chckPerdidaGusto);
		
		chckDolorCabeza = new JCheckBox("Dolor de Cabeza");
		chckDolorCabeza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckDolorCabeza.setBounds(86, 250, 175, 21);
		getContentPane().add(chckDolorCabeza);
		
		chckFiebre = new JCheckBox("Fiebre");
		chckFiebre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckFiebre.setBounds(289, 251, 175, 21);
		getContentPane().add(chckFiebre);
		
		chckSinSintomas = new JCheckBox("Sin s\u00EDntomas");
		chckSinSintomas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckSinSintomas.setBounds(86, 290, 175, 21);
		getContentPane().add(chckSinSintomas);
		
		chckTosSeca = new JCheckBox("Tos Seca");
		chckTosSeca.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckTosSeca.setBounds(289, 291, 175, 21);
		getContentPane().add(chckTosSeca);
		
		lblNivelGravedad = new JLabel(Encuesta.PREG_GRAV);
		lblNivelGravedad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNivelGravedad.setBounds(35, 334, 161, 20);
		getContentPane().add(lblNivelGravedad);
		
		rdbtnNinguna = new JRadioButton("1 - Ninguna");
		rdbtnNinguna.setSelected(true);
		NivelesGravedad.add(rdbtnNinguna);
		rdbtnNinguna.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnNinguna.setBounds(77, 365, 103, 21);
		getContentPane().add(rdbtnNinguna);
		
		rdbtnLeve = new JRadioButton("2 - Leve");
		NivelesGravedad.add(rdbtnLeve);
		rdbtnLeve.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnLeve.setBounds(212, 366, 103, 21);
		getContentPane().add(rdbtnLeve);
		
		rdbtnMedia = new JRadioButton("3 - Media");
		NivelesGravedad.add(rdbtnMedia);
		rdbtnMedia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMedia.setBounds(368, 366, 103, 21);
		getContentPane().add(rdbtnMedia);
		
		rdbtnAlta = new JRadioButton("4 - Alta");
		NivelesGravedad.add(rdbtnAlta);
		rdbtnAlta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnAlta.setBounds(146, 418, 103, 21);
		getContentPane().add(rdbtnAlta);
		
		rdbtnHospitalizacion = new JRadioButton("5-Hospitalizaci\u00F3n");
		NivelesGravedad.add(rdbtnHospitalizacion);
		rdbtnHospitalizacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnHospitalizacion.setBounds(289, 419, 115, 21);
		getContentPane().add(rdbtnHospitalizacion);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGuardar.setBounds(158, 473, 85, 21);
		getContentPane().add(btnGuardar);
		
		btnLimpiar = new JButton(BTN_LIMPIAR);
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpiar.setBounds(345, 473, 85, 21);
		getContentPane().add(btnLimpiar);
		
		btnVerEncuestas = new JButton(BTN_VER);
		btnVerEncuestas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerEncuestas.setBounds(196, 532, 194, 21);
		getContentPane().add(btnVerEncuestas);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 589, 485, 150);
		getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		initComponents();
	}

	private void initComponents() {
		
		
		setSize(600, 800);
		setLocationRelativeTo(null);
		
	}

	public void limpiarComponentes() {
		spnEdad.setValue(0);
		
		combocOVID.setSelectedIndex(0);
		
		limpiarChckRbt();
		
		textArea.setText(" ");
		
		
	}

	private void limpiarChckRbt() {
		limpiarChckSintomas();
		chckSinSintomas.setSelected(false);
		
		rdbtnNinguna.setSelected(true);
	}

	public void limpiarChckSintomas() {
		chckCansancioMalestar.setSelected(false);
		chckDolorCabeza.setSelected(false);
		chckFiebre.setSelected(false);
		chckPerdidaGusto.setSelected(false);
		chckPérdidaOlfato.setSelected(false);
		chckTosSeca.setSelected(false);
		chckSintomasRespiratorios.setSelected(false);
	}

	public void setControlador(EncuestasControlador controlador) {
		btnGuardar.addActionListener(controlador);
		btnLimpiar.addActionListener(controlador);
		btnVerEncuestas.addActionListener(controlador);
		combocOVID.addActionListener(controlador);
		chckSinSintomas.addItemListener(controlador);
	}

	public void hacerVisible() {
		setVisible(true);
		
	}

	public Encuesta obtenerEncuesta() {
		Encuesta encuesta = null;
		
		int edad = (int) spnEdad.getValue();
		boolean covid = true;
		// comprobamos si se ha selecionado el NO
		if(combocOVID.getSelectedIndex() == 1) {
			covid = false;
		}
		
		String sintomas = obtenerSintomas();
		
		int gravedad = obtenerGravedad();
		
		
		encuesta = new Encuesta(edad, covid, sintomas, gravedad);
		
		return encuesta;
	}

	
	private int obtenerGravedad() {
		
		int gravedad = 1;
		
		if(rdbtnLeve.isSelected()) {
			gravedad = 2;
		}else if(rdbtnMedia.isSelected()) {
			gravedad = 3;
		}else if(rdbtnAlta.isSelected()) {
			gravedad = 4;
		}else if (rdbtnHospitalizacion.isSelected()) {
			gravedad = 5;
		}
		
		return gravedad;
	}

	private String obtenerSintomas() {
		String sintomas = "";
		
		if(chckCansancioMalestar.isSelected()) {
			sintomas += chckCansancioMalestar.getText();
		}
		
		if(chckSintomasRespiratorios.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckSintomasRespiratorios.getText();
		}
		
		if(chckDolorCabeza.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckDolorCabeza.getText();
		}
		
		if(chckFiebre.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckFiebre.getText();
		}

		if(chckPerdidaGusto.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckPerdidaGusto.getText();
		}
		
		if(chckPérdidaOlfato.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckPérdidaOlfato.getText();
		}
		
		if(chckSinSintomas.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckSinSintomas.getText();
		}
		
		if(chckTosSeca.isSelected()) {
			if (!sintomas.isEmpty()) {
				sintomas += "; ";
			}
			sintomas += chckTosSeca.getText();
		}
		return sintomas;
	}

	public void mostrarEncuestas(ArrayList<Encuesta> listado) {
		String encuestas = "";
		
		for (Encuesta encuesta : listado) {
			encuestas += "\n" + encuesta;
		}
		
		textArea.setText(encuestas);
		
	}

	public JComboBox getCombocOVID() {
		return combocOVID;
	}

	public void habilitarComponentes(boolean b) {
		
		chckCansancioMalestar.setEnabled(b);
		chckDolorCabeza.setEnabled(b);
		chckFiebre.setEnabled(b);
		chckPerdidaGusto.setEnabled(b);
		chckPérdidaOlfato.setEnabled(b);
		chckSinSintomas.setEnabled(b);
		chckTosSeca.setEnabled(b);
		chckSintomasRespiratorios.setEnabled(b);
		
		rdbtnNinguna.setEnabled(b);
		rdbtnLeve.setEnabled(b);
		rdbtnMedia.setEnabled(b);
		rdbtnAlta.setEnabled(b);
		rdbtnHospitalizacion.setEnabled(b);
		
		
		if (!b) {
			limpiarChckRbt();
		}
		
		
	}
	
	
	
}
