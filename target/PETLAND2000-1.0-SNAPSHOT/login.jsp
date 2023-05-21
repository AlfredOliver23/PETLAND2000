<%-- 
    Document   : login
    Created on : 21 may 2023, 09:58:53
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="./css/login.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <link href="https://fonts.googleapis.com/css2?family=Trispace:wght@300&display=swap" rel="stylesheet">
    <title>Login y registro</title>
</head>
<body> 
    
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Petland</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll" aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
            <ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="Controlador?accion=home">Home</a>
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
                    <a class="nav-link">Link</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Action</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
        </div>
    </div>
</nav>

    
   <main>


    <div class="containerT">


        <div class="backbox">

            <div class="backbox-login">
                 <h3>Ya tienes una cuenta?</h3>
                 <p>Inicia sesion para entrar a la pagina</p>
                 <button id="btn-login">Iniciar Sesion</button>
            </div>
            <div class="backbox-register cont">
            <h3>Aun no tienes una cuenta?</h3>
            <p>Registrate para iniciar sesion</p>
            <button id="btn-register">Registrarme</button>
            
            </div>
        </div>

        <div class="container-login-register">


            <form action="" class="formulario_login">
                <h2>Iniciar Sesion</h2>
                <input type="text" id="login_correo" placeholder="Correo Electronico">
                <input type="password" id="login_contrasena" placeholder="Contrasena">
                <button type="submit">Entrar</button>
            </form>

            
            <form action="" class="formulario_register">
                <h2>Registrarse</h2>
                <input type="text" id="rfc" placeholder="RFC">                
                <input type="text" id="nombre" placeholder="Nombres">
                <input type="text" id="apellidoPaterno" placeholder="Apellido Paterno">
                <input type="text" id="apellidoMaterno" placeholder="Apellido Materno">
                <input type="number" id="telefono" placeholder="Telefono">
                <input type="text" id="correo" placeholder="Correo Electronico">
                <input type="password" id="contrasena" placeholder="Contrasena">
                <br> <br>
                    <button type="submit">Registrarme</button>
</form> 

        </div>
    </div>
</main>

<script src="./js/verilogin.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

</body>
</html>


<!--Necista validacion-->
