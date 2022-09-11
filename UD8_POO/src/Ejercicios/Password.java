package Ejercicios;

public class Password {
	private int longitud = 8;
	private String contrasena;
	
	//Constructor por defecto
	public Password() {
		
	}
	
	//Constructor con longitud pasada por parámetro
	public Password(int longitud) {
		this.longitud=longitud;
	}
	
	//Clase Main para realizar la comprobación de los constructores
	public static void main(String[] args) {
		//Creación de los objetos para cada uno de los constructores
		Password password1 = new Password ();
		Password password2 = new Password (16);
		
		System.out.println("Se puede comprobar que ambos atributos se encuentran por defecto, la longitud de la primera contrasena es " + password1.longitud + " y la contrasena es " + password1.contrasena);
		
		System.out.println("La longitud de la segunda contrasena es " + password2.longitud);
		System.out.println("Se puede comprobar que el atributo restante se encuentran por defecto, la contrasena es " + password2.contrasena);

	}

	
}
