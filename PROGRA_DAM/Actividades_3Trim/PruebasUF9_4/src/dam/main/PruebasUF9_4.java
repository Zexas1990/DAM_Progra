package dam.main;

import java.awt.EventQueue;

import dam.view.VPruebasUF9_4;

public class PruebasUF9_4 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPruebasUF9_4 ventana = new VPruebasUF9_4();
				
				ventana.hacervisible();
				
			}
		});

	}

}