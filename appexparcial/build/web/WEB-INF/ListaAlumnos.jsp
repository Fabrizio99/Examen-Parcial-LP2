<%-- 
    Document   : ListaAlumnos
    Created on : 10/10/2019, 08:55:38 AM
    Author     : Alumno
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.bean.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Lista de Alumnos</h1>
        <%
            ArrayList<Alumno> lista = (ArrayList<Alumno>) request.getAttribute("lista");
        %>
        <table class="table">
            <thead>
              <tr>
                <th scope="col">Código</th>
                <th scope="col">Nombres</th>
                <th scope="col">Foto</th>
              </tr>
            </thead>
            <tbody>
                <%for(Alumno al:lista){%>
                    <tr>
                      <th scope="row"><%=al.getCod_al()%></th>
                      <td><%=al.getNom_alum()%></td>
                      <td>
                          <img src="img/<%=al.getFoto()%>" alt="<%=al.getFoto()%>"width="42"></td>
                    </tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>
