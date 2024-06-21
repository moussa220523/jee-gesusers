<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="beans.Utilisateur" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="/WEB-INF/header.jsp"/>

    <c:choose>
        <c:when test="${empty utilisateurs}">
            <p>Desole la liste des utilisateurs est vide !</p>
        </c:when>
        <c:otherwise>
        <div class="table-container">
           <table class="centered-table" border="1" cellspacing="0" cellpadding="10" >
           <caption>Liste des Utilisateurs </caption>          
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
                                <a class="table-btn" href="updateuser?id=${utilisateur.id }">Modifier</a>
                            </td>
                            <td class="action-column">
                                <a class="table-btn" href="confirmdeleteuser?id=${utilisateur.id }" >Supprimer</a> 
                            </td>                          
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            </div>
           <jsp:include page="/WEB-INF/footer.jsp"/>
        </c:otherwise>
    </c:choose> 
    </body>
</html>    