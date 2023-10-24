package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductController extends HttpServlet {
    //GitHub Push Check
    //GitHub Check again
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String protocol = req.getProtocol();
        //FOR DEBUG PURPOSE
            //Protocol passes the Post or GET method used to for testing in LOG Console of Intellij
        System.out.println("Testing Post"+ protocol);
        System.out.println("First Product Name :"+req.getParameter("ProductName"));
        System.out.println("Product Price :"+req.getParameter("ProductPrice"));

    }

    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException , IOException{
        String protocol = req.getProtocol();
        System.out.println("Testing GET"+ protocol);
        //Now we are forwarding it to jsp this avoids the print statement and easy to handle and effective.
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("view/product.jsp");
        requestDispatcher.forward(req,resp);
     /*
        Changes to Response typing HTML through print statement
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        out.println("<html>");
        out.println("<head><title>hello world</title></head>");
        out.println("<body>");
        out.println("<big>hello world</big>");
        out.println("</body></html>");
     */
    }

}
