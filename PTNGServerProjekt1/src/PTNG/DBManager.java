package PTNG;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class DBManager {

Connection conn;

		public DBManager() throws ClassNotFoundException, SQLException 
		
		{
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:nico.db");

		}

		public void close() throws SQLException {
			conn.close();
		}
	
	
		public static void main( String args[])
		  {
		    Connection c = null;
		    Statement stmt = null;
		    Statement stm=null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:nico.db");
		      System.out.println("Opened database successfully");
		     
	          stmt = c.createStatement();
	          stm =c.createStatement();
	          
		      String sq = "CREATE TABLE Person " +
		                   "(BENUTZERID  TEXT PRIMARY KEY    NOT NULL," +
		                   " NACHNAME      TEXT    NOT NULL, " + 
		                   " VORNAME        TEXT     NOT NULL, " + 
		                   " BREITENGRAD     REAL     , " + 
		                   " LAENGENGRAD      REAL    , " + 
		                   " PASSWORT          TEXT   NOT NULL " + 
		                   " );";		                   
		                  
		    String sp=  "CREATE TABLE Partys"+
	                    "(PARTYID TEXT PRIMARY KEY    NOT NULL"+
	                    "TEXTFILE        TEXT     NOT NULL, "+
	                    "IDBENUTZER        INTEGER   , "+           //fragen brauche zahlenwert 
	                    "BENUTZERID TEXT "+");";
		     
		      stmt.executeUpdate(sq);
		      stm.executeUpdate(sp);
                     stmt.close();
                     stm.close();
		      c.close();
		      stm.close();
		      stmt.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }
		    System.out.println("Table created successfully");
		  }
	
		public void speicherePerson(Person p) throws SQLException {
			
			String sql = "INSERT INTO REGISTRATION(passwort,nickname) VALUES('"
					+ p.getPasswort() ;

			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			
		}
	    public void speichereNav(Person p) throws SQLException
	    {
	    	
	    	String sql = "INSERT INTO PERSONENDATEN(BREITENGRAD,LAENGENGRAD,) VALUES(?,?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			String sl = "SELECT * FROM Partys";
		    Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sl);
			
			while(rs.next())
			{
			if(p.getIdbenutzer()==rs.getInt("IDBENUTZER"))
			{
			st.setString(1,p.getBenutzerID());
			st.setString(2,p.getNachname());
			}
			}
			rs.close();
			stmt.close();
			st.close();
	    }
		 
	    public ArrayList<Person> holenav () throws SQLException
	    {
		    String sql = "SELECT * FROM Person";
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);
		
		 ArrayList<Person> s = new ArrayList<Person>();
		
		 while(rs.next())
		 {
		      	Person p = new Person();
		      	p.setIdbenutzer(rs.getInt("IDBENUTZER")); //getString --> von Datenbank
		        p.setLängegrad(rs.getString("LAENGENGRAD"));
		      	p.setBenutzerID(rs.getString("BREITENGRAD"));
		
		      	s.add(p);
		 }
		 	rs.close();
		 	stmt.close();
		 	return s;
		 }
	    
		
		public void speicherePerson2(Person x) throws SQLException
		{
			
			String sql = "INSERT INTO PERSONENDATEN(BENUTZERID,NACHNAME,VORNAME,BREITENGRAD,LAENGENGRAD,PASSWORT,) VALUES(?,?,?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1,x.getBenutzerID());
			st.setString(2,x.getNachname());
			st.setString(2,x.getVorname());
			st.setString(3,x.getBreitengrad());
			st.setString(4,x.getLängegrad());
			st.setString(5,x.getPasswort());
			st.executeUpdate();
			st.close();
			
			
		}
		
		
		public void speicherePersonen1(Person p) throws SQLException 
		{
			
			String sql = "INSERT INTO REGISTRATION(BENUTZERID,NACHNAME,VORNAME,PASSWORT) VALUES(?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getBenutzerID());
			pstmt.setString(2, p.getNachname());
			pstmt.setString(3, p.getVorname());
			pstmt.setString(4,p.getPasswort());
			pstmt.executeUpdate();
			pstmt.close();

		}
		
		public void speicheretext (Person p) throws SQLException 
		{
			String sql = "INSERT INTO Party(PARTYID,TEXTFILE,BENUTZERID) VALUES(?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,p.getParty());
			pstmt.setString(2,p.getText());
			pstmt.setString(2,p.getBenutzerID());
			pstmt.executeUpdate();
			pstmt.close();

		}


		public ArrayList<Person> holePersonarray () throws SQLException
		 {
		    String sql = "SELECT * FROM Partys";
		    Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);
		
		 ArrayList<Person> s = new ArrayList<Person>();
		
		 while(rs.next())
		 {
		      	Person p = new Person();
		      	p.setParty(rs.getString("Party")); //getString --> von Datenbank
		      	p.setText(rs.getString("textfile"));
		      	p.setBenutzerID(rs.getString("BenutzerID"));
		
		      	s.add(p);
		 }
		 	rs.close();
		 	stmt.close();
		 	return s;
		 }
		
		public boolean IDüberprüfen(int id) //Benutzer id überprüfen
		{ 
		
		try {
			String sql = "SELECT IDBENUTZER FROM Partys WHERE IDBENUTZER ="+id;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next())
			{
				return false;
			}
			else
			{
				return true;
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
		} 
		  return false;
		  }
		
		public boolean ueberpruefeParty (Person p) throws SQLException
		{
			try {
				String sql = "SELECT * FROM Party";
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {

					String party = rs.getString("PARTYID");
					String benutzer = rs.getString("BENUTZERID");
					Person q = new Person();
					q.setBenutzerID(benutzer);
					q.setParty(party);
					if (q.getBenutzerID().equals(p.getBenutzerID()) && q.getParty().equals(q.getParty())) 
					{
						return true;
						
					} 
					else 
					
					{
						return false;
					}
					
					

				}
				rs.close();
				stmt.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return false;

		}

		public void holePerson1 () throws SQLException
		 {
		 String sql = "SELECT * FROM FILES";
		 Statement stmt = conn.createStatement();
		 ResultSet rs = stmt.executeQuery(sql);
		
		 for(int i=0;rs.next();i++ )
		 {
	     String name =rs.getString("nickname");
		 String text =rs.getString("textfile");
		
		 }
		 rs.close();
		 stmt.close();
		 
		 }
		
		
		public boolean überprüfedaten(Person p) throws SQLException {
			String sql = "SELECT * FROM Person WHERE nickname ='"
			+ p.getBenutzerID() + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				rs.close();
				stmt.close();
				return true;
			}
			rs.close();
			stmt.close();
			return false;
		}

//		public boolean überprüfen(Person p) throws SQLException {
//			String sql = "SELECT * FROM REGISTRATION WHERE passwort ='"
//			+ p.getPasswort() + "'&& nickname='" + p.getNickname() + "'";
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery(sql);
//
//			if (rs.next()) {
//				rs.close();
//				stmt.close();
//				return true;
//			}
//			rs.close();
//			stmt.close();
//			return false;
//		}	
		

}
