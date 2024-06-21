package dao;

import java.util.List;

import beans.Utilisateur;

public class TestDao {

	public static void main(String[] args) {
		UtilisateurDaoImpl dao = new UtilisateurDaoImpl();
		Utilisateur user1 = new Utilisateur("diop","Lamine","lamine","passer");
		dao.addUtilisateur(user1);
		dao.updateUtilisateur(user1);
//		dao.deleteUtilisateur(4);
		System.out.println(user1.toString());
		/*
		 * System.out.println("Chercher des Utilisateurs"); List<Utilisateur> users =
		 * dao.getUsers(); for (Utilisateur user : users) {
		 * System.out.println(user.toString()); }
		 */

	}

}
