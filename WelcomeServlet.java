package newpackage;

import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    
    String n = req.getParameter("name");
    out.println("Welcome"+n);
    }
}
