package practica1;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Direccion {
	
	private String calle;
	private int numero;
	private int codigo_postal;
	private String poblacion;
	private String pais;
	
	@XmlElement
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	@XmlElement
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@XmlElement
	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	@XmlElement
	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@XmlElement
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public Direccion() {
		
	}
	
	public Direccion(String calle, int numero, int codigo_postal, String poblacion, String pais) {
		
		this.calle = calle;
		this.numero = numero;
		this.codigo_postal = codigo_postal;
		this.poblacion = poblacion;
		this.pais = pais;
		
	}
	
	
}
