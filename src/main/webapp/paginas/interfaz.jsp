<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Funny Mind</title>
  <link rel="stylesheet" href="../styles/interfaz.css" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="Contenedor_Principal">
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
        <section>
            <div class="Contenedor_contenido">
                <div class="position-relative">
                  <h1 class= "text-center mt-3">Bienvenido</h1>
                  <h2 class= "text-center my-3">Categoria de juegos</h2>
                </div>
                <div class="Carrusel">
                <div id="carouselExampleFade" class="carousel slide carousel-fade">
                  <div class="carousel-inner">
                    <div class="carousel-item active">
                      <div class="card" style="width: 10rem;">
                        <img src="../imagenes/Interfaz_juegos/torre_hanoi.PNG" class="card-img-top" alt="imagen torre">
                        <div class="card-body">
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                      </div>
                    </div>
                    <div class="carousel-item">
                      <div class="card" style="width: 10rem;">
                        <img src="../imagenes/Interfaz_juegos/torre_hanoi.PNG" class="card-img-top" alt="imagen torre">
                        <div class="card-body">
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                      </div>
                    </div>
                    <div class="carousel-item">
                      <div class="card" style="width: 10rem;">
                        <img src="../imagenes/Logo.PNG" class="card-img-top" alt="imagen torre">
                        <div class="card-body">
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
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
          </section>
      
  

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>