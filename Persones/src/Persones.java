import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe Persones
 * Aquí tendrem un llistat de 3 persones
 * @author jaume
 * @version 0.1
 */
public class Persones {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	
	private Persona [] persones = new Persona[3];

	/**
	 * Constructor de Persones
	 */
	public Persones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Mètode per introduir les persones dins el vector
	 * Aqust mètode té un for per recorre el vector i crida al mètode intern introduirPersona()
	 */
	public void introduirPersones(){
		for (int i = 0; i < 3; i++){
			persones[i] = introduirPersona(i);
		}
	}

	/**
	 * Mètode intern per introduir les dades d'una Persona
	 * Va demanant per pantalla les dades i les introdueix on toca
	 * Rep un paràmetre per informar a l'usuari de quin nombre "persona" estam introduïnt
	 * Retornam un tipus Persona
	 * @param i
	 * @return
	 */
	private Persona introduirPersona(int i) {
		Persona p = new Persona();
		System.out.println("Introdueix la Persona nº " + i + 1);
		System.out.println("Introdueix el nom de la Persona");
		try {
			p.setNom(stdin.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Introdueix els llinatges de la Persona");
		try {
			p.setLlinatges(stdin.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	/**
	 * Mètode que mostre totes les persones del vector.
	 * Fa servir un for per recorrer.
	 */
	public void mostrarPersones() {
		for(int i = 0; i < 3; i++){
			System.out.println(((Persona)persones[i]).toString());
		}
		
	}

	/**
	 * Mètode que mostre una persona concreta.
	 * Abans demana a l'usuari quina persona vol mostrar
	 */
	public void mostrarUnaPersona() {
		System.out.println("Quina Persona vols mostrar?");
		int i = 0;
		try {
			i = Integer.parseInt(stdin.readLine());
			System.out.println(((Persona)persones[i-1]).toString());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Has entrat un nombre no vàlid");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
