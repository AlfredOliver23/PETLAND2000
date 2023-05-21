// Función para prevenir arrastrar, copiar y pegar
["dragstart", "paste", "copy"].forEach(function(evt) {
    ["nombre", "apellidoPaterno", "apellidoMaterno", "telefono", "rfc", "correo", "contrasena"].forEach(function(id) {
        document.getElementById(id).addEventListener(evt, function(e) {
            e.preventDefault();
            return false;
        }, false);
    });
});

function validarFormulario() {
    var rfc = document.getElementById("rfc").value;
    var nombre = document.getElementById("nombre").value;
    var apellidoPaterno = document.getElementById("apellidoPaterno").value;
    var apellidoMaterno = document.getElementById("apellidoMaterno").value;
    var telefono = document.getElementById("telefono").value;
    var correo = document.getElementById("correo").value;
    var contrasena = document.getElementById("contrasena").value;

    // Regular expressions for each field
    var rfcRegEx = /^[A-Z]{4}\d{6}[A-Z0-9]{3}$/;
    var nombreRegEx = /^[a-zA-Z]+(\s[a-zA-Z]+)?$/;
    var apellidoRegEx = /^[a-zA-Z]+(\s[a-zA-Z]+)?$/;
    var telefonoRegEx = /^\d{10}$/;
    var correoRegEx = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/;
    var contrasenaRegEx = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;

    var mensajes = document.querySelectorAll('.mensaje-error');
    mensajes.forEach(function(mensaje) {
        mensaje.remove();
    });

    if (!rfcRegEx.test(rfc)) {
        addMensajeError("rfc", "RFC no válido");
    }
    if (!nombreRegEx.test(nombre)) {
        addMensajeError("nombre", "Nombre no válido");
    }
    if (!apellidoRegEx.test(apellidoPaterno)) {
        addMensajeError("apellidoPaterno", "Apellido Paterno no válido");
    }
    if (!apellidoRegEx.test(apellidoMaterno)) {
        addMensajeError("apellidoMaterno", "Apellido Materno no válido");
    }
    if (!telefonoRegEx.test(telefono)) {
        addMensajeError("telefono", "Teléfono no válido");
    }
    if (!correoRegEx.test(correo)) {
        addMensajeError("correo", "Correo electrónico no válido");
    }
    if (!contrasenaRegEx.test(contrasena)) {
        addMensajeError("contrasena", "La contraseña debe tener al menos 8 caracteres, un número, una letra minúscula, una letra mayúscula y un caracter especial");
    }
}

function addMensajeError(id, mensaje) {
    var input = document.getElementById(id);
    var errorDiv = document.createElement("div");
    errorDiv.classList.add("mensaje-error");
    errorDiv.innerText = mensaje;
    input.parentNode.appendChild(errorDiv);
}

document.querySelector(".formulario_register").addEventListener('submit', function(e) {
    e.preventDefault();
    validarFormulario();
});

function validarInicioSesion() {
    var correo = document.getElementById("login_correo").value;
    var contrasena = document.getElementById("login_contrasena").value;

    // Regular expressions for each field
    var correoRegEx = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/;
    var contrasenaRegEx = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;

    var mensajes = document.querySelectorAll('.mensaje-error');
    mensajes.forEach(function(mensaje) {
        mensaje.remove();
    });

    if (!correoRegEx.test(correo)) {
        addMensajeError("login_correo", "Correo electrónico no válido");
    }
    if (!contrasenaRegEx.test(contrasena)) {
        addMensajeError("login_contrasena", "La contraseña debe tener al menos 8 caracteres, un número, una letra minúscula, una letra mayúscula y un caracter especial");
    }
}

document.querySelector(".formulario_login").addEventListener('submit', function(e) {
    e.preventDefault();
    validarInicioSesion();
});

document.getElementById("btn-login").addEventListener("click", Login);
document.getElementById("btn-register").addEventListener("click", register);
window.addEventListener("resize", AnchoPagina);

var contenedor_login_register =document.querySelector(".container-login-register")
var formulario_login = document.querySelector(".formulario_login")
var formulario_register = document.querySelector(".formulario_register")
var backbox_login = document.querySelector(".backbox-login")
var backbox_register = document.querySelector(".backbox-register")

function AnchoPagina(){
    if(window.innerWidth > 850){
        backbox_login.style.display = "block";
        backbox_register.style.display = "block";
    }else{
            backbox_register.stylle.display = "block";
            backbox_register.style.opacity = "1";
            backbox_login.style.display ="none";
            formulario_login.style.display = "block";
            formulario_register.style.display ="none";
            contenedor_login_register.style.left = "0px";

        }
    }
AnchoPagina();



function Login(){
    if(window.innerWidth > 850){
formulario_register.style.display = "none";
contenedor_login_register.style.left = "10px";
formulario_login.style.display = "block";
backbox_register.style.opacity = "1";
backbox_login.style.opacity = "0";
}else{
        formulario_register.style.display = "none";
        contenedor_login_register.style.left = "0px"; 
        formulario_login.style.display = "block";
        backbox_register.style.display = "block";
        backbox_login.style.display = "none";
    }
}
function register(){
    if(window.innerWidth > 850){
    formulario_register.style.display = "block";
    contenedor_login_register.style.left = "410px";
    formulario_login.style.display = "none";
    backbox_register.style.opacity = "0";
    backbox_login.style.opacity = "1";
    }else{
        formulario_register.style.display = "block";
        contenedor_login_register.style.left = "0px";
        formulario_login.style.display = "none";
        backbox_register.style.display = "none";
        backbox_login.style.display = "block";
        backbox_login.style.opacity = "1";
    }
    }



