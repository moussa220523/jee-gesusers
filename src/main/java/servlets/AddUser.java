package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Utilisateur;
import dao.UtilisateurDao;
import dao.UtilisateurDaoImpl;


@WebServlet("/adduser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String nom,prenom,login,password;
    UtilisateurDaoImpl dao = new UtilisateurDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/ajouterUtilisateur.jsp");
	    dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		prenom=request.getParameter("prenom");
		nom=request.getParameter("nom");
		login = request.getParameter("login");
		password = request.getParameter("password");
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPrenom(prenom);
		utilisateur.setNom(nom);
		utilisateur.setLogin(login);
		utilisateur.setPassword(password);
		dao.addUtilisateur(utilisateur);
		response.sendRedirect("list");
	}

}
