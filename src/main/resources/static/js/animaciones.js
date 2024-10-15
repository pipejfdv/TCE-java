//Solo animaciones de la pagina
//se parar las animaciónes por -- 

//---------Animaciones pagina de registro--------//
function Login(){
    x.style.left="50px";
    y.style.left="450px";
    z.style.left="0px";
    bloque_formulario.classList.remove("ampliar", "overflow-auto");
}

function Registrarme(){
    x.style.left="-450px";
    y.style.left="50px";
    z.style.left="120px";
    bloque_formulario.classList.add("ampliar", "overflow-auto");
}
var x = document.getElementById('Login');
var y = document.getElementById('Registrarme');
var z = document.getElementById('elegir');
var bloque_formulario = document.querySelector('.bloque_formulario');
var footer = document.querySelector('.bloque_formulario');

