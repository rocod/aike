<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.controladores;

import java.util.ArrayList;

import java.util.List;

import javax.inject.Inject;
//import javax.servlet.http.HttpServletRequest;





import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ListaDeTurnos;
import ar.edu.grupoesfera.cursospring.modelo.Persona;
import ar.edu.grupoesfera.cursospring.modelo.Turno;
import ar.edu.grupoesfera.cursospring.servicios.ServicioPersona;
import ar.edu.grupoesfera.cursospring.servicios.ServicioTurnos;

@Controller
public class ControladorEjemplosBasicos {
	@Inject
	ServicioTurnos servicioTurno;
	@Inject 
	ServicioPersona servicioPersona;
	
	@Transactional
	@Rollback
	@RequestMapping(value="/lista_dinamica") //url
	public ModelAndView vista_index_lista(){
		
		ModelMap modelo = new ModelMap();
		//List<Turno> turnos = new ArrayList<Turno>();
		//turnos = new ListaDeTurnos().getLista();
		List<Turno> turnos=servicioTurno.obtenerTurnosPorEstado("Disponible");
		
		modelo.put("turnos",turnos);
		modelo.put("esp",new Turno());
		
		return new ModelAndView("index_lista",modelo);
	}
	
	@RequestMapping(value="/mis_turnos") //url
	public ModelAndView vista_mis_turnos(){
		
		//ModelMap modelo = new ModelMap();
		
		
		return new ModelAndView("turnos");
	}
	
	
	@RequestMapping(value="/home") //url
	public ModelAndView vista(){
		return new ModelAndView("VistaEjemplo1");//devuelve una vista
	}

	
	@RequestMapping(value="/inicio")
	public ModelAndView inicioConRP(@RequestParam("nombre") String n,
			 @RequestParam("apellido") String a){
		
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_nombre", n);
		modelo.put("clave_apellido", a);
		return new ModelAndView("PaginaRP",modelo);
	}
	
	@RequestMapping(value="/inicio/{nombre}/tallerweb/{apellido}")
	public ModelAndView inicioConPV(@PathVariable String nombre,
			 @PathVariable String apellido){
		
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_nombre", nombre);
		modelo.put("clave_apellido", apellido);
		return new ModelAndView("PaginaPV",modelo);
	}
	
	/*
	@RequestMapping(value="/listado") //url
	public ModelAndView vistaListado(){
		return new ModelAndView("listado_turnos");//devuelve una vista
	}*/
	
	
	@RequestMapping(value="/solicita") //url
	public ModelAndView vistaSolicita(
			@RequestParam("especialidad") String especialidad,
			 @RequestParam("fecha") String fecha,
			 @RequestParam("horario") String horario,
			 @RequestParam("id") long id
			){
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_especialidad", especialidad);
		modelo.put("clave_fecha", fecha);
		modelo.put("clave_horario", horario);
		modelo.put("id", id);
		modelo.put("persona", new Persona());
		
		return new ModelAndView("solicitar_turno",modelo);//devuelve una vista
	}
	
	@RequestMapping(value="/ej2_recibe", method = RequestMethod.POST)
	public ModelAndView crearPersona(@ModelAttribute Persona persona, @RequestParam("especialidad") String especialidad, @RequestParam("fecha") String fecha, @RequestParam("id") long id){
		ModelMap modelo = new ModelMap();
		
		persona=servicioPersona.guardarPersona(persona);
		Turno turno=new Turno();
		turno=servicioTurno.consultarTurno(id);
		turno.setEstado("Reservado");
		turno.setPersona(persona);
		servicioTurno.modificarTurno(turno);
		
		//guardarPersona();
		modelo.put("clave_nombre", persona.getNombre());
		modelo.put("clave_apellido", persona.getApellido());
		modelo.put("especialidad", especialidad);
		modelo.put("fecha", fecha);
		
		return new ModelAndView("mostrar",modelo);
		
	}
	
	/*COMENZANDO CON EL PROYECTO*/
	
/*
	@RequestMapping(value="/uno")
	public ModelAndView vista3(){
		return new ModelAndView("vista_uno","turno",new ListaDeTurnos().getLista().get(0));
	}
	
	*/
	//Envia parametros por POST
		@RequestMapping(value="/marco")
		public ModelAndView vista_inicial(){
			ModelMap modelo = new ModelMap();
			List<Turno> turnos = new ArrayList<Turno>();
			turnos = new ListaDeTurnos().getLista();
			
			modelo.put("turnos",turnos);
			modelo.put("esp",new Turno());
			return new ModelAndView("ReservarTurno",modelo);
		}
		
		

		@RequestMapping(value="/inicio_buscar")
		public ModelAndView vista_buscar(@ModelAttribute Turno turno){
			ModelMap modelo = new ModelMap();
		//	List<Turno> turnos = new ArrayList<Turno>();
			//turnos = new ListaDeTurnos(turno).getLista();
			List<Turno> turnos=servicioTurno.obtenerTurnos(turno.getEspecialidad());
			
			modelo.put("turnos",turnos);
			modelo.put("esp",turno);
			//return new ModelAndView("ReservarTurno",modelo);
			return new ModelAndView("index_lista",modelo);
		}
		
		public ServicioTurnos getServicioTurno() {
			return servicioTurno;
		}

		public void setServicioTurno(ServicioTurnos servicioTurno) {
			this.servicioTurno = servicioTurno;
		}

		public ServicioPersona getServicioPersona() {
			return servicioPersona;
		}

		public void setServicioPersona(ServicioPersona servicioPersona) {
			this.servicioPersona = servicioPersona;
		}

	
	
	
	
	
}
=======
package ar.edu.grupoesfera.cursospring.controladores;

import java.util.ArrayList;

import java.util.List;

import javax.inject.Inject;
//import javax.servlet.http.HttpServletRequest;





import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.grupoesfera.cursospring.modelo.ListaDeTurnos;
import ar.edu.grupoesfera.cursospring.modelo.Persona;
import ar.edu.grupoesfera.cursospring.modelo.Turno;
import ar.edu.grupoesfera.cursospring.servicios.ServicioPersona;
import ar.edu.grupoesfera.cursospring.servicios.ServicioTurnos;

@Controller
public class ControladorEjemplosBasicos {
	@Inject
	ServicioTurnos servicioTurno;
	@Inject 
	ServicioPersona servicioPersona;
	
	@Transactional
	@Rollback
	@RequestMapping(value="/lista_dinamica") //url
	public ModelAndView vista_index_lista(){
		
		ModelMap modelo = new ModelMap();
		//List<Turno> turnos = new ArrayList<Turno>();
		//turnos = new ListaDeTurnos().getLista();
		List<Turno> turnos=servicioTurno.obtenerTurnosPorEstado("Disponible");
		
		modelo.put("turnos",turnos);
		modelo.put("esp",new Turno());
		
		return new ModelAndView("index_lista",modelo);
	}
	
	@RequestMapping(value="/mis_turnos") //url
	public ModelAndView vista_mis_turnos(){
		
		//ModelMap modelo = new ModelMap();
		
		
		return new ModelAndView("turnos");
	}
	
	
	@RequestMapping(value="/home") //url
	public ModelAndView vista(){
		return new ModelAndView("VistaEjemplo1");//devuelve una vista
	}

	
	@RequestMapping(value="/inicio")
	public ModelAndView inicioConRP(@RequestParam("nombre") String n,
			 @RequestParam("apellido") String a){
		
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_nombre", n);
		modelo.put("clave_apellido", a);
		return new ModelAndView("PaginaRP",modelo);
	}
	
	@RequestMapping(value="/inicio/{nombre}/tallerweb/{apellido}")
	public ModelAndView inicioConPV(@PathVariable String nombre,
			 @PathVariable String apellido){
		
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_nombre", nombre);
		modelo.put("clave_apellido", apellido);
		return new ModelAndView("PaginaPV",modelo);
	}
	
	/*
	@RequestMapping(value="/listado") //url
	public ModelAndView vistaListado(){
		return new ModelAndView("listado_turnos");//devuelve una vista
	}*/
	
	
	@RequestMapping(value="/solicita") //url
	public ModelAndView vistaSolicita(
			@RequestParam("especialidad") String especialidad,
			 @RequestParam("fecha") String fecha,
			 @RequestParam("horario") String horario,
			 @RequestParam("id") long id
			){
		ModelMap modelo = new ModelMap();//contenedor mapa  de clave y valor
		modelo.put("clave_especialidad", especialidad);
		modelo.put("clave_fecha", fecha);
		modelo.put("clave_horario", horario);
		modelo.put("id", id);
		modelo.put("persona", new Persona());
		
		return new ModelAndView("solicitar_turno",modelo);//devuelve una vista
	}
	
	@RequestMapping(value="/ej2_recibe", method = RequestMethod.POST)
	public ModelAndView crearPersona(@ModelAttribute Persona persona, @RequestParam("especialidad") String especialidad, @RequestParam("fecha") String fecha, @RequestParam("id") long id){
		ModelMap modelo = new ModelMap();
		
		persona=servicioPersona.guardarPersona(persona);
		Turno turno=new Turno();
		turno=servicioTurno.consultarTurno(id);
		turno.setEstado("Reservado");
		turno.setPersona(persona);
		servicioTurno.modificarTurno(turno);
		
		//guardarPersona();
		modelo.put("clave_nombre", persona.getNombre());
		modelo.put("clave_apellido", persona.getApellido());
		modelo.put("especialidad", especialidad);
		modelo.put("fecha", fecha);
		
		return new ModelAndView("mostrar",modelo);
		
	}
	
	/*COMENZANDO CON EL PROYECTO*/
	
/*
	@RequestMapping(value="/uno")
	public ModelAndView vista3(){
		return new ModelAndView("vista_uno","turno",new ListaDeTurnos().getLista().get(0));
	}
	
	*/
	//Envia parametros por POST
		@RequestMapping(value="/marco")
		public ModelAndView vista_inicial(){
			ModelMap modelo = new ModelMap();
			List<Turno> turnos = new ArrayList<Turno>();
			turnos = new ListaDeTurnos().getLista();
			
			modelo.put("turnos",turnos);
			modelo.put("esp",new Turno());
			return new ModelAndView("ReservarTurno",modelo);
		}
		
		

		@RequestMapping(value="/inicio_buscar")
		public ModelAndView vista_buscar(@ModelAttribute Turno turno){
			ModelMap modelo = new ModelMap();
		//	List<Turno> turnos = new ArrayList<Turno>();
			//turnos = new ListaDeTurnos(turno).getLista();
			List<Turno> turnos=servicioTurno.obtenerTurnos(turno.getEspecialidad());
			
			modelo.put("turnos",turnos);
			modelo.put("esp",turno);
			//return new ModelAndView("ReservarTurno",modelo);
			return new ModelAndView("index_lista",modelo);
		}
		
		public ServicioTurnos getServicioTurno() {
			return servicioTurno;
		}

		public void setServicioTurno(ServicioTurnos servicioTurno) {
			this.servicioTurno = servicioTurno;
		}

		public ServicioPersona getServicioPersona() {
			return servicioPersona;
		}

		public void setServicioPersona(ServicioPersona servicioPersona) {
			this.servicioPersona = servicioPersona;
		}

	
	
	
	
	
}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
