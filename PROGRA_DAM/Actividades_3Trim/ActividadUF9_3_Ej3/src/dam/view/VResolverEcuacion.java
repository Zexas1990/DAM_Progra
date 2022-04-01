package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.ResolverEcuacioncontrol;
import dam.model.Ecuacion2G;

import javax.swing.JButton;

public class VResolverEcuacion extends JFrame{
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JButton btnResolver;
	private JLabel lblResultado;
	public VResolverEcuacion() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Resolver Ecuacion 2do Grado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Introduce los terminos de la equacion de 2\u00BA");
		lblIntro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntro.setBounds(54, 25, 278, 28);
		getContentPane().add(lblIntro);
		
		textA = new JTextField();
		textA.setBounds(53, 68, 48, 17);
		getContentPane().add(textA);
		textA.setColumns(10);
		
		JLabel lblA = new JLabel("x^2+");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblA.setBounds(111, 67, 48, 19);
		getContentPane().add(lblA);
		
		textB = new JTextField();
		textB.setBounds(157, 67, 48, 19);
		getContentPane().add(textB);
		textB.setColumns(10);
		
		JLabel lblB = new JLabel("x+");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblB.setBounds(215, 70, 45, 13);
		getContentPane().add(lblB);
		
		textC = new JTextField();
		textC.setBounds(236, 67, 48, 18);
		getContentPane().add(textC);
		textC.setColumns(10);
		
		JLabel lblC = new JLabel("=0");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblC.setBounds(294, 70, 45, 13);
		getContentPane().add(lblC);
		
		btnResolver = new JButton("RESOLVER");
		btnResolver.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnResolver.setBounds(134, 117, 118, 28);
		getContentPane().add(btnResolver);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResultado.setBounds(10, 187, 366, 28);
		getContentPane().add(lblResultado);
		
		setSize(400,300);
		setLocationRelativeTo(null);
	}

	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador(ResolverEcuacioncontrol control) {
		btnResolver.addActionListener(control);
	}

	public Ecuacion2G obtenerDatos() {
		Ecuacion2G eq = null;
		
		
		
		
		
		try {
			int a = Integer.parseInt(textA.getText());
			
			if(a==0) {
				throw new NumberFormatException();
			}
			
			try {
				int b = Integer.parseInt(textB.getText());
				
				try {
					int c = Integer.parseInt(textC.getText());
					
					eq = new Ecuacion2G(a, b, c); 
					
				} catch (NumberFormatException e) {
					mostrarError("El termino independiente debe ser entero");
				}
				
			} catch (NumberFormatException e) {
				mostrarError("El termino de la x debe ser entero");
			}
			
			
		} catch (NumberFormatException e) {
			mostrarError("El termino independiente de la x^2 debe ser entero y distinto de 0");
		}
		
		return eq;
	}

	private void mostrarError(String error) {
		lblResultado.setText(error);
		lblResultado.setForeground(Color.RED);
		
	}
	
	public void mostrarResultado(String resultado) {
        lblResultado.setText(resultado);
        lblResultado.setForeground(Color.BLUE);
    }
}
