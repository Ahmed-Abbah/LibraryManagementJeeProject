package Abbah.Ahmed;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private SessionFactory sessionFactory;

    public void init() throws ServletException {
    	
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

     // Retrieve the user from the database
        Session session = sessionFactory.openSession();
        Client client = session.createQuery("FROM Client WHERE email = :username AND mot_de_passe = :password", Client.class)
            .setParameter("username", username)
            .setParameter("password", password)
            .uniqueResult();


        if (client != null) {
            // Create a ClientProxy object for the logged-in user
            ClientInterface clientProxy = new ClientProxy(client);

            // Set the user object as a session attribute for future use
            request.getSession().setAttribute("user", clientProxy);

            if(clientProxy.getIsAdmin()==1) {
                // Redirect to the home page or any other authorized page for admin
            	try {
            		List<Document> documents = session.createQuery("SELECT d FROM Document d", Document.class).list();
            		request.setAttribute("documents", documents);

            	    System.out.println("Number of documents retrieved: " + documents.size());

            	    RequestDispatcher dispatcher = request.getRequestDispatcher("AdminPanel.jsp");
            	    dispatcher.forward(request, response);

            	} catch (Exception e) {
            	    System.out.println("Error occurred: " + e.getMessage());
            	}
                //response.sendRedirect(request.getContextPath() + "/AdminPanel.jsp");
            } else {                
        	    //List<Document> documents = session.createQuery("select d from Document d",Document.class).list();
            	try {
            		List<Document> documents = session.createQuery("SELECT d FROM Document d", Document.class).list();
            		request.setAttribute("documents", documents);

            	    System.out.println("Number of documents retrieved: " + documents.size());

            	    RequestDispatcher dispatcher = request.getRequestDispatcher("Client.jsp");
            	    dispatcher.forward(request, response);

            	} catch (Exception e) {
            	    System.out.println("Error occurred: " + e.getMessage());
            	}


            }
        } else {
            // Display an error message and redirect back to
        	 request.setAttribute("errorMessage", "Email ou Mot de passe Incorrecte.");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        session.close();
    }

    public void destroy() {
        sessionFactory.close();
    }
}
