package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
@Override
public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
    PrintWriter out = resp.getWriter();
resp.setContentType("text/html");
String n = req.getParameter("name");
String p = req.getParameter("password");

if(p.equals("servlet")){
RequestDispatcher rd = req.getRequestDispatcher("servlet2");
rd.forward(req, resp);
}
else{
    out.println("Sorry! your password is Invalid");
    RequestDispatcher rd = req.getRequestDispatcher("index.html");
    rd.include(req, resp);
}

}
}
