package PTNG;

public class Personentext extends Person {
	

	String textfile;

	public String getTextfile() {
		return textfile;
	}

	public void setTextfile(String textfile) {
		this.textfile = textfile;
	}

	public Personentext(String nachname, String vorname, String benutzerID,
			String breitengrad, String lŠngegrad, String passwort,
			String textfile) {
		super(nachname, vorname, benutzerID, breitengrad, lŠngegrad, passwort);
		this.textfile = textfile;
	}
	
	
	
	
	
	
	
}
