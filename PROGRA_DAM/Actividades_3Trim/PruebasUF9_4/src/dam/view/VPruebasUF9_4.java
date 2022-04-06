package dam.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import dam.model.Alumno;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class VPruebasUF9_4 extends JFrame {
	private final ButtonGroup btngSexo = new ButtonGroup();
	private JScrollPane scrcpPruebas;
	private JTextArea textPruebas;
	private JComboBox<String> comboDias;
	private JComboBox<Alumno> cmbAlumnos;
	private JCheckBox chckLeer;
	private JCheckBox chckPadel;
	private JCheckBox chckMusica;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JButton btnPruebas;
	private JPasswordField pwdPassword;
	private JSpinner spnEdad;
	private JScrollPane scrpLista;
	private JList<Alumno> lstAlumnos;
	public VPruebasUF9_4() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pruebas_Componentes");
		getContentPane().setLayout(null);
		
		btnPruebas = new JButton("");
		btnPruebas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String diaSel = (String) comboDias.getSelectedItem();
				Alumno alumno = (Alumno) cmbAlumnos.getSelectedItem();
				String gustos = "";
				if (chckLeer.isSelected()) {
					gustos += chckLeer.getText();
				}
				if (chckPadel.isSelected()) {
					if(gustos.isEmpty()) {
						gustos += chckPadel.getText();
					}else {
						gustos += ", " + chckPadel.getText();
					}
					if (chckMusica.isSelected()) {
						if(gustos.isEmpty()) {
							gustos += chckMusica.getText();
						}else {
							gustos += ", " + chckMusica.getText();
						}	
				
					}
				}
				
				
				
				String sexo = "";
				if(rdbtnHombre.isSelected()) {
					sexo = rdbtnHombre.getText();
				}else {
					sexo =rdbtnMujer.getText();
				}
				
				int edad = (int) spnEdad.getValue();
				
				String seleccion = "Dia selecionado " + diaSel + "\nAlumno selecionado: " + alumno + "\nGustos: " + gustos + "\nSexo:" + sexo + "\nEdad: " + edad;
				
				if(lstAlumnos.getSelectedIndex() !=-1) {
					seleccion += "\nLista de alumnos seleccionados: ";
					
					ArrayList<Alumno> listaAlumnosSel = (ArrayList<Alumno>) lstAlumnos.getSelectedValuesList();

					
					for (Alumno alum : listaAlumnosSel) {
						seleccion += "\n" + alum;
					}
				}

				textPruebas.setText(seleccion);
			}
		});
		
		btnPruebas.setIcon(new ImageIcon(VPruebasUF9_4.class.getResource("/img/tomato.png")));
		btnPruebas.setBounds(222, 188, 50, 50);
		getContentPane().add(btnPruebas);
		
		scrcpPruebas = new JScrollPane();
		scrcpPruebas.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrcpPruebas.setBounds(10, 303, 494, 86);
		getContentPane().add(scrcpPruebas);
		
		textPruebas = new JTextArea();
		textPruebas.setLineWrap(true);
		scrcpPruebas.setViewportView(textPruebas);
		
		comboDias = new JComboBox<String>();
		comboDias.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboDias.setModel(new DefaultComboBoxModel<String>(new String[] {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}));
		comboDias.setBounds(63, 51, 135, 27);
		getContentPane().add(comboDias);
		
		cmbAlumnos = new JComboBox<Alumno>();
		cmbAlumnos.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		DefaultComboBoxModel<Alumno> dcbm = new DefaultComboBoxModel<Alumno>();
		dcbm.addElement(new Alumno("Diego", "Rodriguez", "12345678Z"));
		dcbm.addElement(new Alumno("Ruben", "Balboa", "12345678Z"));
		dcbm.addElement(new Alumno("Carlos", "Ramos", "12345678Z"));
		dcbm.addElement(new Alumno("Daniel", "Fernadnez", "12345678Z"));
		
		cmbAlumnos.setModel(dcbm);
		
		cmbAlumnos.setBounds(270, 55, 234, 27);
		getContentPane().add(cmbAlumnos);
		
		chckLeer = new JCheckBox("Leer");
		chckLeer.setBounds(63, 94, 135, 27);
		getContentPane().add(chckLeer);
		
		chckPadel = new JCheckBox("Padel");
		chckPadel.setBounds(62, 133, 93, 21);
		getContentPane().add(chckPadel);
		
		chckMusica = new JCheckBox("Musica");
		chckMusica.setBounds(211, 100, 93, 21);
		getContentPane().add(chckMusica);
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("RadioButton  Hombre seleccionado");
					chckLeer.setVisible(false);
				}else if (e.getStateChange() == ItemEvent.DESELECTED) {
					chckLeer.setVisible(true);
					
				}
			}
		});
		btngSexo.add(rdbtnHombre);
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setBounds(342, 97, 103, 21);
		getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		btngSexo.add(rdbtnMujer);
		rdbtnMujer.setBounds(342, 133, 103, 21);
		getContentPane().add(rdbtnMujer);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setEchoChar('?');
		pwdPassword.setBounds(31, 198, 119, 21);
		getContentPane().add(pwdPassword);
		
		spnEdad = new JSpinner();
		spnEdad.setEditor(new JSpinner.DefaultEditor(spnEdad));
		spnEdad.setModel(new SpinnerNumberModel(0, 0, 115, 1));
		spnEdad.setBounds(371, 199, 133, 20);
		getContentPane().add(spnEdad);
		
		scrpLista = new JScrollPane();
		scrpLista.setBounds(31, 415, 195, 113);
		getContentPane().add(scrpLista);
		
		lstAlumnos = new JList<Alumno>();
		lstAlumnos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		DefaultListModel<Alumno> dlm = new DefaultListModel<Alumno>();
		dlm.addElement(new Alumno("Diego", "Rodriguez", "12345678Z"));
		dlm.addElement(new Alumno("Ruben", "Balboa", "12345678Z"));
		dlm.addElement(new Alumno("Carlos", "Ramos", "12345678Z"));
		dlm.addElement(new Alumno("Daniel", "Fernadnez", "12345678Z"));
		
		lstAlumnos.setModel(dlm);
		
		scrpLista.setViewportView(lstAlumnos);
		
		
		setSize(600, 600);
		setLocationRelativeTo(null);
	}
	
	public void hacervisible() {
		setVisible(true);
	}
	
}

