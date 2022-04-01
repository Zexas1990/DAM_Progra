package ej4.agregacion;

import java.util.ArrayList;

public class Libro {
	
	private String titulo;
	private String isbn;
	private String autor;
	private int anoPub;
	private ArrayList<Pagina> paginas;
	
	
	
	public Libro(String titulo, String isbn, String autor, int anoPub, ArrayList<Pagina> paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anoPub = anoPub;
		paginas = new ArrayList<Libro.Pagina>();
	}



	public String getTitulo() {
		return titulo;
	}



	public String getIsbn() {
		return isbn;
	}



	public String getAutor() {
		return autor;
	}



	public int getAnoPub() {
		return anoPub;
	}



	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}


	public void addPagina(Pagina pagina) {
		paginas.add(pagina);
	}
	
	

	//clase anidada para representar una relacion de composicion 
	public class Pagina {
		
		private String contenido;
		private int numero;
		
		public Pagina(String contenido, int numero) {
			this.contenido = contenido;
			this.numero = numero;
		}

		public String getContenido() {
			return contenido;
		}

		public int getNumero() {
			return numero;
		}
		
		
		
		
	}

}
