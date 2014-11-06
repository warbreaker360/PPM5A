package PTNG;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import PTNG.DBManager;
import BLOG.Person;
import BLOG.Personeninfo;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
    public Registration() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		String passworte=request.getParameter("alter");
		String passwort= request.getParameter("pass");
		String nname=request.getParameter("nname");
		
		String vorname=request.getParameter("vorname");
		String nachname=request.getParameter("nachname");
		String benutzerid=request.getParameter("jahr");
		
		HttpSession session = request.getSession();	

	if(passworte.equals(passwort))
	{
		//String vName = request.getParameter("vname");
		//String nName = request.getParameter("nname");
		//int  gid = Integer.parseInt(request.getParameter("gid"));
		//String tel = request.getParameter("tel");
		
		Personreg p = new Personreg(benutzerid,nachname,vorname,
				passwort);
		
		try
		{
			DBManager db = new DBManager();
			
			if(!db.überprüfedaten(p))
			
		{
			
			db.speicherePerson2(p);
		    response.sendRedirect("login.jsp");
			db.close();
			
		}
			else
			{
			 String j = request.getParameter("nachname");
				session.setAttribute("Benutzerz"," Diesen Benutzer gibt es schon bitte erneut anmelden. ");
				response.sendRedirect("Registrieren.jsp");
				return;
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	else
	{
		
		response.sendRedirect("Registrieren.jsp");
		session.setAttribute("Passwort"," Passwort stimmt nicht überein. ");
	}
	
	
	
	}
	
	

	  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	
	{
		
		
		
		
	}
	}


