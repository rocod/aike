package ar.edu.grupoesfera.cursospring.modelo;

public class Cerradura {
	private Integer claveApertura;
	private Integer cantErrores;
	private Integer contador;
	
	public Cerradura (Integer claveApertura,Integer cantErrores){
		this.claveApertura=claveApertura;
		this.cantErrores= cantErrores;
		this.contador=0;
	}
	
	public boolean abrir(Integer claveApertura){
		boolean res=false;
		if (cantErrores != contador){
			    if(this.claveApertura.equals(claveApertura)){
			    	contador = 0;
			    	res = true;
				}else{
					contador++;
				}
		}
		return res;
	}
	
	public boolean estaBloqueada(){
		boolean res=false;
		if (cantErrores == contador){
			res = true;
		}
		return res;
		
	}
}
