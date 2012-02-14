import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe Menus
 * Ens genera els menus necessaris de l'aplicatiu
 * @author jaume
 * @version 0.1
 */
public class Menus {
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	
	/**
	 * Constructor de Menus
	 */
	public Menus() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	/**
	 * Mètode que ens mostre el menú inicial per pantalla i retorna l'opció desitjada
	 * @return
	 */
	public int menuInicial(){
		int op = 0;
	
		do{
			System.out.println("***********************");
			System.out.println("* 1 - Omplir persones *");
			System.out.println("* 2 - Sortir          *");
			System.out.println("*---------------------*");
			System.out.println("* Estria una opció    *");
			System.out.println("***********************");
			try {
				op = Integer.parseInt(stdin.readLine());
			} catch (NumberFormatException e) {
				System.out.println("No has entrar un nombre vàlid");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while (!((op == 1) || (op == 2)));
		return op;	
	}
	
	/**
	 * Mètode que ens mostre el menú normal per pantalla i ens retorna l'opció desitjada
	 * @return
	 */
	public int menuNormal(){
		int op = 0;
		
		do{ 
			System.out.println("*****************************");
			System.out.println("* 1 - Reomplir persones     *");
			System.out.println("* 2 - Visualitzar Persones  *");
			System.out.println("* 3 - Mostrar 1 P. concreta *");
			System.out.println("* 4 - Sortir                *");
			System.out.println("*---------------------------*");
			System.out.println("* Estria una opció          *");
			System.out.println("*****************************");
			try {
				op = Integer.parseInt(stdin.readLine());
			} catch (NumberFormatException e) {
				System.out.println("No has entrar un nombre vàlid");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while (!((op >= 1) || (op <= 4)));
		return op;
	}

	/**
	 * Mètode que mostre el missatge de sortida
	 */
	public void sortir() {
		System.out.println("Gràcies per utilitzar els nostres serveis. Adéu!");
		
	}

}
