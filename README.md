# Cuarto Inteligente Repo <a href="https://codeclimate.com/github/carlosgub/Cuarto-Inteligente-Repo"><img src="https://api.codeclimate.com/v1/badges/a99a88d28ad37a79dbf6/maintainability" /></a>

IF YOU WANT THE ENGLISH README VERSION GO TO THE BRANCH MASTER-ENGLISH/THINGS-ENGLISH

Este es un ejemplo del uso del Developer Kit de Android Things, presentado en Google I/O Extended 18 Lima.

Este ejemplo es para apagar y prender un foco mediante el uso de un Relay y Firebase.

Se usó Firebase para guardar el estado del foco

Se usó el Relay para que funcione como un interruptor de la electicidad.

![](prueba_app.gif)

# Pasos para poder compilar la repo
* Agregar el projecto en su projecto de Firebase.
* Descargue el archivo google-services.json.
* Agregar el archivo al proyecto.
* Compilar.

# Branch

* El branch master solo tiene una aplicación base para el celular usando el patron MVP.
* El branch master-english es el branch master pero con comentarios en inglés.
* El branch things es la misma aplicación móvil, ya que el kit viene con una pantalla y se puede mostrar la aplicación en esta pantalla, pero además tiene la lógica para que el relay se prenda y se apague.
* El branch things-english es el branch things pero con comentarios en inglés.

# Arquitectura del Proyecto
 ![alt text](https://i.imgur.com/BNJRf13.png)
 
# Cableado
 ![alt text](https://i.imgur.com/5R73nSx.png)

## Kotlin
---
 * Kotlin [1.2.51] - http://kotlinlang.org
 
 ## Libraries
---
 * Dagger2 [2.15] - http://google.github.io/dagger
 * RxFirebase [11.0.4.0] - https://github.com/kunny/RxFirebase
 * RxAndroid [2.0.1] - https://github.com/ReactiveX/RxJava
 * RxKotlin [2.0.3] - https://github.com/ReactiveX/RxJava
 * AndroidThings [1.0] - https://developer.android.com/things/versions/releases (Solo en el branch Things)
 
