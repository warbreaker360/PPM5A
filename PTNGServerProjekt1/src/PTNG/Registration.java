package PTNG;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import PTNG.DBManager;


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
		try
		{
		DBManager db = new DBManager();
		//String vName = request.getParameter("vname");
		//String nName = request.getParameter("nname");
		//int  gid = Integer.parseInt(request.getParameter("gid"));
		//String tel = request.getParameter("tel");
		Person p;
		int id = 0;
		int diesezahl = 0;
		
		while(db.IDüberprüfen(id)==false)
		{	
		  id++;
		  if(db.IDüberprüfen(id)==true)   //-----> erstellt den idBenutzer Integer
		  {
			  diesezahl= id;
		  }
		 }
		
		  p = new Person(benutzerid,nachname,vorname,
				passwort,diesezahl);
		
	if(!db.überprüfedaten(p))
			
		{
			
			db.speicherePersonen1(p);
		    //response.sendRedirect("login.jsp");
			db.close();
			
		}
			else
			{
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();	
				out.append("Passwort falsch erneut eingeben");
				out.close();
				
				response.sendRedirect("Registrieren.jsp");
				
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		out.append("Passwort falsch erneut eingeben");
		out.close();
		
		
	}
	}


