package dam.main;

import java.awt.EventQueue;

import dam.control.ResolverEcuacioncontrol;
import dam.view.VResolverEcuacion;

public class ResolverEcuacuionMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VResolverEcuacion v = new VResolverEcuacion();
				
				ResolverEcuacioncontrol c = new ResolverEcuacioncontrol(v);
				
				v.setControlador(c);
				
				v.hacerVisible();
				
			}
		});
		// TODO Auto-generated method stub

	}

}
