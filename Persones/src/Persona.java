/**
 * Classe Persona
 * @author jaume
 * @version 0.1
 */
public class Persona {
	
	
	private String nom;
	private String llinatges;
	private byte edat;
	private String telefon;
	
	/**
	 * Constructor mitjançant parametres
	 * @param nom
	 * @param llinatges
	 * @param edat
	 * @param telefon
	 */
	public Persona(String nom, String llinatges, byte edat, String telefon) {
		super();
		this.nom = nom;
		this.llinatges = llinatges;
		this.edat = edat;
		this.telefon = telefon;
	}
	
	/**
	 * Constructor de superclasse
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Mètode que retorna el nom de la persona
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Mètode per insertar el nom de la Persona
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Mètode que retorna els llinatges de la Persona
	 * @return
	 */
	public String getLlinatges() {
		return llinatges;
	}
	/**
	 * Mètode per insertar els llinatges de la Persona
	 * @param llinatges
	 */
	public void setLlinatges(String llinatges) {
		this.llinatges = llinatges;
	}
	/**
	 * Mètode que retorna l'edat de la persona
	 * @return
	 */
	public byte getEdat() {
		return edat;
	}
	/**
	 * Mètode per insertar l'edat de la Persona
	 * @param edat
	 */
	public void setEdat(byte edat) {
		this.edat = edat;
	}
	/**
	 * Mètode que retorna el telèfona de la Persona
	 * @return
	 */
	public String getTelefon() {
		return telefon;
	}
	/**
	 * Mètode per insertar el telèfon de la Persona
	 * @param telefon
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	/**
	 * Mètode que retorna el toString de Persona
	 * @return
	 */
	@Override
	public String toString() {
		return "Nom: " + this.nom + "\n" +
			   "Lllinatges: " + this.llinatges + "\n" +
			   "Edad: " + this.edat + "\n" +
			   "Telèfon: " + this.telefon + "\n" +
			   "--------------------------------------- \n";
	}
	
	

}
