<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!--boostrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <title>Juego</title>

    <link rel="stylesheet" href="../styles/parejas.css" />
  </head>
  <body>
    <header>
      <div>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
          <div class="container-fluid">
              <a class="navbar-brand" href="../Index.html">
                  <img src="../imagenes/Logo.PNG" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
                  Funny Mind
                </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="../index.jsp">Inicio</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">¿Quienes somos?</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Nuestros servicios</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Contactenos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./ingresoRegistro.jsp">Ingresar</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
  </div>
    </header>
    <div class="encabezado">
      <div><span>Juego de Memoria</span></div>
      <div>
        <span>Tiempo restante: <span id="tiempo"></span></span>
      </div>
      <div>
        <button id="iniciar" class="btn-juego">Iniciar</button>
        <button id="detener" disabled class="btn-juego detener">detener</button>
        <button id="reiniciar" disabled class="btn-juego reiniciar">reiniciar</button>
      </div>
    </div>
    <div class="container" id="tablero"></div>
    <div id="perdiste" class="perdiste"><span>Fin del Juego Perdiste</span></div>
    <div id="ganaste" class="ganaste"><span>Felicidades <br> GANASTE!!!</span></div>
    <script src="../js/parejas.js" ></script>
  </body>
</html>