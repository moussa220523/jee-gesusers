<%-- <%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> --%>


</head>

<body>
<jsp:include page="/WEB-INF/header.jsp"/>
<div id="centered-content">
	<h1>Ajouter un utilisateur</h1>
</div>
<form action="adduser" method="post" id="centered-table">
 <fieldset>
    <legend>Ajouter un utilisateur</legend>
    <div class="champ">
	<label for="orenom"> prenom</label>
	<input type="text" name="prenom" id="prenom" required/><br>
	</div>
	<div class="champ">
	<label > nom</label>
	<input type="text" name="nom" required/><br>
	</div>
	<div class="champ">
	<label for="login"> login</label>
	<input type="text" name="login" id="login" required/><br>
	</div>
	<div class="champ">
	<label > password</label>
	<input type="password" name="password" required/><br>	
	</div>
	<div class="champ">
	<button type="submit">ajouter</button>
  	</div>
  </fieldset>
</form>
<jsp:include page="/WEB-INF/footer.jsp"/>
<!-- </body>
</html> -->