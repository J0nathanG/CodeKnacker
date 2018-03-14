
public class Spielbrett {
	
	String[][] Kontrollbrett  = new String[10][4];
	String[][] Spielbrett  = new String[10][4];
	String[][] Code  = new String[1][4];
	
	public void setSpielbrettPunkt(String farbe, int spalte, int zeile){
		Spielbrett[spalte][zeile] = farbe;
	}
	
	public void setKontrollbrettPunkt(String kontrolle, int spalte, int zeile){
		Kontrollbrett[spalte][zeile] = kontrolle;
	}
	
	public void setCodePunkt(String farbe, int zeile){
		Code[1][zeile] = farbe;
	}
	
	public String getSpielbrettPunkt(int spalte, int zeile){
		return Spielbrett[spalte][zeile];
	}
	
	public String getKontrollbrettPunkt(int spalte, int zeile){
		return Kontrollbrett[spalte][zeile];
	}
	
	public String getCodePunkt(int zeile){
		return Kontrollbrett[1][zeile];
	}
}
