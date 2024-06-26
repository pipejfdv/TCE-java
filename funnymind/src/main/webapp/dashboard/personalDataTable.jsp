<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Dashboard - Funny Mind</title>
  <link rel="stylesheet" href="./css/sidebar.css">
  <link rel="stylesheet" href="./css/data.css">
  <link rel="stylesheet" href="./css/arrow.css">
  <link rel="stylesheet" href="./css/table.css">
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
        <div class="arrow left left-2">
          <a href="personalData.jsp"><i class='bx bx-left-arrow-alt'></i>Volver</a>
        </div>
      </div>

      <div class="title">
        <h1>Datos personales</h1>
      </div>

      <form action="" class="data-form-2">

        <div class="data">
          <div class="d-3">
            <label for="planType">Tipo de plan</label>
          <input type="text" id="planType" name="planType" value="Plan">
          </div>

          <div class="d-3">
            <label for="tceSeverity">Gravedad TCE</label>
          <input type="text" id="tceSeverity" name="tceSeverity" value="Gravedad">
          </div>

          <div class="d-3">
            <label for="tceCode">Codigo TCE</label>
          <input type="text" id="tceCode" name="tceCode" value="Codigo">
          </div>

        </div>

      </form>


      <div class="table-container">
        <table class="table">
          <thead class="head">
            <tr class="column">
              <th class="head">ID</th>
              <th class="head">RESPUESTA MOTORA</th>
              <th class="head">ID</th>
              <th class="head">RESPUESTA VERBAL</th>
              <th class="head">ID</th>
              <th class="head">RESPUESTA OCULAR</th>
            </tr>
          </thead>
          <tbody class="body">
            <tr class="column">
              <td class="row">6</td>
              <td class="row">Obedece ordenes</td>
              <td class="row"></td>
              <td class="row"></td>
              <td class="row"></td>
              
            </tr>
            <tr class="column">
              <td class="row">5</td>
              <td class="row">Localiza el olor</td>
              <td class="row">5</td>
              <td class="row">Conversacion orientada</td>
              <td class="row"></td>
            </tr>
            <tr class="column">
              <td class="row">4</td>
              <td class="row">Retirada</td>
              <td class="row">4</td>
              <td class="row">Conversacion desorientada</td>
              <td class="row">4</td>
              <td class="row">Espontanea</td>

            </tr>
            <tr class="column">
              <td class="row">3</td>
              <td class="row">Flexion anormal</td>
              <td class="row">3</td>
              <td class="row">Palabras inapropiadas</td>
              <td class="row">3</td>
              <td class="row">A la orden</td>
            </tr>
            <tr class="column">
              <td class="row">2</td>
              <td class="row">Extensión anormal</td>
              <td class="row">2</td>
              <td class="row">Sonidos incomprensibles</td>
              <td class="row">2</td>
              <td class="row">Al dolor</td>
            </tr>
            <tr class="column">
              <td class="row">1</td>
              <td class="row">Nula</td>
              <td class="row">1</td>
              <td class="row">Nula</td>
              <td class="row">1</td>
              <td class="row">Nula</td>
            </tr>
          </tbody>
        </table>
      </div>

    </div>

  </div>
</body>

</html>