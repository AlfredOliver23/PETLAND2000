<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="css/index.css">
    <meta charset="utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <title>Formulario para recopilar datos</title>
</head>
<body>

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
                    <a class="nav-link" href="repertorio.jsp">Adopta</a>
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
                <li><a class="dropdown-item" href="#">Responsividad</a></li>
                <li><a class="dropdown-item" href="#">Another action</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Something else here</a></li>
            </ul>
        </div>
    </div>
</nav>

<section class="paralax">
    <h2 id="texto">Adopta</h2>
    <img src="Imagenes/monutain_01.png" id="m1" alt="">
    <img src="./Imagenes/plants.png" id="plants" alt="">
    <img src="./Imagenes/trees_02.png" id="t2" alt="">
    <img src="./Imagenes/monutain_02.png" id="m2" alt="">
    <img src="./Imagenes/trees_01.png" id="t1" alt="">
    <img src="./Imagenes/man.png" id="man" alt="">

</section>
    <section class="descripcion">
    
        <h2>Este es nuestro proceso de adopcion</h2>
    <div class="step">
            <h2>Paso 1: Registro de Datos</h2>
            <p>Para iniciar el proceso de adopción, primero debes registrar tus datos personales en el formulario de
                registro. Proporciona tu nombre, dirección y número de teléfono.</p>
            <a href="#registroForm">Registrar</a>
        </div>

        <div class="step">
            <h2>Paso 2: Perros Disponibles</h2>
            <p>Una vez registrado, podrás ver la lista de perros disponibles para adopción. Explora las opciones y
                elige el perro que más te guste.</p>
            <a href="#perrosDisponibles">Ver Perros Disponibles</a>
        </div>

        <div class="step">
            <h2>Paso 3: Test de Perrunidad</h2>
            <p>Antes de adoptar, puedes realizar un test llamado "test de perrunidad" para evaluar tu compatibilidad con
                el perro seleccionado. Este test te ayudará a tomar una decisión informada.</p>
            <a href="#testPerrunidad">Realizar Test de Perrunidad</a>
        </div>

        <div class="step">
            <h2>Paso 4: Adopción Provisional</h2>
            <p>Una vez hayas visualizado al perro de tu elección y estés listo para adoptarlo, podrás proceder con la
                adopción provisional. Esta adopción no es definitiva, y serás puesto en una lista de espera.</p>
            <a href="#adopcionProvisional">Adoptar</a>
        </div>

        <div class="step">
            <h2>Paso 5: Seguimiento y Confirmación</h2>
            <p>El refugio se pondrá en contacto contigo para verificar que cumples con los requisitos de adopción. Si
                cumples con los requisitos, se te asignará oficialmente al perro.</p>
        </div>

        <div class="step">
            <h2>Paso 6: Actualización del Estado del Perro</h2>
            <p>Después de un tiempo, se te pedirá que subas fotos del perro adoptado para que el refugio pueda verificar
                su estado y bienestar.</p>
        </div>
    
    </section>



<footer>
    <h2>Contacto</h2>
    <br>
    <p>Si tienes alguna pregunta o duda sobre el proceso de adopción, no dudes en contactarnos. Estamos aquí para ayudarte a encontrar el compañero perfecto para ti y tu familia.</p>
    <br>
    <br>
    <a href="contacto.html" class="button">Contáctanos</a>
    <br>
    <br>
    <br>
    <p class="copy">&copy; 2023 Petland. Todos los derechos reservados</p>
</footer>

<section class="scripts">
    <!--Scripst invisibles-->
    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    <script src="./js/menu.js"></script>
    <script src="./js/ScrollTrigger.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.11.5/gsap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.11.5/ScrollTrigger.min.js"></script>
    <script>
        gsap.from("#m1",{
            scrollTrigger : {
                scrub: true
            },
            y:100,
        })
        gsap.from("#m2",{
            scrollTrigger : {
                scrub: true
            },
            y:50,
        })
        gsap.from("#t2",{
            scrollTrigger : {
                scrub: true
            },
            x:-50,
        })
        gsap.from("#t1",{
            scrollTrigger : {
                scrub: true
            },
            x:50,
        })
        gsap.from("#man",{
            scrollTrigger : {
                scrub: true
            },
            x:-250,
        })
        gsap.from("#plants",{
            scrollTrigger : {
                scrub: true
            },
            x:-50,
        })
        gsap.from("#texto",{
            scrollTrigger : {
                scrub: true
            },
            x:500,
        })
        

    </script>
    </script>
    
    
</section>


<!--botstrapcito-->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

</body>
</html>