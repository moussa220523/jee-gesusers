<%-- <%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Modifier un utilisateur</title>
</head>
<body>
    <h2>Modifier un utilisateur</h2>
    <form action="updateuser" method="post">
   
     <% if (request.getAttribute("utilisateur") != null) { %>

             <input type="hidden" name="id" value="${utilisateur.id}">
            

        Nom: <input type="text" name="nom" value="${utilisateur.nom}" required><br>
        Prénom: <input type="text" name="prenom" value="${utilisateur.prenom}" required><br>
        login: <input type="text" name="login" value="${utilisateur.login}" required><br>
        mot de passe: <input type="password" name="password" value="${utilisateur.password}" required><br>

        <input type="submit" value="Enregistrer">
    </form>
    <% } else { %>
        <p>L'utilisateur est introuvable</p>
    <% } %>
</body>
</html> --%>


<%@page import="beans. Utilisateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> -->
<title>Modification d'un utilisateur</title>

</head>
<body>
<jsp:include page="/WEB-INF/header.jsp"/>

<form method="post">
<fieldset>
<legend>Modification d'un utilisateur</legend>
<label for="nom">Nom</label><br>
<input type="text" name="nom" id="nom" value="${utilisateur.nom}"><br>
<label for="prenom">Prénom</label><br>
<input type="text" name="prenom" id="prenom" value="${utilisateur.prenom}"><br>
<label for="Login">Login</label><br> <input type="text" name="Login" id="login"
				value="${ utilisateur.login }"><br>
<label for="password">Password</label><br>
<input type="password" name="password" id="password" value="${ utilisateur.password }"><br><br>
<input type="submit" value="Modifier">
</fieldset> 
</form>
<jsp:include page="/WEB-INF/footer.jsp"/>
<!-- </body>
</html>
	 -->