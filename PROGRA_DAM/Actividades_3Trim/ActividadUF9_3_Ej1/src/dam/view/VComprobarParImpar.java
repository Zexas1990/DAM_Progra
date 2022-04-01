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
	public VComprobarParImpar() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Comprobar Par o Impar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Introduce un numero");
		lblIntro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIntro.setBounds(27, 36, 171, 25);
		getContentPane().add(lblIntro);
		
		textNumero = new JTextField();
		textNumero.setBounds(245, 36, 123, 24);
		getContentPane().add(textNumero);
		textNumero.setColumns(10);
		
		btnComprobar = new JButton("Comprobar Par o Impar");
		btnComprobar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComprobar.setBounds(117, 119, 202, 25);
		getContentPane().add(btnComprobar);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblResultado.setBounds(49, 211, 340, 19);
		getContentPane().add(lblResultado);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	

		public void hacervisible() {
			setVisible(true);
		}
		
		public void setControlador(ComprobarPIControlador controlador) {
			btnComprobar.addActionListener(controlador);
		}

		public Integer obtenerNumero() {
			Integer num = null;
			
			try {
				num = Integer.parseInt(textNumero.getText());
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
