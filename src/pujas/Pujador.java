package pujas;

public class Pujador extends Persona {
	private float dinero;
	private int pujasganadas;
	
	public Pujador(String nombre, String dNI, String direccion,float dinero,int pujasganadas) {
		super(nombre, dNI, direccion);
		this.dinero = dinero;
		this.pujasganadas = pujasganadas;
		// TODO Auto-generated constructor stub
	}
	
	public Pujador() {
		super("Caba", "53906685K", "Calle falsa 123");
		this.dinero = 15600000;
		this.pujasganadas = 100000000;
		// TODO Auto-generated constructor stub
	}

	public float getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public int getPujasganadas() {
		return pujasganadas;
	}
	public void setPujasganadas(int pujasganadas) {
		this.pujasganadas = pujasganadas;
	}
}