<%-- 
    Document   : repertorio
    Created on : 22 may 2023, 20:14:14
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="landing.html">Petland</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Controlador?accion=home">Adopta</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="login.jsp" role="button"  aria-current="page" >
                        Iniciar sesion
                    </a>

                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="informacion.html">Informacion</a>
                </li>
            </ul>
            
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
        </div>
    </div>
</nav>
    <body>
          <h2>Filtros de búsqueda</h2>
  <form>
    <label for="size">Tamaño:</label>
    <select name="size" id="size">
      <option value="small">Pequeño</option>
      <option value="medium">Mediano</option>
      <option value="large">Grande</option>
    </select>
    
    <label for="age">Edad:</label>
    <select name="age" id="age">
      <option value="puppy">Cachorro</option>
      <option value="adult">Adulto</option>
      <option value="senior">Anciano</option>
    </select>
    
    <label for="breed">Sexo:</label>
    <select name="breed" id="breed">
      <option value="mixed">Macho</option>
      <option value="german_shepherd">Hembra</option>
    </select>

    <br>

    <input type="submit" value="Buscar">
  </form>


    <h1>Perfiles de Perros</h1>
    <!--claramente puede ser asi o no el index, ya se vera mi loco-->
<div class="muchos_perros">

    <div class="flechasdice_elloco">
        <c:forEach var="p" items="${perrosLista}">
            <div class="columnas_cuerdas">

                <div class="card">
                    <div class="card-header">
                        <label>${p.catatipo_perro}</label>
                    </div>
                    <div class="card-body">
                        <i>${p.perro_cumplea}</i>
                        <img src="Imagenes/perros/ControladorIMG?id=${p.perro_id}" alt="imagen de perro aki" width="200" height="180">
                    </div>
                    <div class="card-footer">
                        <label>${p.perro_nombre}</label>
                        <div class="botones">
                            
                        <a href="detallePerro.jsp?nombre=<c:out value="${p.per_nom}" />&id=<c:out value="${p.per_id}" />&raza=<c:out value="${p.cra_id}" />"><c:out value="${p.per_nom}" /></a>

                        </div>
                    </div>
                </div>

            </div>
        </c:forEach>

    </div>

</div>
    
    <section>
        <div>
            <h2>Perfil 1</h2>
            <img src="imagen_perro_1.jpg" alt="Imagen de Perro 1">
            <p>Descripción del Perro 1</p>
            <a href="perfil_1.html"><button>Observar</button></a>
        </div>
    </section>
    
    <!--botstrapcito-->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

    
    </body>
</html>
