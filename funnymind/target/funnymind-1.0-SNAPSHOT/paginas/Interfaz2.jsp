<%-- 
    Document   : Interfaz2
    Created on : 4/03/2024, 9:53:24 p. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../styles/interfaz.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="Contenedor_Principal">
            <div class="container text-center">
                <div class="row h-100">
                  <div class="col-2 bg-black">
                    <div class="sidebar">   
                        <div class="profile">
                          <img src="../imagenes/ususario.png" alt="Usuario">
                            <span></span>
                        </div>
                        <ul>
                          <span>Usuario</span>
                          <li>
                            <a href="#">
                              <ion-icon name="home-outline"></ion-icon>
                              <p>Inicio</p>
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              <ion-icon name="person-outline"></ion-icon>
                              <p>Datos Personales</p>
                            </a>
                          </li>
                          <li class="likes">
                            <a href="#">
                              <ion-icon name="heart-outline"></ion-icon>
                              <p>Favoritos</p>
                            </a>
                          </li>
                        </ul>
                        <ul>
                          <span>Contenido</span>
                          <li class="noti">
                            <a href="#">
                              <ion-icon name="notifications-outline"></ion-icon>
                              <p>Recomendados</p>
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              <ion-icon name="wallet-outline"></ion-icon>
                              <p>Categorías</p>
                            </a>
                          </li>
                          <li>
                            <a href="#">
                              <ion-icon name="stats-chart-outline"></ion-icon>
                              <p>Estadísticas</p>
                            </a>
                          </li>
                        </ul>      
                      </div>
                  </div>
                  <div class="col-10 bg-info">
                      <div class="Titulos">
                        <h1 class= "text-center mt-3">Bienvenido</h1>
                        <h2 class= "text-center my-3">Categoria de juegos</h2>
                      </div>
                      <div class="Carrusel">
                          <div id="carouselExampleFade" class="carousel slide carousel-fade">
                            <div class="carousel-inner">
                              <div class="carousel-item active">
                                <div class="card" style="width: 18rem;">
                                    <img src="..." class="card-img-top" alt="...">
                                    <div class="card-body">
                                      <h5 class="card-title">Card title</h5>
                                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                      <a href="#" class="btn btn-primary">Go somewhere</a>
                                    </div>
                                  </div>
                              </div>
                              <div class="carousel-item">
                                <div class="card" style="width: 18rem;">
                                    <img src="..." class="card-img-top" alt="...">
                                    <div class="card-body">
                                      <h5 class="card-title">Card title</h5>
                                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                      <a href="#" class="btn btn-primary">Go somewhere</a>
                                    </div>
                                  </div>
                              </div>
                              <div class="carousel-item">
                                  <div class="card" style="width: 18rem;">
                                    <img src="..." class="card-img-top" alt="...">
                                    <div class="card-body">
                                      <h5 class="card-title">Card title</h5>
                                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                                      <a href="#" class="btn btn-primary">Go somewhere</a>
                                    </div>
                                  </div>
                              </div>
                            </div>
                            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
                              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                              <span class="visually-hidden">Previous</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
                              <span class="carousel-control-next-icon" aria-hidden="true"></span>
                              <span class="visually-hidden">Next</span>
                            </button>
                          </div>
                      </div>
                  </div>
                </div>
              </div>
        </div>
    </body>
</html>
