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
			String breitengrad, String l�ngegrad, String passwort,
			String textfile) {
		super(nachname, vorname, benutzerID, breitengrad, l�ngegrad, passwort);
		this.textfile = textfile;
	}
	
	
	
	
	
	
	
}
