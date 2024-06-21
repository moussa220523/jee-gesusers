<jsp:include page="/WEB-INF/header.jsp"/>

<div class="form-container">
<form action="adduser" method="post" class="centered-table">
 <fieldset>
    <legend>Ajouter un utilisateur</legend>
    <div class="champ">
	<label for="orenom"> Prénom</label>
	<input type="text" name="prenom" id="prenom" required/><br>
	</div>
	<div class="champ">
	<label > Nom</label>
	<input type="text" name="nom" required/><br>
	</div>
	<div class="champ">
	<label for="login"> Login</label>
	<input type="text" name="login" id="login" required/><br>
	</div>
	<div class="champ">
	<label > Password</label>
	<input type="password" name="password" required/><br>	
	</div>
	<div class="champ">
	<button type="submit">Ajouter</button>
  	</div>
  </fieldset>
</form>
</div>
<jsp:include page="/WEB-INF/footer.jsp"/>
</body>
</html>