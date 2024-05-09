package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Utilisateur;
import dao.UtilisateurDao;
import dao.UtilisateurDaoImpl;

//@WebServlet("/list")
@WebServlet({"/", "/list"})
public class ListUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_LIST_UTILISATEUR = "/WEB-INF/listerUtilisateur.jsp";
	UtilisateurDaoImpl dao = new UtilisateurDaoImpl();
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Utilisateur> utilisateurs = dao.getUsers();
		request.setAttribute("utilisateurs", utilisateurs);
		getServletContext().getRequestDispatcher(VUE_LIST_UTILISATEUR).forward(request, response);
		
	}


}
