# CAR CRUD CON SPRING BOOT :)

Este proyecto es un CRUD (Crear, Leer, Actualizar, Eliminar) de **carros** utilizando **Spring Boot**. El crud permite realizar operaciones básicas como agregar, obtener, actualizar y eliminar registros de carros en una base de datos.

## Características

- Crear un nuevo carro
- Obtener todos los carros
- Obtener un carro por su ID
- Actualizar un carro existente
- Eliminar un carro por su ID

## Tecnologías Usadas

- **Java 17**: Lenguaje de programación utilizado.
- **Spring Boot 3**: Framework principal para el desarrollo del backend.
- **Spring Data JPA**: Para la integración con la base de datos utilizando Hibernate como proveedor de JPA.
- **Hibernate**: ORM (Object-Relational Mapping) para la persistencia de datos.
- **MySQL**: Base de datos relacional utilizada para almacenar los datos de los carros.
- **Gradle**: Herramienta de construcción y gestión de dependencias.
- **Postman**: Herramienta para realizar pruebas de la API.
- **Jakarta Persistence API**: Utilizada para la persistencia de entidades.

## Requisitos Previos

- **Java 17** o superior
- **Gradle**
- **MySQL** (o cualquier base de datos compatible con JDBC)
- **Postman** (para pruebas API)

## Configuración de la Base de Datos

1. Instala y configura una instancia de MySQL localmente.
2. Crea una base de datos llamada `carManagement`:

# Configuración de la base de datos
spring.datasource.url=jdbc:mysql://localhost:3306/carManagement?useSSL=false&serverTimezone=UTC
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña



