# momentous-test-back
## Ejecutar
En la raíz del proyecto ejecutar
> mvn spring-boot:run
Esto compilará y ejecutara el plugin de Spring Boot

Si no, se puede ejecutar
> mvn clean install -Dmaven.test.skip=true

> java -jar target/momentous.test.back-1.0.0.jar

También se puede importar el proyecto con Intellij IDEA o Eclipse y ejecutar la función Main en la clase Application.java

En el caso de Eclipse, de estar instalado Spring Tool Suite, se puede ejecutar como un proyecto de Spring Boot

## Probar servicios
Ir a:
> http://localhost:8080/

Para probar los servicios se puede usar la interfaz de Swagger en:
> http://localhost:8080/swagger/index.html

Swagger auto-documenta los servicios REST y permite probarlos directamente desde la interfaz.

Hay un controller para Currency que permite borrar, crear, ver o modificar las monedas que maneja el restaurant.

Luego hay un controller para Menu que contiene los servicios CRUD además de las busquedas por precio y ranking.

Las imagenes que puede tener un menú son archivos estáticos que están en el directorio "pictures". Por ejemplo:

> http://localhost:8080/pictures/food-picture-01.jpg

## Analisis
Un restaurant tiene una lista de menues.

Menu:
- Nombre
- Descripcion
- Precio
- Moneda
- Fecha desde
- Fecha hasta
- Dias
- Hora y minuto desde
- Hora y minuto hasta
- Ranking
- Imagen

Para no fijar o "hardcodear" las posibles monedas de un menu, creé una entidad Currency.

Servicios:
- Traer todos
- Traer uno
- Crear
- Modificar
- Borrar
- Traer por rango de precios
- Traer por rango de ranking

## Criterios tomados

- En el frontend, la edición de un Menu debería mostrar "Under Construction". En el backend creo los servicios para editarlos de forma que tengan consistencia.
- Las monedas con las que se pueden indicar los precios de un menú se pueden modificar, de esta forma evito tenerlas definidas en el código.
- Considero al ranking una puntuacion con valores decimales
- Para simplificar, en los recursos hay una lista de imagenes estaticas y a un menú se le puede asignar alguna de estas. Para ver la imagen ir a /pictures/filename

## Acerca del código y la arquitectura

- Uso Spring Boot como base para la aplicación. Genera un archivo jar que contiene un Tomcat embebido
- Creo solo un módulo Maven
- Para hacerlo lo más similar posible a un ambiente productivo uso una base en memoria HSQL, Jpa y Spring Data
- El código se divide en las capas de:
  - Presentación (rest)
  - Service
  - Repository
  - Entity
- Uso el ComponentScan de Spring para que genere los beans automáticamente dado que por la poca cantidad de clases no genera problemas
- Spring Boot inicializa la base de datos según el archivo "data-hsqldb.sql" que se encuentra en el directorio de recursos
- Utilizo Swagger, una herramienta que auto-documenta los servicios REST. Se puede ver en localhost:8080/swagger/index.html
- Para validar la entrada de datos se utiliza JSR-303 (Ver annotations en los dto)
- Se utilizan excepciones custom no chequeadas para hacer algunas validaciones necesarias (Por ejemplo: El id de Menu no existe)
- Las entidades se identifican con "surrogate keys" 
- Utilizo un ExceptionHandler de Spring MVC para un json con el mensaje de error en todas las validaciones
