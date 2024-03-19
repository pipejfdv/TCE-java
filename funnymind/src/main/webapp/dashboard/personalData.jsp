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

    <div class="data-container">

      <div class="arrow-container">
        <div class="arrow left">
          <a href="home.jsp"><i class='bx bx-left-arrow-alt'></i>Volver</a>
        </div>
        <div class="arrow right">
          <a href="personalDataTable.jsp">Siguiente<i class='bx bx-right-arrow-alt'></i></a>
        </div>
      </div>

      <div class="title">
        <h1>Datos personales</h1>
      </div>

      <form action="" class="data-form">
        <div class="data">
          <div class="d-3">
            <label for="name">Nombre</label>
            <input type="text" id="name" name="name" value="Nombre">
          </div>

          <div class="d-3">
            <label for="lastname">Apellido</label>
            <input type="text" id="lastname" name="lastname" value="Apellido">
          </div>

          <div class="d-3">
            <label for="age">Edad</label>
            <input type="text" id="age" name="age" value="Edad">
          </div>
        </div>

        <div class="data">
          <div class="d">
            <label for="genre">Genero</label>
            <input type="text" id="genre" name="genre" value="Genero">
          </div>

          <div class="d">
            <label for="idDocument">Documento de identidad</label>
            <div class="option">
              <select name="documentType" id="documentType" size="documentType">
                <option>C.C</option>
                <option>T.I</option>
              </select>
              <input type="idDocument" id="idDocument" name="idDocument" value="123456789">
            </div>
          </div>
        </div>

        <div class="data">
          <div class="d">
            <label for="phone">Celular</label>
            <input type="text" id="phone" name="phone" value="Celular">
          </div>

          <div class="d">
            <label for="email">Correo</label>
            <input type="text" id="email" name="email" value="correo@correo.com">
          </div>

        </div>

        <div class="data">
          <div class="d">
            <label for="department">Departamento</label>
            <input type="text" id="department" name="department" value="Departamento">
          </div>
          <div class="d">
            <label for="city">Ciudad</label>
            <input type="text" id="city" name="city" value="Ciudad">
          </div>
          
          <button class="btn">Guardar</button>
        </div>

        

      </form>
      
    </div>

  </div>
</body>

</html>