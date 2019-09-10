/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet (name="EjemploServlet", urlPatterns={"/EjemploServlet"})



/**
 *
 * @author arlet
 */
public class EjemploServlet extends HttpServlet {
    @Override
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        PrintWriter out = response.getWriter(); 
        
        out.println("<html>");
        out.println("<head>");
        out.print("<title>Servlet Ejercicio 2 </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Respuesta desde un Servlet<h1/>");
        out.print("</body>");
        out.print("</html>");
        out.close();
          
        
        
        
        
    } //Fin del doGet.
    
    
    
}//Fin de la clase
