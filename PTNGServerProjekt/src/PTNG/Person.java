package PTNG;

public class Person {
	String benutzerID;
	String nachname; 
	String vorname;
	String breitengrad;
	String l�ngegrad;
	String passwort;
	String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
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
	public String getBenutzerID() {
		return benutzerID;
	}
	public void setBenutzerID(String benutzerID) {
		this.benutzerID = benutzerID;
	}
	public String getBreitengrad() {
		return breitengrad;
	}
	public void setBreitengrad(String breitengrad) {
		this.breitengrad = breitengrad;
	}
	public String getL�ngegrad() {
		return l�ngegrad;
	}
	public void setL�ngegrad(String l�ngegrad) {
		this.l�ngegrad = l�ngegrad;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public Person(String nachname, String vorname, String benutzerID,
			String breitengrad, String l�ngegrad, String passwort) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzerID = benutzerID;
		this.breitengrad = breitengrad;
		this.l�ngegrad = l�ngegrad;
		this.passwort = passwort;
	}

	
	public Person(String nachname, String vorname, String benutzerID,
			String breitengrad, String l�ngegrad, String passwort, String text) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzerID = benutzerID;
		this.breitengrad = breitengrad;
		this.l�ngegrad = l�ngegrad;
		this.passwort = passwort;
		this.text=text;
	}
	
	
	

	
	
	
}
