
public class Spieler {
	private String farbe;
	private String kontrolle;
		
		public boolean setEingabeFarbe(String eingabefarbe){
			if (eingabefarbe == "blau"||eingabefarbe =="gelb"||eingabefarbe =="gruen"||eingabefarbe =="rot"||eingabefarbe =="orange"){
				farbe = eingabefarbe;
				return true;}
			else {return false;}
		}
	
		public boolean setEingabeKontrolle(String eingabekontrolle){
			if (eingabekontrolle == "weiss"||eingabekontrolle =="schwarz"||eingabekontrolle =="leer"){
				kontrolle = eingabekontrolle;
				return true;}
			else {return false;}
		}
	
		public String getEingabeFarbe(){
			return farbe;
		}
	
		public String getEingabeKontrolle(){
			return kontrolle;
		}
}
