<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="../styles/registro.css">
        <!--boostrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <title>Registro</title>
    </head>

    <body>
        <header>
            <div>
                <nav class="navbar navbar-expand-lg bg-body-tertiary">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="../index.jsp">
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
                              <a class="nav-link" href="ingresoRegistro.jsp">Ingresar</a>
                          </li>
                        </ul>
                      </div>
                    </div>
                  </nav>
          </div>

        </header>
        <main>
            <div class="Contenedor_Registro ">
                <div class="bloque_formulario ">
                    <div class="boton_formulario">
                        <div id="elegir"></div>
                        <button type="button" class="desliz-btn1"  onclick="Login()" id="control1">Ingresar</button>
                        <button type="button" class="desliz-btn2" onclick="Registrarme()" id="control2">Registrarme</button>
                    </div>
                    <div class="conten_Form">
                      <form action="../conexion/login.php" method="post" class="formulario" id="Login">
                          <div class="Logo">
                              <img id="Icono" src="../imagenes/Logo.PNG" width="80" height="80" y="10"/>
                          </div>
                          <input type="text" name="usuario" placeholder="Usuario o Correo" class="Users" required>
                          <input type="password" name="contrasena" placeholder="Contraseña" class="Users" required>
                          <input type="checkbox" class="check">
                          <label class="check_L1">Recordar contraseña</label>
                          <button type="submit" class="validar" name="login">Iniciar Sesión</button>
                      </form>
                      <form action="../conexion/registro.php" method="post" class="formulario" id="Registrarme">
                          <input type="text" name="nombre" placeholder="Nombres" class="Users" required>
                          <input type="text" name="apellido" placeholder="Apellidos" class="Users" required>
                          <input type="date" name="fecha" placeholder="Fecha nacimiento" class="Users" required>
                          <label>Genero</label>
                          <select name="genero">
                              <option value="Masculino">Masculino</option>
                              <option value="Femenino">Femenino</option>
                          </select>
                          <input type="email" name="email" placeholder="Correo" class="Users" required>
                          <input type="password" name="Contrasena" placeholder="Asignar contraseña" class="Users" required>
                          <label>Paciente o Terapeuta</label>
                          <select name="rol">
                              <option value="Paciente">Paciente</option>
                              <option value="Terapeuta">Terapeuta</option>
                          </select>
                          
                          <label class="check_L2">Acepto los terminos y Condiciones.</label>
                          <div class="TyC">
                              <input type="checkbox" class="check">
                          </div>
                          <button type="submit" name="registrarse" class="validar">Registrar</button>
                      </form>
                    </div>
                </div>      
            </div>
        </main>
<!-- Scrip que se puede asignar al archivo JS  -->
<script src="../js/animaciones.js"></script>


<!--pie de la pagina-->        
        <footer>
            <div class="Contenedor-footer">
                <div class="contenido-footer">
                    <h4>Telefono</h4>
                    <p>- 3057900789 <br>- 3223471839 <br>- 3015128281</p>
                </div>
                <div class="contenido-footer">
                    <h4>Correo</h4>
                    <p>usanbuenaventura@academia.usbbog.edu.co</p>
                </div>
            </div>
            <h2 class="titulo-final">&copy; ProyectTCE <br>| Juan Felipe Delgadillo |<br>| Andres Felipe Castellanos |<br>| Luz Adriana Moreno |</h2>
        </footer>    
    </body>


</html>