package mx.edu.cecyt9.ipn.examen.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
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
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        String nombre = request.getParameter("nombre");
        String apPat = request.getParameter("apPat");
        String apMat = request.getParameter("apMat");
        String escuela = request.getParameter("escuela");
        String matFav = request.getParameter("matFav");
        String deporFav = request.getParameter("deporFav");
        
        Connection con = null;
        PreparedStatement pstat = null;
        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbExamen2Parcial","root","n0m3l0");
                String querystring = "INSERT INTO datos VALUES(?,?,?,?,?,?)";
                pstat = con.prepareStatement(querystring);
                pstat.setString(1,nombre);
                pstat.setString(2,apPat);
                pstat.setString(3,apMat);
                pstat.setString(4,escuela);
                pstat.setString(5,matFav);
                pstat.setString(6,deporFav);
                pstat.executeUpdate();
        } 
        catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) 
        {
            System.out.println("Error: " + e);
        }
        
        response.sendRedirect("index.jsp");
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
