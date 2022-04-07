package dam.model;

import java.util.ArrayList;

public class ListaEncuesta {

	private ArrayList<Encuesta> listado;
	
	public ListaEncuesta() {
		listado = new ArrayList<Encuesta>();
	}
	
	public ArrayList<Encuesta> getListado(){
		return listado;
	}
	
	public void addEncuesta(Encuesta e) {
		listado.add(e);
	}
}
