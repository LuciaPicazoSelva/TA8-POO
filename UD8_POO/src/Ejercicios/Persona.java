package Ejercicios;

public class Persona {
	private String nombre;
	private int edad;
	private String dni = "46783445T";
	private String sexo = "H";
	private float peso;
	private float altura;

	//Constructor por defecto
	public Persona() {
		
	}
	
	//Constructor por defecto menos el nombre, edad y sexo
	public Persona(String nombre, int edad, String sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	//Constructor con todos los atributos por parámetro
	public Persona(String nombre, int edad, String dni, String sexo, float peso, float altura) {
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
		this.sexo=sexo;
		this.peso=peso;
		this.altura=altura;
	}
	
	//Clase Main para realizar la comprobación de los constructores
	public static void main(String[] args) {
		//Creación de los objetos para cada uno de los constructores
		Persona persona1 = new Persona ();
		Persona persona2 = new Persona ("'Lucia'", 22, "M");
		Persona persona3 = new Persona ("'David'", 10, "'45671223W'", "H", 40, 141);
		
		if (persona1.sexo=="M") {
			System.out.println("El nombre de la primera persona es " + persona1.nombre + ", de edad tiene " + persona1.edad + ", su dni es " + persona1.dni + ", es mujer, pesa " + persona1.peso + " kg y mide " + persona1.altura + " cm");
		}else {
			System.out.println("El nombre de la primera persona es " + persona1.nombre + ", de edad tiene " + persona1.edad + ", su dni es " + persona1.dni + ", es hombre, pesa " + persona1.peso + " kg y mide " + persona1.altura + " cm");
		}
		
		
		if (persona2.sexo=="M") {
			System.out.println("El nombre de la segunda persona es " + persona2.nombre + ", de edad tiene " + persona2.edad + " y es mujer");
		}else {
			System.out.println("El nombre de la segunda persona es " + persona2.nombre + ", de edad tiene " + persona2.edad + " y es hombre");
		}
		System.out.println("Se puede comprobar que los demas atributos se encuentran por defecto, el dni es " + persona2.dni + ", pesa " + persona2.peso + " kg y mide " + persona2.altura + " cm");

		
		if (persona3.sexo=="M") {
			System.out.println("El nombre de la tercera persona es " + persona3.nombre + ", de edad tiene " + persona3.edad + " , su dni es " + persona3.dni + ", es mujer, pesa " + persona3.peso + " kg y mide " + persona3.altura + " cm");
		}else {
			System.out.println("El nombre de la tercera persona es " + persona3.nombre + ", de edad tiene " + persona3.edad + " , su dni es " + persona3.dni + ", es hombre, pesa " + persona3.peso + " kg y mide " + persona3.altura + " cm");
		}
		System.out.println("Se puede comprobar que ningun atributo se encuentra por defecto");


	}

}
