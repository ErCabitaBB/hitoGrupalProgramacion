package pujas;

import java.util.Arrays;

public class Puja {

	int idPuja;
	float precioInicial;
	String ganador;
	Pujador arrayPujador[]=new Pujador[1024];
	int contadorPujadores=0;
	
	public Puja(String nombre,float precio,String estado,String descripcion,int id) {
		super();
		this.precioInicial=precio;
		this.idPuja = id;
		Producto producto = new Producto(nombre,precio,estado,descripcion,id);
	}
	
	public float getPrecioInicial() {
		return precioInicial;
	}

	public void setPrecioInicial(float precioInicial) {
		this.precioInicial = this.precioInicial+precioInicial;
		System.out.println("Se ha añadido "+precioInicial+"€ a la puja");
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	
	public void borrarPujador(String dni) {
		for (int i = 1; i < this.contadorPujadores+1; i++) {
			if (dni.equals(arrayPujador[i].getDni())) {
				for (int o = i; o < arrayPujador.length-1; o++) {
					arrayPujador[o]=arrayPujador[o+1];
				}
				this.contadorPujadores=this.contadorPujadores-1;
				System.out.println("El Pujador cuyo dni es "+dni+" se ha retirado correctamente.");
			}
		}
	}

	public void agregarPujador(String nombre, String dni, String direccion,float dinero){
		contadorPujadores=contadorPujadores+1;
		int pujasganadas=0;
		arrayPujador[contadorPujadores] = new Pujador(nombre,dni,direccion,dinero,pujasganadas);
	}

	@Override
	public String toString() {
		return "Puja [idPuja=" + idPuja + ", precioInicial=" + precioInicial + ", contadorPujadores=" + contadorPujadores + "]";
	}
	
}