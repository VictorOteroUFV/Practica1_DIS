package xml_feed;

public class Clientes {
	private String nombre;
	private String apellidos;
	private String email;
	private String telefono;
	private String[] direccion;
	
	@Override
	public String toString() {
		return "<cliente>\n\tnombre: "+nombre +"\n\tapellidos: "+apellidos+"\n\temail: "+email+"\n</producto>";
	}

	public Clientes(String nombre, String apellidos, String email, String telefono, String[] direccion) {
		super();
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEmail(email);
		this.setTelefono(telefono);
		this.setDireccion(direccion);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String[] getDireccion() {
		return direccion;
	}

	public void setDireccion(String[] direccion) {
		this.direccion = direccion;
	}
	
}