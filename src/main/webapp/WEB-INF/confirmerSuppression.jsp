
<jsp:include page="/WEB-INF/header.jsp"/>

<div class="delete-confirm-pan">
	<h3>Suppression d'un utilisateur</h3>
    <p class="centered-content">Êtes-vous sûr de vouloir supprimer l'utilisateur <strong>${utilisateur.prenom } ${utilisateur.nom }</strong>?</p>
	<a  class ="confirm-delete-btn" href="deleteuser?id=${utilisateur.id }">Oui, Supprimer</a>
    <a class="cancel-btn" href="list">Annuler</a>
    </div>
<jsp:include page="/WEB-INF/footer.jsp"/>
</body>
</html>
