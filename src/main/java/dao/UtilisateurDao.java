package dao;

import java.util.ArrayList;

import beans.Utilisateur;

public class UtilisateurDao {
	private static final ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<Utilisateur>();
	
	static {
		listeUtilisateurs.add(new Utilisateur(1,"Diallo","khady","khadija","passer"));
		listeUtilisateurs.add(new Utilisateur(2,"Mbaye","Moussa","moise","repasser"));
		listeUtilisateurs.add(new Utilisateur(3,"diop","Bamba","bambad","passer123"));
		listeUtilisateurs.add(new Utilisateur(4,"Sall","Awa","evas","passer"));
		listeUtilisateurs.add(new Utilisateur(5,"Lo","Aicha","aichal","passer"));
		listeUtilisateurs.add(new Utilisateur(6,"Coulibaly","Doudou","douds","passer"));
		listeUtilisateurs.add(new Utilisateur(7,"Gaye","Lamine","lamineg","repasser"));
	}
	
	public static ArrayList<Utilisateur> lister(){
		return listeUtilisateurs;
	}
	public static void addUser(Utilisateur user ) {
		listeUtilisateurs.add(user);
		
	}
	  public static Utilisateur getUtilisateurById(int userId) {
	        for (Utilisateur utilisateur : listeUtilisateurs) {
	            if (utilisateur.getId() == userId) {
	                return utilisateur;
	            }
	        }
	        return null;
	    }
	
	  public static void updateUtilisateur(int userId, String nom, String prenom,String login, String password) {

		  Utilisateur utilisateur = getUtilisateurById(userId);
		
		  utilisateur.setNom(nom);
		  utilisateur.setPrenom(prenom);
		  utilisateur.setLogin(login);
		  utilisateur.setPassword(password);
    }
	  
	      public static void deleteUtilisateur(int userId) {
	    	  for (Utilisateur utilisateur : listeUtilisateurs) {
		            if (utilisateur.getId() == userId) {
		                listeUtilisateurs.remove(utilisateur);
		                break;
		            }
		        }
	    	  
	      }


}
