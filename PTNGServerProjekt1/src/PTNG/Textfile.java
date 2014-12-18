package PTNG;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Textfile
 */
@WebServlet("/Textfile")
public class Textfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Textfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String textfile=request.getParameter("textfile");
		String BenutzerID= request.getParameter("benutzer");
		String Party = request.getParameter("party");
		Person p = new Person();
		
		 p.setBenutzerID(BenutzerID);
		 p.setParty(Party);
		 p.setText(textfile);
		 
		try {
			
			DBManager s = new DBManager();
			if (s.ueberpruefeParty(p)) 
			{
				s.speicheretext(p);
			}
			else
			{
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();	
				out.append("Fehler! Versuchen sie es nochmal");
				out.close();
					// Fehlermeldung da er die Textfile zu einem falschen
			}
		} 
		
		catch (Exception e) {
			
		}
		
	
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBManager derman = null;
		try {
			derman = new DBManager();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			ArrayList<Person> personentexte = derman.holePersonarray();
			
			
	       for(Person p: k)
	          {
	        	  
	        	 p.getParty();
	        	 p.getText();        //--> senden der Arrayliste
	        	 p.getBenutzerID();
	        	  
			
	          }
	          
	          }



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}

}
