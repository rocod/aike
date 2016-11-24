package ar.edu.grupoesfera.cursospring.modelo;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Comuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String nombre;
	@OneToMany(mappedBy = "comuna", orphanRemoval = true, fetch = FetchType.LAZY)
	// mappedBy se pone en el oneToMay cuando es bidireccional solamente
	// fetch eagar trae la dependencia cuando crea el objeto, en cambio cuando
	// es Lazy hace la consulta de la colleccion solo cuando alguine la
	// consulta.
	// el default es LAZY lo pusimos para conocerlo y saber de que se trata, el
	// default en objetos relacionados es eager
	@Cascade(value = CascadeType.ALL)
	private List<Barrio> barrios = new LinkedList<Barrio>();

	// si tenemos una coleccion con oneToMany que va a ser LAZY cuando
	// consultamos la base de datos tenemos que pedir la coleccion para tenerla
	// ant3es de que se cierre la sesion
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

	public List<Barrio> getBarrios() {
		return barrios;
	}

	public void setBarrios(List<Barrio> barrios) {
		this.barrios = barrios;
	}

	public void addBarrio(Barrio barrio){
		this.barrios.add(barrio);
		barrio.setComuna(this);
	}
}
