package newpackage;

import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class servlet1 extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
    try{
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    
    String n= req.getParameter("name");
    out.println("Welcome "+n);
    
    //Cookie ck = new Cookie("Uname",n);       
    //resp.addCookie(ck);
    
    //out.println("<form action='servlet2' method='post'>");
    //out.println("<input type='hidden' name='uname' value='"+n+"'>");
    //out.println("<input type='submit' value='go'>");
    //out.println("</form>");
    
    //out.print("<a href='servlet2?uname="+n+"'>Visit</a>");
    
    HttpSession session = req.getSession();
    session.setAttribute("uname",n);
    out.print("<a href='servlet2'>Visit</a>");
    
    
    out.close();
    
    }catch(Exception e){out.println(e);}
    }
    
}
