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
    <link rel="stylesheet" href="./css/arrow.css">
    <link href='https://unpkg.com/boxicons@2.1.1/css/boxicons.min.css' rel='stylesheet'>
  </head>

  <body>

    <div class="container">

      <nav class="sidebar">

        <header class="header">
          <div class="image">
            <img src="../imagenes/ususario.png" alt="Usuario" class="img-user">
          </div>
          <h3>Camilo Cifuentes</h3>
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

        <div class="arrow-container">
          <div class="arrow left left-2">
            <a href="personalData.jsp"><i class='bx bx-left-arrow-alt'></i>Volver</a>
          </div>
        </div>

        <h1>Estadisticas</h1>

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
        
        <div class="contenido">
          <div class="logros-container">
            <h2>Logros</h2>
            <div class="logros ">
              <div class="level bg-red">
                <i class='bx bxs-hot'></i>
                <p>Nivel 2</p>
              </div>
              <div class="text">
                <p>Alcanza una racha de 7 dias.</p>
              </div>
            </div>
  
            <div class="logros">
              <div class="level bg-purple">
                <i class='bx bxs-star'></i>
                <p>Nivel 3</p>
              </div>
              <div class="text">
                <p>Amante de las estrellas, llega las 200 estrellas</p>
              </div>
            </div>
          </div>
  
         
          <div class="graph">
            <h2>Exp de semana</h2>
            <canvas id="basicStats"></canvas>
          </div>
        </div>

      </div>

    </div>


    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="./js/stats.js"></script>
  </body>

  </html>