
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class httpServletexample extends HttpServlet{

    @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
   {
       System.out.println("this is get method......");
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       out.print("this is get method of  httpservlet.");
   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
   
   
}
