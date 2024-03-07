<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="./styles/estilos.css">
        <!--boostrap-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>Funny Mind</title>
    </head>
 <body>  
              <div>
              <nav class="navbar navbar-expand-lg bg-body-tertiary">
                <div class="container-fluid">
                    <a class="navbar-brand" href="./index.jsp">
                        <img src="./imagenes/Logo.PNG" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
                        Funny Mind
                      </a>
                  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                  </button>
                  <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                      <li class="nav-item">
                          <a class="nav-link active" aria-current="page" href="index.jsp">Inicio</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="#quienes-somos">¿Quienes somos?</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="#que-es-tce">Nuestros servicios</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="#nosotros">Contactenos</a>
                      </li>
                      <li class="nav-item">
                          <a class="nav-link" href="./paginas/ingresoRegistro.jsp">Ingresar</a>
                      </li>
                    </ul>
                  </div>
                </div>
              </nav>

  
        </div>
        <header class="header">
            <!-- imagen principal-->
            <section class="textos-header">
                <h1>Es hora de divertirse</h1>
                <a href="./paginas/memoria.jsp" class="Play">
                    Demo
                </a>
            </section>
            <!--ola de cambio de sección-->
            <div class="ola" style="height: 150px; overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M-6.49,34.86 C155.47,0.33 309.53,147.36 499.72,25.97 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: rgb(255, 255, 255);"></path></svg></div>
        </header>
            
            
         <main>
            <section class="Contenedor Que_es_TCE" id="quienes-somos">
                <h2 class="titulo">¿Quienes somos?</h2>
                <div class="TCE">
                    <img src="imagenes/Marca.jpg" alt="" >
                        <div class="definicion">
                            <p>TCE Funny Mind es un proyecto dedicado a la creación de una plataforma en línea diseñada para niños con Trastornos del Desarrollo como el TEA y el TDAH. Nuestra misión es ofrecer un entorno digital inclusivo y educativo con juegos, actividades y recursos adaptados a las necesidades de estos niños. Promovemos el desarrollo de habilidades sociales, cognitivas y emocionales en un ambiente amigable. Además, brindamos a los padres y cuidadores información valiosa y una comunidad de apoyo.</p>
                        </div>
                </div>
            </section>
            <section class="Contenedor Que_es_TCE" id="que-es-tce">
                <h2 class="titulo">¿Que es el TCE?</h2>
                <div class="TCE">
                    <img src="imagenes/img2.PNG" alt="" class="Wh-TCE">
                        <div class="definicion">
                            <p>El Traumatismo Craneoencefálico (TCE) es una lesión en la cabeza que afecta el cerebro, causada por un golpe, sacudida o impacto. Puede tener una amplia gama de gravedad, desde leves con síntomas temporales hasta graves con consecuencias a largo plazo. El TCE puede afectar la función cognitiva, emocional y física, y su tratamiento y recuperación varían según la severidad de la lesión.</p>
                        </div>
                </div>
            </section>

            <section class="Contenedor sobre_nosotros">
                <h2 class="titulo">Nuestros servicios</h2>
                <div class="Contenedor_sobre_nosotros">
                    <img src="imagenes/img1.PNG" alt="" class="imagen_Sobre_Nos">
                        <div class="nosotros">
                            <h3><span>1</span>Calidad de vida</h3>
                            <p>Buscamos una mejora y poder ayudar a tus hijos para una recuperación más pronta, con una manera divertida y saludable para ellos.</p>
                            <h3><span>2</span>Desarrollo cognitivo</h3>
                            <p>Desarrollamos una manera más practica y atractiva para tus hijos, permitiendo mejoras en varios aspectos neurologicos.<br>Como lo son la consentración, la manera para expresarce y como interacturar con su entorno</p>
                        </div>
                </div>
            </section>

            <section class="Contenedor diagnosticos">
                <h2 class="titulo">Diagnosticos</h2>
                <div class="Contenedor_diagnosticos">
                    <img src="imagenes/img3.PNG" alt="" class="imagen_diagnos">
                    <div class="Text_diagnostico">                      
                        <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Libero totam neque non perspiciatis asperiores molestiae, dolorum officiis sit, molestias quod minima exercitationem laudantium cumque! Sapiente eligendi dolor id expedita officiis?</p>
                    </div>
                </div>
            </section>

            <section id="nosotros">
                <div class="Contenedor Testimonios">
                    <h2 class="titulo">Contactenos</h2>
                    <div class="Testimonios_usuarios">
                    <div class="container text-center">
                        <div class="row">
                          <div class="col">
                              
                            <div class="Testimonio_usuario">
                                <img src="imagenes/nosotros/andres.png" alt="">
                                <div class="Contenido_testimonio">
                                    <h4>Desarrollador<br>Backend</h4>
                                    <p>Andres Felipe Castellanos Vanegas</p>
                                </div>
                            </div>
                                  
                          </div>
                          <div class="col">
                            <div class="Testimonio_usuario">
                            <img src="./imagenes/nosotros/luz.png" alt="">
                            <div class="Contenido_testimonio">
                                <h4>Desarrolladora<br> Backend</h4>
                                <p>Luz Adriana Moreno</p>
                            </div>
                        </div>
                          </div>
                          <div class="col">
                            <div class="Testimonio_usuario">
                            <img src="./imagenes/nosotros/juan.png" alt="">
                            <div class="Contenido_testimonio">
                                <h4>Desarrollador<br>Frontend</h4>
                                <p>Juan Felipe Delgadillo</p>
                            </div>
                        </div>
                          </div>
                        </div>
                      </div>
                      </div>
                    
                    
                        
                        
                        
                    </div>
                </div>
            </section>
        </main>
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
            <h2 class="titulo-final">&copy; ProyectTCE <br>| Juan Felipe Delgadillo <br>| Andres Felipe Castellanos <br>| Luz Adriana Moreno</h2>
        </footer>    

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>


</html>
