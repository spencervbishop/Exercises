package com.ex.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing the request");
        super.service(req, resp);

//        PrintWriter out = resp.getWriter();
//        out.write("Hello, from my first Servlet");
//        resp.setStatus(200);
//        resp.setHeader("Content-Type", "text/plain");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Initializing the service");
        super.init();
    }

    @Override
    public void destroy(){
        System.out.println("Servlet being destroyed.");
        super.destroy();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<html><body><h1>Hello, World!</h1></body></html>");
        resp.setStatus(200);
        resp.setHeader("Content-Type", "text/html");

        System.out.println(getServletConfig().getInitParameter("name"));
        resp.getWriter().write(getServletContext().getInitParameter("Application"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Received your POST request");
    }
}
