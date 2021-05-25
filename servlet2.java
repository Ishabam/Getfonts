package newpackage;

import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlet2 extends HttpServlet{
   @Override
   public void doGet(HttpServletRequest req, HttpServletResponse resp){
   try{
   resp.setContentType("text/html");
   PrintWriter out = resp.getWriter();
   
   //Cookie ck[] = req.getCookies();
   //out.print("Hello "+ck[0].getValue());
   
   HttpSession session = req.getSession(false);
   
   //String n = req.getParameter("uname");
   String n = (String)session.getAttribute("uname");
   out.println("Hello "+n);
   
   out.close();
   
   }catch(Exception e){out.println(e);}
   } 
}
