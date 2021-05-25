package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
    public void doPost(HttpServletResponse resp, HttpServletRequest req) throws IOException, ServletException{
      resp.setContentType("text/html");
      PrintWriter out = resp.getWriter();
      
      req.getRequestDispatcher("Login.html").include(req, resp);
      
      String n = req.getParameter("name");
      String p = req.getParameter("password");
      
      if(p.equals("isha")){
      out.print("You are successfully loged in!");
      out.print("Welcome: "+n);
      
      Cookie ck = new Cookie("name",n);
      resp.addCookie(ck);
      }
      else{
      out.print("Sorry! Username or Password error.");
      req.getRequestDispatcher("Login.html").include(req, resp);
      }
      out.close();
    }
}
