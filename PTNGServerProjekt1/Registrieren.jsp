<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" media="screen" href="Formatierung.css"/>
</head>
<body>

<div class="Hintergrund">
          <h1>Philosophischer Blog:</h1>
          <h5>Das Leid ist kein Reiz ansich sondern nur die Interpretation des Reizes.</h5>

<form action="NicoFodor" method="POST" >
		<h3 class="Nickname">Nickname:</h3> <input type="text" name="nname" />
<%

if(session.getAttribute("Benutzerz")!=null)
{
out.print(session.getAttribute("Benutzerz")); 
session.setAttribute("Benutzerz",null);

}
if(session.getAttribute("Passwort")!=null)
{
out.print(session.getAttribute("Passwort")); 
session.setAttribute("Passwort",null);

}
%>
<br/>
        <h3 class="Nickname">Passwort:</h3> <input type="password" name="pas"/><br/>
		<h3 class="Nickname">Passwort erneut eingeben:</h3><input type="password" name="pass"/><br/>
		<h3 class="Nickname">Geburtsjahr:</h3> <input type="text" name="jahr" />
		<h3 class="Nickname">Vorname:</h3> <input type="text" name="nachname" />
		<h3 class="Nickname">Nachname:</h3> <input type="text" name="vorname" />
		<input type="submit" name="eintragen" value="Registrieren" class="button"/>
		<a href="login.jsp">Login</a><br/><br/>
	    

</form>


<img src="bilder/philo.jpg" width="368" height="383" alt="leid">
<span class="spanx"></span>
<iframe width="600" height="383" src="//www.youtube.com/embed/ATD1PaEuAc8" frameborder="0" allowfullscreen></iframe>
</div>


</body>
</html>