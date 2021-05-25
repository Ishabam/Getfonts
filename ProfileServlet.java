package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
      resp.setContentType("text/html");
      PrintWriter out = resp.getWriter();
      
      req.getRequestDispatcher("link.html").include(req, resp);
      
      Cookie ck[]= req.getCookies();
      
      if(ck!=null){
      String name = ck[0].getValue();
      if(!name.equals("")||name!=null){
      out.print("You are successfully loged in");
      out.print("Welcome: "+name);
      }
      }
      else{
      out.print("Please login First!!");
      req.getRequestDispatcher("login.html").include(req, resp);
      }
      out.close();
   } 
}
