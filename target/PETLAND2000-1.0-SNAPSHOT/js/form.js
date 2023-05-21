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