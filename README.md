## **PRACTICO 2 - PROGRAMACION 4 UTN VM**
API REST desarrollada con **Spring Boot** para la gestiON de pacientes en un consultorio odontológico

## Funcionalidad
- **Registro de Pacientes:** Alta de nuevos pacientes mediante el metodo POST.
- **Listado General:** Consulta de todos los pacientes registrados.
- **Filtro de Menores:** Endpoint específico para listar pacientes menores de 18 años a la fecha actual.

## TecnologIa utilizadas
- **Java 17+**
- **Spring Boot 3.x**
- **Lombok** (para simplificar el código del modelo)
- **SpringDoc / Swagger** (para documentación y pruebas de la API)

## Endpoints Principales
- `POST /pacientes` : Crea un nuevo paciente.
- `GET /pacientes` : Retorna la lista de todos los pacientes.
- `GET /pacientes/menores` : Retorna solo los pacientes menores de 18 años.

## Como se implemento
- **Fechas:** Uso de `java.time.LocalDate`.
- **Logica:** Calculo de edad dinámica mediante la clase `Period.between`.
- **Persistencia:** Almacenamiento en memoria utilizando una colección `ArrayList` en la capa de repositorio.


##  Cmo ejecutar
3. Acceder a la documentación interactiva en:
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---
Alumno por **Maxi Zampa** - UTN
