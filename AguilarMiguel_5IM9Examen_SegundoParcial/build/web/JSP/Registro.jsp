<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <center>
        <h1>Registro</h1><br>
        <form method="post" name="formRegistro" action="Registro.jsp"><br><br>
            <INPUT type="text" name="nombre" placeholder="Nombre"><br><br>
            <INPUT type="text" name="apPat" placeholder="Apellido Paterno"><br><br>
            <INPUT type="text" name="apMat" placeholder="Apellido Materno"><br><br>
            <INPUT type="text" name="escuela" placeholder="Escuela"><br><br>
            <INPUT type="text" name="matFav" placeholder="Materia Favorita"><br><br>
            <INPUT type="text" name="deporFav" placeholder="Deporte Favorito"><br><br>
            
            <INPUT type="submit" value="Registrarse">
        </form>
        </center>
        
    </body>
<%@page import="java.sql.*,java.io.*" %>
        <%
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
                String querystring = "INSERT INTO Usuario VALUES(?,?,?,?,?,?)";
                pstat = con.prepareStatement(querystring);
                pstat.setString(1,nombre);
                pstat.setString(2,apPat);
                pstat.setString(3,apMat);
                pstat.setString(4,escuela);
                pstat.setString(5,matFav);
                pstat.setString(6,deporFav);
                pstat.executeUpdate();
                out.println("<script>alert('Registro dado de alta exitosamente.')</script>");
                response.sendRedirect("../index.jsp");
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e);
        }
        
        %>
</html>
