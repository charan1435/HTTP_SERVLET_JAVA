package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServerLet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String protocol = req.getProtocol();
        System.out.println("Testing Post"+ protocol);

    }

    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException{
        String protocol = req.getProtocol();
        System.out.println("Testing GET"+ protocol);
        //This will set the UI of the webpage
        //out.println statement conveys HTML in JAVA
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        out.println("<html>");
        out.println("<head><title>hello world</title></head>");
        out.println("<body>");
        out.println("<big>hello world</big>");
        out.println("</body></html>");
    }

}
