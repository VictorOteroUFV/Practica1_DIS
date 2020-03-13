package practica1;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@XmlRootElement
public class Pedidos {
	
	ArrayList<Producto> productos = new ArrayList<Producto>();
	ArrayList<Integer> cantidad = new ArrayList<Integer>();
	private Direccion direccion_entrega;
	private Clientes cliente;
	private String destinatario;
	private Date fecha_entrega = new Date();
	
	@XmlElement
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	@XmlElement
	public ArrayList<Integer> getCantidad() {
		return cantidad;
	}

	public void setCantidad(ArrayList<Integer> cantidad) {
		this.cantidad = cantidad;
	}
	
	@XmlElement
	public Direccion getDireccion_entrega() {
		return direccion_entrega;
	}

	public void setDireccion_entrega(Direccion direccion_entrega) {
		this.direccion_entrega = direccion_entrega;
	}

	@XmlElement
	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@XmlElement
	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	@XmlElement
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	
	
	public Pedidos() {
		
	}
	
	public Pedidos(ArrayList<Producto> productos, ArrayList<Integer> cantidad, Direccion direccion_entrega, Clientes cliente, Date fecha_entrega) {
		
		this.productos = productos;
		this.cantidad = cantidad;
		this.direccion_entrega = direccion_entrega;
		this.cliente = cliente;
		this.fecha_entrega = fecha_entrega;
	}
	
}
