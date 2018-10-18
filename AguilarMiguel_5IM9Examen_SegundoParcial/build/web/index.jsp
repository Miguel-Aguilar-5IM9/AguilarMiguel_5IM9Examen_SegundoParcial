<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getParameter("botonRegistro") != null) 
    {
        response.sendRedirect("JSP/Registro.jsp");
%>
<%--<jsp:forward page="JSP/Registro.jsp"></jsp:forward>--%>
<%
        return;
    }
    else
        if(request.getParameter("botonLogin") != null)
        {
        response.sendRedirect("JSP/Login.jsp");
%>            
    <%--<jsp:forward page="JSP/Login.jsp"></jsp:forward>--%>
<%
        }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
                            <form action="index.jsp" method="post">
                                <center>
                                    <h2>Examen</h2>
                                <input type="submit" name="botonRegistro" value="Registrar" > &nbsp; &nbsp; &nbsp;
                                <input type="submit" name="botonLogin" value="Iniciar Sesión" >
                                <!--<a href="JSP/Login.jsp" class="link">Iniciar Sesión</a>
                                <a href="JSP/Registro.jsp" class="link">Registrarse</a>-->
                                </center>
                            </form>
                        </div>
                </div>
        </div>
    </body>
</html>
