/**
 * Classe Main. Classe que té el programa principal
 * @author jaume
 * @version 0.1
 */
public class Main {

	/**
	 * Mètode Main. Programa principal.
	 * @param args
	 */
	public static void main(String[] args) {
		Menus m = new Menus();
		Persones persones = new Persones();
		int op = 0 ;
		//Mostram el menú inicial
		op = m.menuInicial();
		
		//passam op de 2 a 4 per sortir
		if (op == 2) op = 4;
		do{
		  switch (op){
		  	case 1: persones.introduirPersones(); break;
		  	case 2: persones.mostrarPersones(); break;
		  	case 3: persones.mostrarUnaPersona(); break;
		  	default: m.sortir();
		  }
		  if (op != 4){
			//Mostram el menú normal  
			op = m.menuNormal();  
		  }
		}while (op !=4 );
	}

}
