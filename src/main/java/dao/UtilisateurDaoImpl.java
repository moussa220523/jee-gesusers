package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Utilisateur;

public class UtilisateurDaoImpl implements IUtilisateurDao{

	@Override
    public List<Utilisateur> getUsers() {
        List<Utilisateur> dataList = new ArrayList<>();
        Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps =  connection.prepareStatement("SELECT * FROM users");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
            	String prenom = rs.getString("prenom");
            	String nom = rs.getString("nom");
                String login = rs.getString("login");
                String password = rs.getString("password");
                Utilisateur utilisateur = new Utilisateur(id,nom,prenom,login,password);
                dataList.add(utilisateur);
			}
		} catch (SQLException e) {
            System.out.println("Erreur : Impossible de se connecter à la base de données ou de récupérer les données !");
			e.printStackTrace();
			}
            return dataList;
    }

     @Override
     public void addUtilisateur(Utilisateur utilisateur) {

        Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO users (nom, prenom, login, password) VALUES (?, ?, ?, ?)");
            ps.setString(1, utilisateur.getNom());
            ps.setString(2, utilisateur.getPrenom());
            ps.setString(3, utilisateur.getLogin());
            ps.setString(4, utilisateur.getPassword());

			int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Nouvel utilisateur ajouté avec succès !");
            } else {
                System.out.println("Échec de l'ajout de l'utilisateur !");
            }
			ps.close();
		} catch (SQLException e) {
            System.out.println("Erreur : Impossible de se connecter à la base de données ou de récupérer les données !");
			e.printStackTrace();
			}
    }
    
    @Override
    public Utilisateur getUtilisateurById(int userId) {
        Utilisateur utilisateur = null;
        Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                utilisateur = new Utilisateur();
            	utilisateur.setId(rs.getInt("id"));
            	utilisateur.setPrenom(rs.getString("prenom"));
            	utilisateur.setNom(rs.getString("nom"));
                utilisateur.setLogin(rs.getString("login"));
                utilisateur.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Erreur : Impossible de se connecter à la base de données ou de récupérer les données !");
            e.printStackTrace();
        }
        return utilisateur;
    }
    
    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("UPDATE users SET prenom = ?, nom = ?, login = ?, password = ? WHERE id = ?");

            ps.setString(1, utilisateur.getPrenom());
            ps.setString(2, utilisateur.getNom());
            ps.setString(3, utilisateur.getLogin());
            ps.setString(4, utilisateur.getPassword());
            ps.setInt(5, utilisateur.getId());

            int rowsAffected = ps.executeUpdate();
            ps.close();

            if (rowsAffected > 0) {
                System.out.println("L'utilisateur avec l'ID " + utilisateur.getId() + " a été modifié avec succès !");
            } else {
                System.out.println("Aucun utilisateur trouvé avec l'ID spécifié !");
            }
        } catch (SQLException e) {
            System.out.println("Erreur : Impossible de se connecter à la base de données ou de récupérer les données !");
            e.printStackTrace();
        }

        return utilisateur;
    }
    
    @Override
    public void deleteUtilisateur(int userId) {

    	Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM users WHERE id = ?");

            ps.setInt(1, userId);

            // Exécuter la requête SQL
            int rowsAffected = ps.executeUpdate();

            // Vérifier si la mise à jour a été effectuée avec succès
            if (rowsAffected > 0) {
                System.out.println("L'utilisateur avec l'ID " + userId + " a été supprimé avec succès !");
                // return true;
            } else {
                System.out.println("Aucun utilisateur trouvé avec l'ID spécifié !");
            }
        } catch (SQLException e) {
            System.out.println("Erreur : Impossible de se connecter à la base de données ou de récupérer les données !");
            e.printStackTrace();
        } 
        // return false;
    }
    
   


}
