package PTNG;

public class Person {
	String benutzerID;
	String nachname; 
	String vorname;
	String breitengrad;
	String längegrad;
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
	public String getLängegrad() {
		return längegrad;
	}
	public void setLängegrad(String längegrad) {
		this.längegrad = längegrad;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public Person(String nachname, String vorname, String benutzerID,
			String breitengrad, String längegrad, String passwort) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzerID = benutzerID;
		this.breitengrad = breitengrad;
		this.längegrad = längegrad;
		this.passwort = passwort;
	}

	
	public Person(String nachname, String vorname, String benutzerID,
			String breitengrad, String längegrad, String passwort, String text) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzerID = benutzerID;
		this.breitengrad = breitengrad;
		this.längegrad = längegrad;
		this.passwort = passwort;
		this.text=text;
	}
	
	
	

	
	
	
}
