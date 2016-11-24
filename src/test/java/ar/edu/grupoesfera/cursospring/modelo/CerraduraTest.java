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
	