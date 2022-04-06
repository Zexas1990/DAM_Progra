package dam.main;

import dam.view.Ventana;

public class Inicio {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
			   Ventana v = new Ventana();
			   v.hacerVisible();
				}
			});

	}

}
