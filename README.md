# Proyecto de Prueba Práctica - Spring Boot y Angular

Este proyecto está dividido en dos partes: Backend desarrollado con Spring Boot y Frontend desarrollado con Angular. El propósito es simular una aplicación de consulta de información de un cliente basado en el tipo y número de documento, cumpliendo con las especificaciones dadas.

## Requisitos del Proyecto

### Backend (Spring Boot)

- Crear un servicio REST para consultar información de un cliente.
- La entrada es el tipo de documento (C: cédula, P: pasaporte) y número de documento (obligatorios).
- La respuesta debe contener: Primer nombre, segundo nombre, primer apellido, segundo apellido, teléfono, dirección y ciudad.
- El cliente con número "23445322" será devuelto con datos mockeados.
- Manejo de códigos HTTP:
  - 200: OK
  - 400: Bad Request
  - 404: Not Found
  - 500: Internal Server Error
- Puerto configurado en `8090`.

### Frontend (Angular)

- Pantalla para ingresar tipo y número de documento.
- Validaciones:
  - El número de documento debe tener entre 8 y 11 dígitos.
  - El tipo de documento se selecciona de un desplegable.
- Pantalla de resumen para mostrar la información del cliente.
- Uso de Bootstrap para el diseño responsivo.

## Estructura del Proyecto

### Backend (Spring Boot)

```bash
/src
 └── /main
      ├── /java
      │    └── /com/example/backend
      │          ├── BackendApplication.java
      │          ├── controller
      │          │    └── ClienteController.java
      │          ├── exception
      │          │    └── GlobalExceptionHandler.java
      │          └── model
      │               └── Cliente.java
      └── /resources
           └── application.properties
