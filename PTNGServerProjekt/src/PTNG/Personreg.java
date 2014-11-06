package PTNG;

public class Personreg {

	String benutzerID;
	String nachname; 
	String vorname;
	String passwort;
	
	
	public String getBenutzerID() {
		return benutzerID;
	}
	public void setBenutzerID(String benutzerID) {
		this.benutzerID = benutzerID;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public Personreg(String benutzerID, String nachname, String vorname,
			String passwort) {
		super();
		this.benutzerID = benutzerID;
		this.nachname = nachname;
		this.vorname = vorname;
		this.passwort = passwort;
	}	
	
	
	
}
