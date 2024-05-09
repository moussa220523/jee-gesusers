<%-- <%@page import="beans.Utilisateur"%>
<%@page import="java.util.ArrayList"%>
<%@ page  pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/header.jsp" %>
<html>
<head>

 <div id="centered-content">
<h1 id="centered-table">liste des utilisateurs</h1>
</div>
<%
	ArrayList<Utilisateur> utilisateurs = (ArrayList<Utilisateur>) request.getAttribute("utilisateurs");
	if(utilisateurs.isEmpty()){
%>
	<p>Desole la liste des utilisateurs est vide !</p><%
	}
	else {
		%>
  
		<table border="1" cellspacing="0" cellpadding="10"  id="centered-table" >
		<thead>
		<tr>
			<th>Prenom</th>
			<th>Nom</th>
			<th>Login</th>
			<th>Password</th>
			<th colspan="3">Action</th>
		</tr> 
		  </thead>
		  <tbody><%
		for (Utilisateur utilisateur: utilisateurs){
		%>
		<tr>
			<td><%= utilisateur.getPrenom() %></td>
			<td><%= utilisateur.getNom() %></td>
			<td><%= utilisateur.getLogin() %></td>
			<td><%= utilisateur.getPassword() %></td>
			
			 <td class="action-column">
                <button onclick="afficher(
                							'<%= utilisateur.getId() %>',
                							'<%= utilisateur.getNom() %>',
                							'<%= utilisateur.getPrenom() %>')"
                							>Afficher</button>
             </td>
             <td class="action-column">
                <button onclick="modifier(<%= utilisateur.getId() %>)">Modifier</button>
              </td>
              <td class="action-column">
                  <button onclick="supprimer(<%= utilisateur.getId() %>)">Supprimer</button>
             </td>
		</tr>
		<%}%>
		</tbody>
		</table>
		<footer>
        	<p> Les Tuteurs du Net © 2024. Tous droits réservés.</p>
    	</footer>
		<%
	}%>
	<script>
        function afficher(userId,prenom,nom) {
           
            alert("Détails de l'Utilisateur\nId:"+userId+"\nprenom:"+prenom+"\nNom: " + nom );
        }

        function modifier(userId) {
           
            window.location.href = "updateuser?id=" + userId;
        }

        function supprimer(userId) {
        	window.location.href = "confirmdeleteuser?id=" + userId;
        }
    </script>
	</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.Utilisateur" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--  <%@ include file="/WEB-INF/header.jsp" %> --%>
<!-- <html>
<head> -->
	
    <title>Liste des Utilisateurs</title>
</head>

<body>
<jsp:include page="/WEB-INF/header.jsp"/>
    <div id="centered-content">
        <h1>Liste des Utilisateurs</h1>
    </div>
    <c:choose>
        <c:when test="${empty utilisateurs}">
            <p>Desole la liste des utilisateurs est vide !</p>
        </c:when>
        <c:otherwise>
           <table id="centered-table" border="1" cellspacing="0" cellpadding="10" >           
                <thead>
                    <tr>
                    	<th>ID</th>
                        <th>Prenom</th>
                        <th>Nom</th>
                        <th>Login</th>
                        <th>Password</th>
                        <th colspan="2">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="utilisateur" items="${utilisateurs}">
                        <tr>
                        	<td>${utilisateur.id}</td>
                            <td>${utilisateur.prenom}</td>
                            <td>${utilisateur.nom}</td>
                            <td>${utilisateur.login}</td>
                            <td>${utilisateur.password}</td>
                             <td class="action-column">
                                <a href="updateuser?id=${utilisateur.id }">Modifier</a>
                            </td>
                             <td class="action-column">
                                <a href="confirmdeleteuser?id=${utilisateur.id }" >Supprimer</a>                           
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
           <!--  <footer>
                <p>Les Tuteurs du Net © 2024. Tous droits réservés.</p>
            </footer> -->
            <jsp:include page="/WEB-INF/footer.jsp"/>
        </c:otherwise>
    </c:choose>
    
    </body>
</html>
    
    

