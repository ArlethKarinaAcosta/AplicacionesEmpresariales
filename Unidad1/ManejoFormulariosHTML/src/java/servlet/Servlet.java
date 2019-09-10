/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arlet
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        String[] tecnologias = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        
        String ocupacion = request.getParameter("ocupacion");
        String musica = request.getParameter("musica");
        String tarea = request.getParameter("comentarios");
        
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Formulario de Registro de Datos</h1>");
        out.println("<link href=\"recursos/style.css\" rel=\"stylesheet\" type=\"text/css\">");
        out.println("<table>");
        out.println("<tr>");
        out.println("<td id=\"hola\">Usuario: (*)</td>");
        out.println("<td>"+usuario+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td id=\"hola\">Contrasena: (*)</td>");
        out.println("<td>"+password+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td id=\"hola\">Tecnologias de interes: (*)</td>");
        out.println("<td>"+tecnologias[0]+"</td>");
        out.println("</tr>");
         out.println("<tr>");
        out.println("<td id=\"hola\">Genero: (*)</td>");
        out.println("<td>"+genero+"</td>");
        out.println("</tr>");
         out.println("<tr>");
        out.println("<td id=\"hola\">Ocupacion: (*)</td>");
        out.println("<td>"+ocupacion+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td id=\"hola\">Musica favorita:</td>");
        out.println("<td>"+musica+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td id=\"hola\">Comentarios: (*)</td>");
        out.println("<td>"+tarea+"</td>");
        out.println("</tr>");
        out.println("</body>");

        
        out.println("</html>");
        out.close();
        
        
        //COMPLETAR OCUPACION, MUSICA Y COMENTARIO
        //HACER UNA TABLA DE DOS COLUMNAS PARA MOSTRAR LOS PARAMETROS.
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
