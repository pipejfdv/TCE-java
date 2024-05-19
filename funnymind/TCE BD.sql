-- Eliminar la base de datos existente si existe y crear una nueva
DROP DATABASE IF EXISTS tce;
CREATE DATABASE tce;
USE tce;

--tabla de generos
CREATE TABLE generos(
    id int not null primary key,
    genero varchar (50) not null
);
-- Tabla de usuarios
CREATE TABLE usuarios (
    id INT NOT NULL AUTO_INCREMENT,
    primer_nombre VARCHAR(50) NOT NULL,
    segundo_nombre VARCHAR(50) NULL,
    primer_apellido VARCHAR(50) NOT NULL,
    segundo_apellido VARCHAR(50) NULL,
    fecha_nacimiento DATE NOT NULL,
    genero_id int NOT NULL,
    correo VARCHAR(100) NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (genero_id) REFERENCES generos(id)
);

-- Tabla de perfil terapeuta
CREATE TABLE perfil_terapeuta (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    primer_nombre VARCHAR(50) NOT NULL,
    segundo_nombre VARCHAR(50) NULL,
    primer_apellido VARCHAR(50) NOT NULL,
    segundo_apellido VARCHAR(50) NULL,
    especialidad_id INT NOT NULL,
    fecha_nacimiento DATE,
    genero_id int NOT NULL,
    correo VARCHAR(100) NOT NULL,
    contrasena VARCHAR(255) NOT NULL,
    fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (genero_id) REFERENCES generos(id)
);

-- Tabla de especialidad del doctor
CREATE TABLE especialidad (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    terapeuta_id INT NOT NULL,
    FOREIGN KEY (terapeuta_id) REFERENCES perfil_terapeuta(id)
);

-- Tabla de juegos
CREATE TABLE juegos (
    id INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT,
    fecha_creacion DATE NOT NULL,
    fecha_modificacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

-- Tabla de categoría de juegos
CREATE TABLE categoria_juegos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    categoria ENUM ('Memoria', 'Atención', 'Lógica'),
    juegos_id INT NOT NULL,
    FOREIGN KEY (juegos_id) REFERENCES juegos(id)
);

-- Tabla de juegos asignados
CREATE TABLE juegos_asignados (
    id INT NOT NULL AUTO_INCREMENT,
    juegos_id INT NOT NULL,
    fecha_asignacion DATE NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (gravedad_id) REFERENCES gravedad(id),
    FOREIGN KEY (juegos_id) REFERENCES juegos(id)
);

-- Tabla de avance
CREATE TABLE avance (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255),
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

-- Tabla de sesiones
CREATE TABLE sesiones (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    perfil_terapeuta_id INT NOT NULL,
    fecha_sesion DATETIME NOT NULL,
    duracion INT NOT NULL,
    avance_id INT,
    FOREIGN KEY (avance_id) REFERENCES avance(id),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (perfil_terapeuta_id) REFERENCES perfil_terapeuta(id)
);

-- Tabla de puntajes de actividades
CREATE TABLE puntajes_actividades (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    usuario_id INT NOT NULL,
    juegos_id INT NOT NULL,
    categoria_id INT NOT NULL,
    fecha_realizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    puntaje INT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (categoria_id) REFERENCES categoria_juegos(id),
    FOREIGN KEY (juegos_id) REFERENCES juegos(id)
);
