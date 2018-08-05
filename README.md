# Cuarto Inteligente Repo
Este es un ejemplo del uso del Developer Kit de Android Things

Este ejemplo es para apagar y prender un foco mediante el uso de un Relay y Firebase.

Se uso Firebase para guardar el estado del foco
Se uso el Relay para que funcione como un interruptor de la electicidad.

![](prueba_app.gif)

# Branch

* El branch master solo tiene una aplicacion base para el celular usando la arquitectura MVP.
* El branch things es la misma aplicacion movil, ya que el kit viene con una pantalla y se puede mostrar la aplicacion en esta pantalla, pero ademas tiene la logica para que relay prenda y apague el relay.

## Kotlin
---
 * Kotlin [1.2.50] - http://kotlinlang.org
 
 ## Libraries
---
 * Dagger2 [2.11] - http://google.github.io/dagger
 * RxFirebase [11.0.4.0] - https://github.com/kunny/RxFirebase
 * RxJava2 [2.1.0] - https://github.com/ReactiveX/RxJava
 * AndroidThings [1.0] - https://developer.android.com/things/versions/releases (Solo en el branch Things)
