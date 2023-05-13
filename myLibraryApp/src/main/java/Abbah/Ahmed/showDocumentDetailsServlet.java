package Abbah.Ahmed;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@WebServlet("/DocumentDetails")
public class showDocumentDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private SessionFactory sessionFactory;

    public void init() throws ServletException {
    	
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("IdDocument");
     // Retrieve the user from the database
        Session session = sessionFactory.openSession();
        Document document = session.createQuery("FROM Document WHERE idDocument = :id",Document.class)
            .setParameter("id", id)
            .uniqueResult();
        if (document != null) {
            		request.setAttribute("documentspecific", document);
            	    
        }    
        RequestDispatcher dispatcher = request.getRequestDispatcher("DocumentDetails.jsp");
	    dispatcher.forward(request, response);

    }

    public void destroy() {
        sessionFactory.close();
    }
}
