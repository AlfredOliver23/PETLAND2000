<%-- 
    Document   : UnPerro
    Created on : 23 may 2023, 13:35:35
    Author     : user
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle del perro</title>
</head>
<body>
    <h1>Detalle del perro</h1>
    <ul>
        <li>Nombre: <%= request.getParameter("per_nom") %></li>
        <li>ID: <%= request.getParameter("per_id") %></li>
        <li>Raza: <%= request.getParameter("raza") %></li>
        <!-- Agrega más detalles del perro aquí -->
    </ul>
    <!-- Agrega un formulario para la adopción del perro aquí -->
    <form action="listaEspera.jsp" method="POST">
        <input type="hidden" name="per_id" value="<%= request.getParameter("usu_id") %>">
        <input type="text" name="nombre" placeholder="Nombre">
        <input type="text" name="foto" placeholder="URL de la foto">
        <input type="text" name="telefono" placeholder="Teléfono">
        <input type="submit" value="Adoptar">
    </form>
</body>
</html>

