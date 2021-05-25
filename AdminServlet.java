package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet {

    /**
     *
     * @param resp
     * @param req
     * @throws IOException
     * @throws ServletException
     */
    public void doGet(HttpServletResponse resp, HttpServletRequest req) throws IOException, ServletException{
    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    
    out.print("Welcome! ADMIN");
    
    out.close();
    }
}
