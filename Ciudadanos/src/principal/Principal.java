package principal;

import java.util.ArrayList;

import ciudadanos.Ciudadanos;
import persona.Persona;
import policia.Policia;

public class Principal {

						@SuppressWarnings({ "unused", "unchecked"})
	public static void main(String[] args) {
		
				Persona persona1 = new Persona();	//llamada al constructor vacío
						persona1.setNombre("Persona con Constructor_Vacio");
						persona1.setEdad(40);
						persona1.setPeso(70);
	
				Persona persona2 = new Persona(45, 75, "Persona2 con Constructor con paramentros");
				Persona persona3 = new Persona(46, 73, "Persona3 con Constructor con paramentros");
						String nombrePersona = persona2.getNombre();
								//System.out.println("Nombre:..."+nombrePersona);
		//---------------------HERENCIA-----------------------------------------------
				Ciudadanos ciudadano1 = new Ciudadanos();
						ciudadano1.setNombre("Pepe"); // propiedad heredada de Persona
						ciudadano1.setEdad(50); // propiedad heredada de Persona
						ciudadano1.setPeso(75); // propiedad heredada de Persona
						ciudadano1.setDni(123456);
						ciudadano1.setDomicilio("Zaragoza");
						ciudadano1.setnSS(1234567);
		//*************************POLIMORFISMO*******************************
				Persona personaCiudadano = new Ciudadanos(789456, 7894561, "Zaragoza");
						personaCiudadano.setEdad(0);
						personaCiudadano.setNombre("Alfonso");
						personaCiudadano.setPeso(90);
				
	    //***************************HERENCIA TOTAL*************************************************************
				Policia poli1 = new Policia();
					poli1.setNombre("A");
					poli1.setDni(123);
					poli1.setDomicilio("Zaragoza");
					poli1.setAntiguedad(10);
					poli1.setnSS(456);
						poli1.setPeso(90);
						poli1.setEdad(30);
						poli1.setnPlaca(88);
				Persona poliLocal = new Policia(2134, 320, "Madrid", 12, 120);		
		//******************************POLIMORFISMO_2**********************************************************
				Ciudadanos ciudadanoPoli = new Policia(5, 55, "Jose", 33, 44);
						ciudadanoPoli.setDni(200);	
		//______________________________ARRAYLISTS______________________________________________________________
		
				ArrayList<Persona>listaPersonas = new ArrayList<Persona>();
						listaPersonas.add(persona1);	//posicion0
						listaPersonas.add(persona2);	//posicion1
						listaPersonas.add(persona3);	//posicion2
						//boolean contiene = listaPersonas.contains(persona1);    //devuelve una variable boolean
						for (Persona persona : listaPersonas) {
								//System.out.println ("Valor de contiene.." + listaPersonas.contains(persona1));
								//System.out.println ("El nombre es..." + persona.getNombre());
								//System.out.println ("El nombre es..." + persona.getEdad());
							}				
				Persona pers1 = listaPersonas.get(0);           //devuelve la posición de un objeto
								//System.out.println(pers1.getNombre());
								//System.out.println(pers1.getPeso());				
						listaPersonas.remove(0);      //borrando el objeto en posición 0
						for (Persona persona : listaPersonas) {
								//System.out.println ("Valor de contiene.." + listaPersonas.contains(persona1));
								//System.out.println ("Valor de contiene.." + listaPersonas.contains(persona2));
							}
				//___________Clonado de Listas____________________
				ArrayList<Persona> listaPersonasClonadas = (ArrayList<Persona>) listaPersonas.clone();
								//System.out.println ("Dentro de la lista clonada:");
						for (Persona persona : listaPersonasClonadas) {
								//System.out.println ("El nombre es.." + persona.getNombre());
							}
				//___________Clonado de Objetos_______________________________________________________________________________________________________
				int sizeLista = listaPersonasClonadas.size();
				System.out.println("El tamaño de la lista es "+sizeLista);
				listaPersonasClonadas.add(persona1);
				sizeLista = listaPersonasClonadas.size();
				System.out.println("El tamaño de la lista es "+sizeLista);
				
	//_____________________________________________________________________________________________________________________________________________
					
					
					
					
					
					
					
	}
}

