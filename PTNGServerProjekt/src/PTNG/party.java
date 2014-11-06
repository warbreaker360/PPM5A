package PTNG;

public class party extends Person {

Person p1;
Person p2;
Person p4;
Person p5;
Person p6;
Person p7;
Person p8;
public party(String nachname, String vorname, String benutzerID,
		String breitengrad, String längegrad, String passwort, Person p1,
		Person p2, Person p4, Person p5, Person p6, Person p7, Person p8) {
	super(nachname, vorname, benutzerID, breitengrad, längegrad, passwort);
	this.p1 = p1;
	this.p2 = p2;
	this.p4 = p4;
	this.p5 = p5;
	this.p6 = p6;
	this.p7 = p7;
	this.p8 = p8;
}
public Person getP1() {
	return p1;
}
public void setP1(Person p1) {
	this.p1 = p1;
}
public Person getP2() {
	return p2;
}
public void setP2(Person p2) {
	this.p2 = p2;
}
public Person getP4() {
	return p4;
}
public void setP4(Person p4) {
	this.p4 = p4;
}
public Person getP5() {
	return p5;
}
public void setP5(Person p5) {
	this.p5 = p5;
}
public Person getP6() {
	return p6;
}
public void setP6(Person p6) {
	this.p6 = p6;
}
public Person getP7() {
	return p7;
}
public void setP7(Person p7) {
	this.p7 = p7;
}
public Person getP8() {
	return p8;
}
public void setP8(Person p8) {
	this.p8 = p8;
}



	
	
}
