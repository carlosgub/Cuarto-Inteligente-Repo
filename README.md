# Cuarto Inteligente Repo
Hi, this is an example of Android things using the Developer Kit delivered on Google I/O 18

This example shows how turn on/off a light by using a Relay and Firebase.

Firebase was used for save and get the state of the light.
Relay was used like an interrupter of the light.

![](prueba_app.gif)

# Steps to compile the repository
* Add this project on your Firebase console
* Download the google.servicess.json file
* Add the file into the project.
* Compile.

# Branch

* The master branch only have a base android mobile app who uses the pattern MVP with comments on spanish.
* The master-english is the master branch but with comments on english.
* The things branch is the same android mobile app, because the developer kit have an display and the app can be displayed on this screen, but also have the logic for relay to turn on and off the relay but the comments are on spanish.
* The things-english branch is the things branch but with comments on english.

# Project Architecture
 ![alt text](https://i.imgur.com/BNJRf13.png)
 
# Wiring Design
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
