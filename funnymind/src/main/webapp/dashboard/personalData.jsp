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
    <link rel="stylesheet" href="./css/data.css">
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

      <div class="data-container">

        <div class="arrow-container">
          <a href="home.jsp"><i class='bx bx-left-arrow-alt'>Volver</i></a>
        </div>

        <h1>Datos personales</h1>

        <form action="" class="data-form">
          <label for="name">Nombre</label>
          <input type="text" id="name" name="name" value="Nombre">

          <label for="lastname">Apellido</label>
          <input type="text" id="lastname" name="lastname" value="Apellido">

          <label for="age">Edad</label>
          <input type="text" id="age" name="age" value="Edad">

          <label for="genre">Genero</label>
          <input type="text" id="genre" name="genre" value="Genero">

          <label for="documentType">Tipo de documento</label>
          <select name="documentType" id="documentType" size="documentType">
            <option>C.C</option>
            <option>T.I</option>
          </select>

          <label for="idDocument">Documento de identidad</label>
          <input type="idDocument" id="idDocument" name="idDocument" value="123456789">

          <label for="phone">Celular</label>
          <input type="text" id="phone" name="phone" value="Celular">

          <label for="email">Correo</label>
          <input type="text" id="email" name="email" value="correo@correo.com">

          <label for="department">Departamento</label>
          <input type="text" id="department" name="department" value="Departamento">

          <label for="planType">Tipo de plan</label>
          <input type="text" id="planType" name="planType" value="Plan">

          <label for="tceSeverity">Gravedad de TCE</label>
          <input type="text" id="tceSeverity" name="tceSeverity" value="Gravedad">

          <label for="tceCode">Codigo TCE</label>
          <input type="text" id="tceCode" name="tceCode" value="Codigo">
        </form>

        <table>
          <tr>
              <th>RESPUESTA MOTORA</th>
              <th>RESPUESTA VERBAL</th>
              <th>RESPUESTA OCULAR</th>
          </tr>
          <tr>
              <td>Obedece órdenes</td>
              <td></td>
              <td></td>
          </tr>
          <tr>
              <td>Localiza el olor</td>
              <td></td>
              <td></td>
          </tr>
          <tr>
              <td>Retirada</td>
              <td></td>
              <td>Espontánea</td>
          </tr>
          <tr>
              <td>Flexión anormal</td>
              <td></td>
              <td>A la orden</td>
          </tr>
          <tr>
              <td>Extensión anormal</td>
              <td></td>
              <td>Al dolor</td>
          </tr>
          <tr>
              <td>Nula</td>
              <td>Nula</td>
              <td>Nula</td>
          </tr>
      </table>

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