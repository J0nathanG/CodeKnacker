
public class Main {

	/**
	 * @param args
	 */
	Spieler Spieler1 = new Spieler();
	Spieler Spieler2 = new Spieler();
	Spielbrett Spielbrett = new Spielbrett();
	//Textfeld Anzeige = new Textdfeld();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setCode();
		Anzeige.clearText();
		for (i=1; i<11; i++){
			Spielzug(i);
			//break bei Spielende
		}
		siegerausgabe();
	}
	
	
}
