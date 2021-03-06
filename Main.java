
public class Main {

	/**
	 * @param args
	 */
	Spieler Spieler1 = new Spieler();
	Spieler Spieler2 = new Spieler();
	Spielbrett Spielbrett = new Spielbrett();
	static boolean richtigGeraten = false;
	Textfeld Anzeige = new Textfeld();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setCode();
		Anzeige.clearText();
		for (i=1; i<11; i++){
			Spielzug(i);
			if(richtigGeraten == true){break;}
		}
		siegerausgabe();
	}
	
	//Methode, mit der Spieler 1 den Code einstellen kann.
	public void setCode(){
		for(int j=1; j<5; j++){
		Anzeige.gibAus("Bitte waehle die"+j+". Farbe des Codes.");
			String eingabefarbe = w;
			while(Spieler1.setEingabeFarbe(eingabefarbe)!= true){eingabefarbe = Ausgabe.getEingabe();}
			Spielbrett.setCodePunkt(eingabefarbe, j);		
		}
		
	}
	
	//Die Methode Spielzug beinhaltet das Anzeigen aller alten Knackversuche für Spieler 2, einen neuen Knackversuch und das Kntrollieren des Knackversuches durch Spieler 1.
	public void Spielzug(int i){
		for(int h = 1; h<i; h++){
			Anzeige.gibAus("Knackversuch"+h+":"+Spielbrett.getSpielbrettPunkt(h, 1)+" "+Spielbrett.getSpielbrettPunkt(h, 2)+" "+Spielbrett.getSpielbrettPunkt(h, 3)+" "+Spielbrett.getSpielbrettPunkt(h, 4)+".");
			Anzeige.gibAus("Knackversuch"+h+":"+Spielbrett.getKontrollbrettPunkt(h, 1)+" "+Spielbrett.getKontrollbrettPunkt(h, 2)+" "+Spielbrett.getKontrollbrettPunkt(h, 3)+" "+Spielbrett.getKontrollbrettPunkt(h, 4)+".");
			}
		for(int j=1; j<5; j++){
			Anzeige.gibAus("Bitte waehle die"+j+". Farbe des Knackversuches.");
				String eingabefarbe = w;
				while(Spieler1.setEingabeFarbe(eingabefarbe)!= true){eingabefarbe = Ausgabe.getEingabe();}
				Spielbrett.setSpielbrettPunkt(eingabefarbe, i, j);		
			}
		weitergabeSpieler("Spieler1");
		for(int j=1; j<5; j++){
			Anzeige.gibAus("Bitte waehle die"+j+". Farbe der Kontrollausgabe. weiss für Farbe und Ort richtig, schwarz für Farbe richtig und leer für nichts.");
				String kontrollfarbe = w;
				while(Spieler1.setEingabeKontrolle(kontrollfarbe)!= true){kontrollfarbe = Ausgabe.getEingabe();}
				Spielbrett.setKontrollbrettPunkt(kontrollfarbe, i, j);		
			}
		if(Spielbrett.getKontrollbrettPunkt(i, 1)=="weiss" ||Spielbrett.getKontrollbrettPunkt(i, 2)=="weiss" ||Spielbrett.getKontrollbrettPunkt(i, 3)=="weiss" ||Spielbrett.getKontrollbrettPunkt(i, 4)=="weiss"){
			richtigGeraten = true;
		}
		weitergabeSpieler("Spieler2");
	}
	
	//Diese Methode gibt den Sieger aus.
	public void siegerausgabe(){
		if(richtigGeraten == true){Anzeige.gibAus("Spieler 2 hat gewonnen.");}
		else{Anzeige.gibAus("Spieler 1 hat gewonnen.");}
	}
	
	//Die Methode informiert einen Spieler, dass der Spielzug endet, loescht die Anzeige und 
	//geht sicher, dass der naechste Spieler bereit ist, seinen Zug beginnen, bevor er Infos ausgibt.
	public void weitergabeSpieler(String spieler){
		String eingabe = x;
		while (eingabe != "ja"){
		Anzeige.gibAus("Gebe ja ein und gebe dann an"+spieler+"weiter.");
		eingabe = Anzeige.getEingabe();
		}
		eingabe = x;
		Anzeige.clearText();
		while (eingabe() != "ja"){
		Anzeige.gibAus(spieler+", bitte gebe ja ein, wenn du bereit für deinen Zug bist.")
		eingabe = Anzeige.getEingabe();
		}
	}
}
