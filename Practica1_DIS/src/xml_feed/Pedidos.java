package xml_feed;

public class Pedidos {
	private String productos;
	private String cantidad;
	private String destinatario;
	private String fecha;
	private String[] direccion;
	
	@Override
	public String toString() {
		return "<cliente>\n\tnombre: " +"\n\tapellidos: "+"\n\temail: "+"\n</producto>";
	}

	public Pedidos(String nombre, String apellidos, String email, String telefono, String[] direccion) {
		super();
		this.setProductos(productos);
		this.setCantidad(cantidad);
		this.setDestinatario(destinatario);
		this.setFecha(fecha);
		this.setDireccion(direccion);
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String[] getDireccion() {
		return direccion;
	}

	public void setDireccion(String[] direccion) {
		this.direccion = direccion;
	}
	
}