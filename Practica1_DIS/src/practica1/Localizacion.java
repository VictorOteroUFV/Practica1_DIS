package practica1;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Localizacion {	
	
	private int pasillo;
	private int estanteria;
	private int estante;
	
	@XmlElement
	public int getPasillo() {
		return pasillo;
	}
	
	public void setPasillo(int pasillo) {
		this.pasillo = pasillo;
	}
	@XmlElement
	public int getEstanteria() {
		return estanteria;
	}
	
	public void setEstanteria(int estanteria) {
		this.estanteria = estanteria;
	}
	@XmlElement
	public int getEstante() {
		return estante;
	}
	
	public void setEstante(int estante) {
		this.estante = estante;
	}

	
	public Localizacion() {
		
	}
	
	public Localizacion(int pasillo, int estanteria, int estante) {
		this.pasillo = pasillo;
		this.estanteria = estanteria;
		this.estante = estante;
	}
	
}
