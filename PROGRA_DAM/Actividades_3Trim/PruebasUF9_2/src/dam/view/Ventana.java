package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class Ventana extends JFrame {
	private JLabel lblEtiqueta;
	
	public Ventana() {
		super ("Mi primera ventana");
		initComponents();
	}

	private void initComponents() {
		//setTitle("Mi primera ventana");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblEtiqueta = new JLabel("Mi primera eqtiqueta");
		lblEtiqueta.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEtiqueta.setBounds(99, 113, 187, 37);
		getContentPane().add(lblEtiqueta);
		
		setSize(400,300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
