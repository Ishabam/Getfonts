package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.logging.Filter;
import javax.servlet.FilterChain;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {}
    
    /**
     *
     * @param req
     * @param resp
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException , ServletException{
        resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    
    String p = req.getParameter("password");
    
    if(p.equals("admin")){
    chain.doFilter(req, resp);
    }
    else{
    out.print("Your Password is incorrect");
    RequestDispatcher rd = req.getRequestDispatcher("index.html");
    rd.include(req, resp);
    }
    }
    
    @Override
    public void destroy() {}

 }
