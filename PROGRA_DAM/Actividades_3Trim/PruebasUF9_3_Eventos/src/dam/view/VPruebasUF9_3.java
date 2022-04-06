package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.PruebasUF9_3_Controlador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VPruebasUF9_3 extends JFrame {
	private JLabel lblIntro;
	private JTextField textNombre;
	private JButton btnSaludar;
	private JLabel lblSaludo;
	public VPruebasUF9_3() {
		setTitle("Pruebas UF9_3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblIntro = new JLabel("Introduce tu nombre");
		lblIntro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIntro.setBounds(21, 42, 199, 57);
		getContentPane().add(lblIntro);
		
		textNombre = new JTextField();
		textNombre.setBounds(268, 57, 127, 35);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		btnSaludar = new JButton("Saludar");
		/*btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textNombre.getText();
				lblSaludo.setText("Hola " + nombre);
			}
		});*/
		btnSaludar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaludar.setBounds(165, 114, 104, 25);
		getContentPane().add(btnSaludar);
		
		lblSaludo = new JLabel("");
		lblSaludo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSaludo.setBounds(45, 183, 345, 25);
		getContentPane().add(lblSaludo);
		
		setSize( 450, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador (PruebasUF9_3_Controlador controlador) {
		btnSaludar.addActionListener(controlador);
	}

	public String obtenerDatos() {
		String nombre = textNombre.getText();
		
		if(nombre.isEmpty()) {
			mostrarError("Debe introducir un nombre");
		}
		return textNombre.getText();
	}

	private void mostrarError(String error) {
		lblSaludo.setText(error);
		lblSaludo.setForeground(Color.RED);
	}

	public void mostrarSaludo(String saludo) {
		lblSaludo.setText(saludo);
		lblSaludo.setForeground(Color.GREEN);
		
	}
	
}
