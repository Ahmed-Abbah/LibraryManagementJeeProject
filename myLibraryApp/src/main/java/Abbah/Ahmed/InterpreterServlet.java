package Abbah.Ahmed;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterpreterServlet
 */
@WebServlet("/interpreter")
public class InterpreterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Stock stock;
    public ClientListe clientListe;
    public Context context;
    public Interpreter interpreter;

    public void init() {
        
        Context context = new Context(new Stock(),new ClientListe());
//        stock.ajouterDocument(new Document(2,"Java Courses"));
//        stock.ajouterDocument(new Document(3,"Jee"));
//        stock.ajouterDocument(new Document(6,"Livre"));
//        stock.ajouterDocument(new Document(9,"Antigone"));
//        clientListe.ajouterClient(1,"Ahmed");
//        clientListe.ajouterClient(2,"Ali");
//        clientListe.ajouterClient(3,"Abbah");
//        clientListe.ajouterClient(4,"Klims");
        interpreter = new Interpreter(context);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("input");
        String result = interpreter.interpret(input);
        response.setContentType("text/plain"); // Set content type to plain text
        response.getWriter().write(result); // Write result to response
    }
}