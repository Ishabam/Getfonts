package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
    public void doPost(HttpServletResponse resp, HttpServletRequest req) throws IOException , ServletException{
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    
    req.getRequestDispatcher("link.html").include(req, resp);
    
    Cookie ck = new Cookie("name","");
    ck.setMaxAge(0);
    resp.addCookie(ck);
    
    out.println("You are successfully loged out!");
    }
}
