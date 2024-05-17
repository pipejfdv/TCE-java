CREATE DATABASE tce;
USE tce;
-- tabla de perfil usuario
CREATE TABLE usuarios (
 id INT NOT NULL AUTO_INCREMENT,
 primer_nombre VARCHAR(50) NOT NULL,
 segundo_nombre VARCHAR(50) NULL,
 primer_apellido VARCHAR(50) NOT NULL,
 segundo_apellido VARCHAR(50) NOT,
 fecha_nacimiento DATE NOT NULL,
 genero ENUM('Masculino', 'Femenino') NOT NULL,
 correo VARCHAR(100) NOT NULL,
 contrasena VARCHAR(255) NOT NULL,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id)
);
-- tabla de perfil terapeuta
CREATE TABLE perfil_terapeuta (
 id INT NOT NULL AUTO_INCREMENT,
 primer_nombre VARCHAR(50) NOT NULL,
 segundo_nombre VARCHAR(50) NULL,
 primer_apellido VARCHAR(50) NOT NULL,
 segundo_apellido VARCHAR(50) NOT,
 espcialidad_id int null,
 fecha_nacimiento DATE NOT NULL,
 genero ENUM('Masculino', 'Femenino') NOT NULL,
 correo VARCHAR(100) NOT NULL,
 contrasena VARCHAR(255) NOT NULL,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id)
);

-- identificar el tipo de gravedad
CREATE TABLE gravedad (
 id INT NOT NULL AUTO_INCREMENT,
 usuario_id INT NOT NULL,
 fecha_diagnostico DATE NOT NULL,
 tipo_trauma ENUM('Traumatismo craneoencefálico leve', 'Traumatismo craneoencefálico moderado', 'Traumatismo craneoencefálico grave') NOT NULL,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id),
 FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

CREATE TABLE ejercicios (
 id INT NOT NULL AUTO_INCREMENT,
 nombre VARCHAR(50) NOT NULL,
 descripcion TEXT,
 fecha_creacion DATE NOT NULL,
 fecha_modificacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id)
);

CREATE TABLE ejercicios_asignados (
 id INT NOT NULL AUTO_INCREMENT,
 gravedad_id INT NOT NULL,
 ejercicio_id INT NOT NULL,
 fecha_asignacion DATE NOT NULL,
 PRIMARY KEY (id),
 FOREIGN KEY (gravedad_id) REFERENCES gravedad(id),
 FOREIGN KEY (ejercicio_id) REFERENCES ejercicios(id)
);

CREATE TABLE especialidad (
 PRIMARY KEY (id),
 id INT NOT NULL,
 nombre VARCHAR(50),
 terapeuta_id int NOT NULL,
 FOREIGN KEY (terapeuta_id) REFERENCES perfil_terapeuta (terapeuta_id)
);
********************************************************PENDIENTE DE AQUI EN ADELANTE
CREATE TABLE sesiones (
 id INT NOT NULL AUTO_INCREMENT,
 paciente_id INT NOT NULL,
 terapeuta_id INT NOT NULL,
 fecha_sesion DATETIME NOT NULL,
 duracion INT NOT NULL,
 observaciones TEXT,
 PRIMARY KEY (id),
 FOREIGN KEY (paciente_id) REFERENCES pacientes(id),
 FOREIGN KEY (terapeuta_id) REFERENCES terapeutas(id)
);
******************************************************************************************

CREATE DATABASE tce;
USE tce;

-- tabla de usuarios
CREATE TABLE usuarios (
 id INT NOT NULL AUTO_INCREMENT,
 nombre VARCHAR(50) NOT NULL,
 apellido VARCHAR(50) NOT NULL,
 fecha_nacimiento DATE NOT NULL,
 genero ENUM('Masculino', 'Femenino') NOT NULL,
 correo VARCHAR(100) NOT NULL,
 contrasena VARCHAR(255) NOT NULL,
 rol ENUM('Administrador', 'Terapeuta', 'Paciente') NOT NULL,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 afiliado_eps TINYINT NOT NULL DEFAULT 0,
 PRIMARY KEY (id)
);

-- tabla de pacientes
CREATE TABLE pacientes (
 id INT NOT NULL AUTO_INCREMENT,
 usuario_id INT NOT NULL,
 fecha_diagnostico DATE NOT NULL,
 tipo_trauma ENUM('Traumatismo craneoencefálico leve', 'Traumatismo craneoencefálico moderado', 'Traumatismo craneoencefálico grave') NOT NULL,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id),
 FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

--  tabla de afiliaciones_eps
CREATE TABLE afiliaciones_eps (
 id INT NOT NULL AUTO_INCREMENT,
 paciente_id INT NOT NULL,
 eps_afiliada VARCHAR(100) NOT NULL,
 fecha_afiliacion DATE NOT NULL,
 activo TINYINT NOT NULL DEFAULT 0,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id),
 FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);

--  tabla de ejercicios
CREATE TABLE ejercicios (
 id INT NOT NULL AUTO_INCREMENT,
 nombre VARCHAR(50) NOT NULL,
 descripcion TEXT,
 fecha_creacion DATE NOT NULL,
 fecha_modificacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id)
);

--  tabla de ejercicios_asignados
CREATE TABLE ejercicios_asignados (
 id INT NOT NULL AUTO_INCREMENT,
 paciente_id INT NOT NULL,
 ejercicio_id INT NOT NULL,
 fecha_asignacion DATE NOT NULL,
 PRIMARY KEY (id),
 FOREIGN KEY (paciente_id) REFERENCES pacientes(id),
 FOREIGN KEY (ejercicio_id) REFERENCES ejercicios(id)
);

--  tabla de terapeutas
CREATE TABLE terapeutas (
 id INT NOT NULL AUTO_INCREMENT,
 usuario_id INT NOT NULL,
 especialidad VARCHAR(50) NOT NULL,
 fecha_registro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
 PRIMARY KEY (id),
 FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

-- tabla de especialidad
CREATE TABLE especialidad (
 id INT NOT NULL,
 nombre VARCHAR(50),
 PRIMARY KEY (id)
);

-- tabla de sesiones
CREATE TABLE sesiones (
 id INT NOT NULL AUTO_INCREMENT,
 paciente_id INT NOT NULL,
 terapeuta_id INT NOT NULL,
 fecha_sesion DATETIME NOT NULL,
 duracion INT NOT NULL,
 observaciones TEXT,
 PRIMARY KEY (id),
 FOREIGN KEY (paciente_id) REFERENCES pacientes(id),
 FOREIGN KEY (terapeuta_id) REFERENCES terapeutas(id)
);

-- tabla de puntajes_actividades
CREATE TABLE puntajes_actividades (
    id INT NOT NULL AUTO_INCREMENT,
    paciente_id INT NOT NULL,
    actividad_id INT NOT NULL,
    fecha_realizacion DATE NOT NULL,
    puntaje INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (paciente_id) REFERENCES pacientes(id),
    FOREIGN KEY (actividad_id) REFERENCES ejercicios(id)
);

