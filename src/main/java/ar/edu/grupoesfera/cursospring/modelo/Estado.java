<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String estado;
	public long getId(){
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
=======
package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String estado;
	public long getId(){
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
