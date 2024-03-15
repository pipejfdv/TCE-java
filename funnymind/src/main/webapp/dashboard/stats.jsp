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
    <link rel="stylesheet" href="./css/stats.css">
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

      <div class="stats-container">

        <div class="favourites-nav">

          <div class="arrow-container">
            <a href="home.jsp"><i class='bx bx-left-arrow-alt'>Volver</i></a>
          </div>
  
          <h1>Estadisticas</h1>
        </div>

        <div class="rachas">
          <div class="exp">
            <h3>Dias de racha</h3>
            <!--Logica para volverlo dinamico-->
            <p>6</p>
          </div>
          <div class="exp">
            <h3>Experiencia acumulada</h3>
            <!--Logica para volverlo dinamico-->
            <p>465</p>
          </div>
        </div>

        <!--Logica para volverlo dinamico-->

        <div class="logros">
          <div class="level">
            <i class='bx bxs-hot'></i>
          </div>
          <p>Alcanza una racha de 7 Dias.</p>
        </div>

        <div class="logros">
          <div class="level">
            <i class='bx bxs-star'></i>
          </div>
          <p>Amante de las estrellas, llega las 200 estrellas</p>
        </div>


        <div class="graph-1">
          <canvas id="basicStats"></canvas>
        </div>

        <div>
          <canvas id="expStats"></canvas>
        </div>

      </div>



    </div>

    <script src="./js/app.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="./js/stats.js"></script>
  </body>

  </html>