<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <title>Confirmer Suppression</title>
</head>
<body>
    <h2>Confirmer Suppression</h2>

    <p>Êtes-vous sûr de vouloir supprimer cet utilisateur?</p>
	<a href="deleteuser?id=${utilisateur.id }">Oui, Supprimer</a>
    <a href="list">Annuler</a>

</body>
</html>
