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
        interpreter = new Interpreter(context);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("input");
        String result = interpreter.interpret(input);
        response.setContentType("text/plain");
        response.getWriter().write(result);
    }
}
