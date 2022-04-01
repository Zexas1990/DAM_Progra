package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.ComprobarPIControlador;

import javax.swing.JButton;

public class VComprobarParImpar extends JFrame {
	private JTextField textNumero;
	private JButton btnComprobar;
	private JLabel lblResultado;
	private JLabel lblEuros;
	public VComprobarParImpar() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Comprobar Par o Impar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("DOLARES");
		lblIntro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIntro.setBounds(74, 36, 77, 25);
		getContentPane().add(lblIntro);
		
		textNumero = new JTextField();
		textNumero.setBounds(226, 36, 123, 24);
		getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		btnComprobar = new JButton("Convertir divisas");
		btnComprobar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComprobar.setBounds(117, 119, 202, 25);
		getContentPane().add(btnComprobar);
		
		lblResultado = new JLabel("");
		lblResultado.setOpaque(true);
		lblResultado.setBackground(Color.WHITE);
		lblResultado.setForeground(Color.BLACK);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(230, 186, 130, 24);
		getContentPane().add(lblResultado);
		
		lblEuros = new JLabel("EUROS");
		lblEuros.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEuros.setBounds(74, 186, 77, 25);
		getContentPane().add(lblEuros);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	

		public void hacervisible() {
			setVisible(true);
		}
		
		public void setControlador(ComprobarPIControlador controlador) {
			btnComprobar.addActionListener(controlador);
		}

		public Double obtenerNumero() {
			Double num = null;
			
			try {
				num = Double.parseDouble(textNumero.getText());
			} catch(NumberFormatException e) {
				lblResultado.setText("El valor debe ser numerico");
				lblResultado.setForeground(Color.RED);
			}
			
			return num;
		}

		public void mostrarResultado(String resultado) {
			lblResultado.setText(resultado);
			lblResultado.setForeground(Color.BLUE);
			
		}
}
