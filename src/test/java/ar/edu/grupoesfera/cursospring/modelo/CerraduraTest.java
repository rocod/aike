<<<<<<< HEAD
package ar.edu.grupoesfera.cursospring.modelo;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {
	
	/*
	@Test
	public void ingresarClaveCorrectaDeberiAabrirLaCerradura(){
		Cerradura cerradura =new Cerradura (1234);
		Boolean abrio = cerradura.abrir(1234);
		Assert.assertTrue(abrio);
	}
	public void ingresarClaveIncorrectaNoDeberiaAbrirLaCerradura(){	
	}
	*/
	
	@Test
	public void ingresarClaveNVeces(){
		Cerradura cerradura =new Cerradura (1234,3);
		cerradura.abrir(8);
		cerradura.abrir(1256);
		//cerradura.abrir(11);
		Assert.assertTrue(cerradura.estaBloqueada());
	}
}
=======
package ar.edu.grupoesfera.cursospring.modelo;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {
	
	/*
	@Test
	public void ingresarClaveCorrectaDeberiAabrirLaCerradura(){
		Cerradura cerradura =new Cerradura (1234);
		Boolean abrio = cerradura.abrir(1234);
		Assert.assertTrue(abrio);
	}
	public void ingresarClaveIncorrectaNoDeberiaAbrirLaCerradura(){	
	}
	*/
	
	@Test
	public void ingresarClaveNVeces(){
		Cerradura cerradura =new Cerradura (1234,3);
		cerradura.abrir(8);
		cerradura.abrir(1256);
		//cerradura.abrir(11);
		Assert.assertTrue(cerradura.estaBloqueada());
	}
}
>>>>>>> 4ce79bd390a4a0a1b84199a55c404db392b645fd
	