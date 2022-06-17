package pujas;

public class Producto {
	private String nombre;
	private float precio;
	private String estado;
	private String descripcion;
	private int id;

	public Producto(String nombre, float precio, String estado, String descripcion, int id) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.estado = estado;
		this.descripcion = descripcion;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}