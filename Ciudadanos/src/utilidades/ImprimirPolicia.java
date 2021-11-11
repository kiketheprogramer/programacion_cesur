package utilidades;

import ciudadanos.Ciudadanos;
import persona.Persona;
import policia.Policia;

public abstract class  ImprimirPolicia {
	Persona persona;
	Ciudadanos ciudadanos;
	Policia policia;
	
	public static void imprimirDatosPolicia (Persona persona, Ciudadanos ciudadanos, Policia policia) {
		imprimirDatosPersonales(persona);
		imprimirDatosFiscales(ciudadanos);
		imprimirDatosLaborales(policia);
	} 
	
	public static void imprimirDatosPersonales(Persona persona) {
		System.out.println("Nombre..:"+persona.getNombre());
		System.out.println("Edad..:"+persona.getEdad());
		System.out.println("Peso..:"+persona.getPeso());
	}
	public static void imprimirDatosFiscales(Ciudadanos ciudadanos) {
		System.out.println("Nombre..:"+ciudadanos.getDni());
		System.out.println("Edad..:"+ciudadanos.getnSS());
		System.out.println("Peso..:"+ciudadanos.getDomicilio());
	}
	public static void imprimirDatosLaborales(Policia policia) {
		System.out.println("Nombre..:"+policia.getAntiguedad());
		System.out.println("Edad..:"+policia.getnPlaca());
	}
	
	
}
