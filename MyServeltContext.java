package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServelt extends HttpServlet{
    public void doGet( HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
        
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        ServletContext con = getServletContext();
        
        Enumeration<String> c = con.getInitParameterNames();
        
        String str="";
        
        while(c.hasMoreElements()){
        str=c.nextElement();
        out.print("<br>Name: "+str);
        out.print("<br> Value: "+con.getInitParameter(str)+"<br>");
        }
        
        out.close();
    }
}
