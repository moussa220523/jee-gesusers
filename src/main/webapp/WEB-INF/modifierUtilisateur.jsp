<%@page import="beans. Utilisateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/header.jsp"/>

<div class="update-form-container">
<form action="updateuser" method="post" id="centered-table">
<fieldset>
<legend>Modification d'un utilisateur</legend>
<div class="champ">
<input type="hidden" name="id" value="${utilisateur.id}"><br>
</div>
<div class="champ">
<label for="nom">Nom</label>
<input type="text" name="nom" id="nom" value="${utilisateur.nom}"><br>
</div>
<div class="champ">
<label for="prenom">Prénom</label><br>
<input type="text" name="prenom" id="prenom" value="${utilisateur.prenom}"><br>
</div>
<div class="champ">
<label for="Login">Login</label>
<input type="text" name="login" id="login" value="${ utilisateur.login}"><br>
</div>
<div class="champ">
<label for="password">Password</label>
<input type="password" name="password" id="password" value="${ utilisateur.password }"><br>
</div>
<div class="champ">
	<button type="submit">Modifier</button>
</div>
</fieldset> 
</form>
</div>
<jsp:include page="/WEB-INF/footer.jsp"/>
</body>
</html>
