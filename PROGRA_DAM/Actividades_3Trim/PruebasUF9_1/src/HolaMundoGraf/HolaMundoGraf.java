package HolaMundoGraf;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HolaMundoGraf {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ventana HolaMundo");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JLabel label = new JLabel("HolaMundo, �Qu� tal?");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);


	}

}
