package dam.main;

import dam.control.PruebasUF9_3_Controlador;
import dam.view.VPruebasUF9_3;

public class InicioUF9_3 {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
			  VPruebasUF9_3 v = new VPruebasUF9_3();
			  
			  PruebasUF9_3_Controlador c = new PruebasUF9_3_Controlador(v);
			  
			  v.setControlador(c);
			  
			  v.hacerVisible();
			}
			});

	}

}
