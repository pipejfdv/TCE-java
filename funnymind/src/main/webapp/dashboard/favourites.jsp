<%@page contentType="text/html" pageEncoding="UTF-8" %>
  <!DOCTYPE html>
  <html lang="en">

  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Dashboard - Funny Mind</title>
    <link rel="stylesheet" href="./css/interfaz.css" />
    <link rel="stylesheet" href="./css/sidebar.css">
    <link rel="stylesheet" href="./css/carrousel.css">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
  </head>

  <body>

    <div class="container">

      <nav class="sidebar">

        <header class="header">
          <div class="image">
            <img src="../imagenes/ususario.png" alt="Usuario" class="img-user">
          </div>
        </header>

        <div class="menu-bar">
          <div class="menu">
            <ul class="menu-links">

              <li class="nav-link">
                <a href="./personalData.jsp">
                  <i class='bx bx-bar-chart-alt-2 icon'></i>
                  <span class="text nav-text">Datos personales</span>
                </a>
              </li>

              <li class="nav-link">
                <a href="./favourites.jsp">
                  <i class='bx bx-heart icon'></i>
                  <span class="text nav-text">Favoritos</span>
                </a>
              </li>

              <li class="nav-link">
                <a href="./recomended.jsp">
                  <i class='bx bx-home-alt icon'></i>
                  <span class="text nav-text">Recomendados</span>
                </a>
              </li>

              <li class="nav-link">
                <a href="./categories.jsp">
                  <i class='bx bx-bell icon'></i>
                  <span class="text nav-text">Categorias</span>
                </a>
              </li>
              
              <li class="nav-link">
                <a href="./stats.jsp">
                  <i class='bx bx-pie-chart-alt icon'></i>
                  <span class="text nav-text">Estadisticas</span>
                </a>
              </li>
            </ul>
          </div>
          <div class="bottom-content">
            <ul class="bottom-links">
              <li class="bottom-nav-link">
                <a href="#">
                  <i class='bx bx-log-out icon'></i>
                  <span class="text nav-text">Logout</span>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <div class="favourites-container">

        <div class="favourites-nav">

          <div class="arrow-container">
            <a href="home.jsp"><i class='bx bx-left-arrow-alt'>Volver</i></a>
          </div>
  
          <h1>Juegos Favoritos</h1>
        </div>

        <div class="carousel-container">

          <div class="carousel">
            <button class="prev" onclick="prevSlide()">&#10094;</button>

            <img src="../imagenes/Interfaz_juegos/torre_hanoi.PNG" alt="Image 1" class="img">
            <img src="../imagenes/img1.PNG" alt="Image 2" class="img">
            <img src="../imagenes/img3.PNG" alt="Image 3" class="img">

            <button class="next" onclick="nextSlide()">&#10095;</button>
          </div>
  
        </div>

        <div class="favourites">

          <h1>Favoritos</h1>
          <img src="../imagenes/Interfaz_juegos/torre_hanoi.PNG" alt="torre_hanoi" class="img">
          <span><i class='bx bxs-heart'></i></span>
          
        </div>

      </div>



    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
      crossorigin="anonymous"></script>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    <script src="./js/app.js"></script>
  </body>

  </html>