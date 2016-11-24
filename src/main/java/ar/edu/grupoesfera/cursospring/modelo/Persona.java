<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Transient;

@Entity
public class Persona {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) //se agrega el generated value para que sea auto incremental
	private long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String email; // @transient si no queremos que se persista en la base con transient
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
=======
package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Transient;

@Entity
public class Persona {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) //se agrega el generated value para que sea auto incremental
	private long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String email; // @transient si no queremos que se persista en la base con transient
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
