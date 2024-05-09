package dao;
import java.util.List;

import beans.Utilisateur;

public interface IUtilisateurDao {
	
	public List<Utilisateur> getUsers();
	public void addUtilisateur(Utilisateur user );
	public Utilisateur getUtilisateurById(int userId);
	public Utilisateur updateUtilisateur(Utilisateur user);
	public void deleteUtilisateur(int userId);



}
