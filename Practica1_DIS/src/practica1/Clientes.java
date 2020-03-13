package practica1;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Clientes {
		
	private String nombre;
	private String apellido;
	private String email;
	private String numero_telefono;
	private Direccion direccion;
	
	@XmlElement
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@XmlElement
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@XmlElement
	public String getNumero_telefono() {
		return numero_telefono;
	}
	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	@XmlElement
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public Clientes() {
		
	}
	
	public Clientes(String nombre, String apellido, String email, String numero_telefono, Direccion direccion) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.numero_telefono = numero_telefono;
		this.direccion = direccion;
		
	}
	


}
