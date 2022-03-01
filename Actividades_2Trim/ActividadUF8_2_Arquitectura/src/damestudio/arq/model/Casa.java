package damestudio.arq.model;

import java.util.ArrayList;

public class Casa {

	private ArrayList<Estancia> listaEstancias;
	private String direccion;
	
	
	public Casa(String direccion) {
		this.direccion = direccion;
		listaEstancias = new ArrayList<Estancia>();
	}


	public ArrayList<Estancia> getListaEstancias() {
		return listaEstancias;
	}
	
	public void addEstancia(Estancia estancia) {
		listaEstancias.add(estancia);
	}


	@Override
	public String toString() {
		String casa = "Direccion=" + direccion;
		
		for (Estancia estancia : listaEstancias) {
			casa +=  "\n" + estancia;
		}
		
		return casa;
	}
	
	
	public double calcularTotalM2() {
		double totalM2 = 0;
		//TODO:TENER EN CUENTA LOS M2 DE TENDEDERO Y TERRAZA
		for (Estancia estancia : listaEstancias) {
			if(estancia instanceof Cocina) {
				if(((Cocina) estancia).tieneTendedero()) {
					totalM2 += ((Cocina ) estancia).getM2Tend();
					
					}
				}else if (estancia instanceof Salon) {
					if(((Salon) estancia).isTieneTerraza()) {
						totalM2 += ((Salon ) estancia).getM2ter();
				}
			}
			totalM2 += estancia.getM2();
		}
		return totalM2;
	}
	
	
	
}
