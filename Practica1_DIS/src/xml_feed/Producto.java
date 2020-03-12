package xml_feed;

public class Producto {
	private String codigo;
	private String nombre;
	private String descripcion;
	private String stock;
	private String[] localizacion;
	private String pendientes;
	
	
	@Override
	public String toString() {
		return "<producto>\n\t<codigo>"+codigo +"</codigo>\n\t<nombre>"+nombre+"</nombre>\n\t<descripcion>"+descripcion+"</descripcion>\n</producto>";
	}

	public Producto(String codigo, String nombre, String descripcion, String stock, String[] localizacion, String pendientes) {
		super();
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setStock(stock);
		this.setLocalizacion(localizacion);
		this.setPendientes(pendientes);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String[] getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String[] localizacion) {
		this.localizacion = localizacion;
	}

	public String getPendientes() {
		return pendientes;
	}

	public void setPendientes(String pendientes) {
		this.pendientes = pendientes;
	}
	
}
