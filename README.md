
# Proyecto SpringBoot3 MongoDB 📁


Este proyecto consta de **tres microservicios** 🚀:

El primero es un **api rest de personas** 🧑🏽 que se conecta contra una base de datos en **Mysql** 🦈.

El segundo es un **api rest de documentos** 📋 que se conecta a una base de datos nosql en **Mongo Db Atlas** 🦖. 

Como tercer servicio, tenemos un **servidor Eureka** 🌐 que registra ambos microservicios para que se comuniquen entre ellos.

El documento de mongo obtendrá una _lista de personas_, las cuales extraerá del servicio de mysql.


## Pasos a ejecutar  🔧

- `Primero`: Iniciar el microservicio **eurekaServer**
- `Segundo`:  Iniciar el microservicio **restPerson**
- `Tercero`:  Iniciar el microservicio  **restApiMongo**
-  `Cuarto`:   Probar los endpoints del  **restperson**
-  `Quinto`:   Probar los endpoints del  **restApiMongo**

  ## Tecnologías Utilizadas ☕

  - `Java 17`
  - `SpringBoot3`
  - `SpringCloud (Eureka Server, OpenFeign)`
  - `Maven`
  - `MongoDbAtblas`
  - `Mysql`
  - `PostMan`

## Puertos ⚓

- RestPerson **8081** 
- RestApiMongo **8080**
- Servidor Eureka **8761**

## Autores 

 ~ **Alberto Gómez Barral**



