package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UtilisateurDao;
import dao.UtilisateurDaoImpl;

/**
 * Servlet implementation class DeleteUser
 */
@WebServlet("/deleteuser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UtilisateurDaoImpl dao = new UtilisateurDaoImpl();
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        String userIdParameter = request.getParameter("id");
        
        if (userIdParameter != null && !userIdParameter.isEmpty()) {
            try {
                int userId = Integer.parseInt(userIdParameter);

                dao.deleteUtilisateur(userId);

                response.sendRedirect("list");
                
            } catch (NumberFormatException e) {
               
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "L'ID doit être un entier valide.");
            }
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "L'ID de l'utilisateur est manquant dans la requête.");
        }
    }


}
