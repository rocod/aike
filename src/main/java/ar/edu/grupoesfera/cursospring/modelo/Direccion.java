<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Direccion {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String calle;
	@Column 
	private String puerta;
	
	@ManyToOne @JoinColumn(name="id_barrio", nullable=false)
	private Barrio barrio;


	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

}
=======
package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Direccion {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column
	private String calle;
	@Column 
	private String puerta;
	
	@ManyToOne @JoinColumn(name="id_barrio", nullable=false)
	private Barrio barrio;


	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
