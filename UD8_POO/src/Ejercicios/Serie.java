package Ejercicios;

public class Serie {
	public String titulo;
	public int numeroTemporadas;
	public Boolean entregado;
	public String genero;
	public String creador;
	
	//Constructor por defecto
	public Serie(){
		this.numeroTemporadas=3;
		this.entregado=false;
	}
	
	//Constructor con atributos por defecto menos el titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
	}
	
	//Constructor con todos los atributos menos entregado
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo=titulo;
		this.numeroTemporadas=numeroTemporadas;
		this.genero=genero;
		this.creador=creador;
	}

	//Clase Main para realizar la comprobación de los constructores
	public static void main(String[] args) {
		//Creación de los objetos para cada uno de los constructores
		Serie serie1 = new Serie ();
		Serie serie2 = new Serie ("'La que se avecina'","'Alberto Caballero'");
		Serie serie3 = new Serie ("'Big bang theory'", 12, "'Telecomedia'", "'Chuck Lorre'");
		
		if (serie1.entregado) {
			System.out.println("El numero de temporadas que tiene la primera serie es " + serie1.numeroTemporadas + " y esta entregada");
		}else {
			System.out.println("El numero de temporadas que tiene la primera serie es " + serie1.numeroTemporadas + " y no esta entregada");
		}
		System.out.println("Se puede comprobar que los demas atributos se encuentran por defecto, el titulo es " + serie1.titulo + ", el genero es " + serie1.genero + " y el creador es " + serie1.creador);
		
		System.out.println("El titulo de la segunda serie es " + serie2.titulo + " y el creador es " + serie2.creador);
		System.out.println("Se puede comprobar que los demas atributos se encuentran por defecto, el numero de temporadas es " + serie2.numeroTemporadas + ", esta entregado es " + serie2.entregado + " y el genero es " + serie2.genero);


		System.out.println("El titulo de la tercera serie es " + serie3.titulo + ", el numero de temporadas es " + serie3.numeroTemporadas + ", el genero es " + serie3.genero + " y el creador es " + serie3.creador);
		System.out.println("Se puede comprobar que los demas atributos se encuentran por defecto, esta entregada es " + serie2.entregado);

	}

}
