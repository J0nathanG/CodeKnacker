
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
	
	//Methode, mit der Spieler 1 den Code einstellen kann.
	public void setCode(){
		for(int j=1; j<5; j++){
		//Anzeige.gibAus("Bitte wähle die"+j+". Farbe des Codes.");
			String eingabefarbe = w;
			while(Spieler1.setEingabeFarbe(eingabefarbe)!= true){eingabefarbe = Ausgabe.getEingabe();}
			Spielbrett.setCodePunkt(eingabefarbe, j);		
		}
		
	}
	
	//Die Methode Spielzug beinhaltet das Anzeigen aller alten Knackversuche für SPieler 2, einen neuen Knackversuch und das Kntrollieren des Knackversuches durch Spieler 1.
	public void Spielzug(int i){
		for(int h = 1; h<i; h++){
			//Anzeige.gibAus("Knackversuch"+h+":"+Spielbrett.getSpielbrettPunkt(h, 1)+" "+Spielbrett.getSpielbrettPunkt(h, 2)+" "+Spielbrett.getSpielbrettPunkt(h, 3)+" "+Spielbrett.getSpielbrettPunkt(h, 4)+".");
			//Anzeige.gibAus("Knackversuch"+h+":"+Spielbrett.getKontrollbrettPunkt(h, 1)+" "+Spielbrett.getKontrollbrettPunkt(h, 2)+" "+Spielbrett.getKontrollbrettPunkt(h, 3)+" "+Spielbrett.getKontrollbrettPunkt(h, 4)+".");
			}
		for(int j=1; j<5; j++){
			//Anzeige.gibAus("Bitte wähle die"+j+". Farbe des Knackversuches.");
				String eingabefarbe = w;
				while(Spieler1.setEingabeFarbe(eingabefarbe)!= true){eingabefarbe = Ausgabe.getEingabe();}
				Spielbrett.setSpielbrettPunkt(eingabefarbe, i, j);		
			}
		weitergabeSpieler("Spieler1");
	}
	
	//noch etwas provisorisch, das mit dem Enter muss noch überarbeitet werden
	//Die Methode informiert einen Spieler, dass der Spielzug endet, löscht die Anzeige und 
	//geht sicher, dass der nächste Spieler bereit ist, seinen Zug beginnen, bevor er Infos ausgibt.
	public void weitergabeSpieler(String spieler){
		//String eingabe = x;
		//while (eingabe != Enter){
		//Anzeige.gibAus("Drücke Enter und gebe dann an"+spieler+"weiter.");
		//eingabe = Anzeige.getEingabe();
		//}
		//eingabe = x;
		//Anzeige.clearText();
		//while (Anzeige.getEingabe() != Enter){
		//Anzeige.gibAus(spieler+", bitte drücke Enter, wenn sie bereit für ihren Zug sind.")
		//eingabe = Anzeige.getEingabe();
		//}
	}
}
