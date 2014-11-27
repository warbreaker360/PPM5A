package PTNG;

public class Person {
	String benutzerID;
	String nachname; 
	String vorname;
	String breitengrad;
	String lŠngegrad;
	String passwort;
	String text;
	String party;
	int idbenutzer;
	
	public int getIdbenutzer() {
		return idbenutzer;
	}
	public void setIdbenutzer(int idbenutzer) {
		this.idbenutzer = idbenutzer;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
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
	public String getLŠngegrad() {
		return lŠngegrad;
	}
	public void setLŠngegrad(String lŠngegrad) {
		this.lŠngegrad = lŠngegrad;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
	public Person(String nachname, String vorname, String benutzerID,
			String breitengrad, String lŠngegrad, String passwort) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzerID = benutzerID;
		this.breitengrad = breitengrad;
		this.lŠngegrad = lŠngegrad;
		this.passwort = passwort;
	}

	
	public Person(String nachname, String vorname, String benutzerID,
			String breitengrad, String lŠngegrad, String passwort, String text) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.benutzerID = benutzerID;
		this.breitengrad = breitengrad;
		this.lŠngegrad = lŠngegrad;
		this.passwort = passwort;
		this.text=text;
	}
	public Person(String benutzerID, String text,
			String party) {
		super();
		this.benutzerID = benutzerID;
		this.text = text;
		this.party = party;
	}
	
	
	
	
	public Person(String benutzerID, String nachname, String vorname,
			String breitengrad, String lŠngegrad, String passwort, String text,
			String party, int idbenutzer) {
		super();
		this.benutzerID = benutzerID;
		this.nachname = nachname;
		this.vorname = vorname;
		this.breitengrad = breitengrad;
		this.lŠngegrad = lŠngegrad;
		this.passwort = passwort;
		this.text = text;
		this.party = party;
		this.idbenutzer = idbenutzer;
	}
	public Person()
	{
		
	}
	
	

	
	
	
}
