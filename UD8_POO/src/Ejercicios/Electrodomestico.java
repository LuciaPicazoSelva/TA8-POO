package Ejercicios;

public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected String consumoEnergetico;
	protected double peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase=100.0;
		this.color="Blanco";
		this.consumoEnergetico="F";
		this.peso=5.6;
	}
	
	//Constructor por defecto menos el precio y el peso
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
	}
	
	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		this.precioBase=precioBase;
		this.color=color;
		this.consumoEnergetico=consumoEnergetico;
		this.peso=peso;
	}
	
	//Clase Main para realizar la comprobación de los constructores
	public static void main(String[] args) {
		//Creación de los objetos para cada uno de los constructores
		Electrodomestico electrodomestico1 = new Electrodomestico ();
		Electrodomestico electrodomestico2 = new Electrodomestico (102.3,540.8);
		Electrodomestico electrodomestico3 = new Electrodomestico (54.8,"azul", "B", 85.9);

									   //Con este método, no importa si el nombre está en minúscula o mayúscula, siempre lo convertiremos a minúcula y ya no habrá problema
		switch(electrodomestico1.color.toLowerCase()) {
			case "blanco":
				System.out.println("El precio base del primer electrodomestico es " + electrodomestico1.precioBase + ", el color es blanco, el consumo energetico es " + electrodomestico1.consumoEnergetico + " y pesa " + electrodomestico1.peso + " kg");
				break;
			case "negro":
				System.out.println("El precio base del primer electrodomestico es " + electrodomestico1.precioBase + ", el color es negro, el consumo energetico es " + electrodomestico1.consumoEnergetico + " y pesa " + electrodomestico1.peso + " kg");
				break;
			case "rojo":
				System.out.println("El precio base del primer electrodomestico es " + electrodomestico1.precioBase + ", el color es rojo, el consumo energetico es " + electrodomestico1.consumoEnergetico + " y pesa " + electrodomestico1.peso + " kg");
				break;
			case "azul":
				System.out.println("El precio base del primer electrodomestico es " + electrodomestico1.precioBase + ", el color es azul, el consumo energetico es " + electrodomestico1.consumoEnergetico + " y pesa " + electrodomestico1.peso + " kg");
				break;
			case "gris":
				System.out.println("El precio base del primer electrodomestico es " + electrodomestico1.precioBase + ", el color es gris, el consumo energetico es " + electrodomestico1.consumoEnergetico + " y pesa " + electrodomestico1.peso + " kg");
				break;
		}
		

		System.out.println("El precio base del segundo electrodomestico es " + electrodomestico2.precioBase + " y pesa " + electrodomestico2.peso + " kg");
		System.out.println("Se puede comprobar que los demas atributos se encuentran por defecto, el color es " + electrodomestico2.color + " y el consumo energetico es " + electrodomestico2.consumoEnergetico);
		
		
		switch(electrodomestico3.color.toLowerCase()) {
		case "blanco":
			System.out.println("El precio base del tercer electrodomestico es " + electrodomestico3.precioBase + ", el color es blanco, el consumo energetico es " + electrodomestico3.consumoEnergetico + " y pesa " + electrodomestico3.peso + " kg");
			break;
		case "negro":
			System.out.println("El precio base del tercer electrodomestico es " + electrodomestico3.precioBase + ", el color es negro, el consumo energetico es " + electrodomestico3.consumoEnergetico + " y pesa " + electrodomestico3.peso + " kg");
			break;
		case "rojo":
			System.out.println("El precio base del tercer electrodomestico es " + electrodomestico3.precioBase + ", el color es rojo, el consumo energetico es " + electrodomestico3.consumoEnergetico + " y pesa " + electrodomestico3.peso + " kg");
			break;
		case "azul":
			System.out.println("El precio base del tercer electrodomestico es " + electrodomestico3.precioBase + ", el color es azul, el consumo energetico es " + electrodomestico3.consumoEnergetico + " y pesa " + electrodomestico3.peso + " kg");
			break;
		case "gris":
			System.out.println("El precio base del tercer electrodomestico es " + electrodomestico3.precioBase + ", el color es gris, el consumo energetico es " + electrodomestico3.consumoEnergetico + " y pesa " + electrodomestico3.peso + " kg");
			break;
		}
		System.out.println("Ningun atributo se encuentra por defecto");

	}
}
