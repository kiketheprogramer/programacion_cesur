package utilidades;

public class imprimirmedico {

	import ciudadanos.Ciudadanos;
	import persona.Persona;
	import medicos.Medico;

	public abstract class  ImprimirDatosMedico {
		Persona persona;
		Ciudadanos ciudadanos;
		medicos Medico;
		
		public static void imprimirDatosMedico  (Persona persona, Ciudadanos ciudadanos, Medicos medico) {
			imprimirDatosPersonales(persona);
			imprimirDatosFiscales(ciudadanos);
			imprimirDatosLaborales(medico );
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
