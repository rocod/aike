package ar.edu.grupoesfera.cursospring.modelo;

import org.hibernate.Session;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

public class FarmaciaTest extends SprintTest {
	@Test
	@Transactional
	@Rollback
	public void testFarmacia() {
		
		Barrio barrio =new Barrio();		
		barrio.setNombre("San Justo");
				
		Direccion direccion = new Direccion();		
		direccion.setBarrio(barrio);
		direccion.setCalle("colonia");
		direccion.setPuerta("segundo");
		Farmacia farmacia = new Farmacia();
		farmacia.setNombre("manolo");
		farmacia.setDireccion(direccion);
		Session s = getSession();
		s.save(barrio);	
		s.save(farmacia);
		

		Direccion d = s.get(Direccion.class, direccion.getId());
		assertThat(d).isNotNull();

	}
}
