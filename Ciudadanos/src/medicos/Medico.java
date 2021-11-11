package medicos;

import ciudadanos.Ciudadanos;

public class Medico extends Ciudadanos {
	
	 private int Ncolegiado ; 
	 private String especialidad; 
	  
	  public Medico() { 
		  
		  
		  public Medico(int dni, int nSS, String domicilio, int Ncolegiado, String especialidad) {
			  
			  super(dni, nSS, domicilio);
			  this.Ncolegiado = Ncolegiado; 
			  this.especialidad = especialidad; 
			  
		   }
	  
	  }

	public int getNcolegiado() {
		return Ncolegiado;
	}

	public void setNcolegiado(int ncolegiado) {
		Ncolegiado = ncolegiado;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
