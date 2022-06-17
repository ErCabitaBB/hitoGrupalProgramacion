package pujas;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		String limpiascanner;
		boolean respuesta = true;
		System.out.println("INSERTAR NUEVA PUJA");
		System.out.println("--------------------");
		System.out.println("Inserta el nombre del producto");
		String nombre = scan.nextLine();
		System.out.println("Inserta el precio del producto");
		int precio = scan.nextInt();
		System.out.println("Inserta el estado del producto");
		limpiascanner = scan.nextLine();
		String estado = scan.nextLine();
		System.out.println("Inserta la descripcion del producto");
		String descripcion = scan.nextLine();
		Puja puja = new Puja(nombre,precio,estado,descripcion,1);
		do {
			System.out.println("PUJAS");
			System.out.println("---------------------------------");
			System.out.println("1. Añadir un pujador.");
			System.out.println("2. Empezar a Pujar(Almenos dos jugadores).");
			System.out.println("3. Datos de la puja.");
			System.out.println("4. Salir.");
			System.out.println("---------------------------------");
			System.out.println("Que opcion eliges?");
			input = scan.nextInt();
			switch (input) {
			case 1:
				System.out.println("Inserta el nombre del pujador");
				limpiascanner = scan.nextLine();
				String nombreP = scan.nextLine();
				System.out.println("Inserta el dni del pujador");
				String dni = scan.nextLine();
				System.out.println("Inserta la direccion del pujador");
				String direccion = scan.nextLine();
				System.out.println("Inserta el dinero del pujador");
				float dinero = scan.nextInt();
				puja.agregarPujador(nombreP, dni, direccion, dinero);
				break;
			case 2:
				if (puja.contadorPujadores>1) {
					respuesta=true;
					do {
						for (int i = 1; i < puja.contadorPujadores+1; i++) {
							System.out.println("Pujador numero "+(i)+", ¿que quiere hacer?");
							System.out.println("---------------------------------");
							System.out.println("1. Pujar 10€.");
							System.out.println("2. Pujar 100€.");
							System.out.println("3. Retirarse.");
							System.out.println("---------------------------------");
							input = scan.nextInt();
							switch (input) {
							case 1:
								puja.setPrecioInicial(10);
								System.out.println(puja.arrayPujador[i].getDni());
								puja.setGanador(puja.arrayPujador[i].getDni());
								break;
							case 2:
								puja.setPrecioInicial(100);
								puja.setGanador(puja.arrayPujador[i].getDni());
								break;
							case 3:
								puja.borrarPujador(puja.arrayPujador[i].getDni());
								break;
							default:
								System.out.println("Elija una opcion corecta");
								i=i-1;
								break;
							}
						}
						limpiascanner = scan.nextLine();
					} while (puja.contadorPujadores>1);	
					System.out.println("El ganador es"+puja.getGanador()+", ha pagado "+puja.getPrecioInicial()+"€, enhorabuena por su compra.");
					respuesta=false;
				}
				else {
					System.out.println("Necesitas al menos dos pujadores para iniciar una puja.");
				}
				break;
			case 3:
				System.out.println(puja.toString());
				break;
			case 4:
				respuesta=false;
				break;
			default:
				System.out.println("Establece una de las opciones establecidas");
				break;
			}
		} while (respuesta==true);
	}
}
