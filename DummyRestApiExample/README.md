# **PRUEBA TECNICA DUMMY REST API EXAMPLE LULO** - Reto

## Introducción 📖
Automatización desarrollada para cumplir con el reto de automatizacion en services.


## Pre-requisitos 📋
- Java version 1.8 update 241 o superior y JDK (variables de entorno configuradas)
- IntelliJ IDEA  o Eclipse IDE
- Gradle version 6.0 o superior (variables de entorno configuradas)
- Cucumber


## Instalación 🛠️🔩
- Descomprimir el archivo comprimido:
- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente
- Configurar JRE System Library con JavaSE-1.8
- Configurar la codificación a UTF-8 al proyecto una vez sea importado

## Compilar El Proyecto y Generar Wrapper 🚧⚒️
- Para compilar el proyecto se debe ejecutar el comando:
  ```gradle clean build -x test```
- Si actualizas la url de la distribución de gradle-wrapper, se recomienda ejecutar luego las pruebas en la terminal local con el comando:
  ```gradlew clean test aggregate -i```

## Detalles Generales De La Implementación  💻
Los escenarios de pruebas se crean en el feature con lenguaje Gherkin, se conectan con un método de las clases StepDefinitions con la ayuda de anotaciones @Given, @When y @Then, los métodos de la definición de los pasos se conectan con clases tipo Task para el Given y el When, donde se realizan las acciones de alto nivel y desde las cuales se pueden invocar clases tipo Interactions en las cuales se realizan acciones de bajo nivel, pero para el Then se comunica con clases tipo Questions para hacer las validaciones.


🚧 **_La estructura completa del proyecto se verá así:_**

   ```bash
   📦NameProject(DummyRestApiExample)
   ┣ 📂src
   ┃ ┣ 📂main
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┗ 📦[package](co.com.restapiexample)
   ┃ ┃ ┃   ┣ 📂exceptions (Clases que capturan excepciones personalizadas cuando falla la automatización y no encuentra un campo esperado.
   ┃ ┃ ┃   ┣ 📂interactions (Clases que realizan las acciones de bajo nivel, como lo es escribir texto en campos, hacer clicks, entre otros.) 
   ┃ ┃ ┃   ┣ 📂models (Clases con las que se construyen los modelos de datos) 
   ┃ ┃ ┃   ┣ 📂questions (Clases en las que se realizan las validaciones de los escenarios)
   ┃ ┃ ┃   ┣ 📂tasks (Clases que realizan las acciones de alto nivel, como ingresar datos de un formulario, etc.)
   ┃ ┃ ┃   ┣ 📂userinterfaces(Clases donde se mapean los elementos de la interfaz de usuario, es decir los elementos web.Nota:en este ejercicio no se hace uso de este paquete) 
   ┃ ┃ ┃   ┗ 📂utils (Clases que contienen funcionalidades en común.)
   ┃ ┃ ┗ 📂resources
   ┃ ┃ 
   ┃ ┗ 📂test
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┗ 📦[package](co.com.bancolombia.certificacion.asociacion) 
   ┃ ┃ ┃   ┣ 📂runners (Clases para ejecutar la automatización con los escenarios indicados en el feature.)
   ┃ ┃ ┃   ┗ 📂stepdefinitions (Clases donde se definen los pasos de los escenarios a ejecutar en la automatización.)
   ┃ ┃ ┗ 📂resources
   ┃ ┃   ┣ 📂drivers (Se almacenan los drivers necesarios para que la automatización puede ejecutarse en los navegadores web.)
   ┃ ┃   ┗ 📂features (Se almacenar los archivos con extensión.feature, donde se redactan las historias de usuario.)
   ┣ 📂target
   ┣ 📜.gitignore
   ┣ 📜build.gradle
   ┣ 📜gradlew
   ┣ 📜gradle.bat
   ┣ 📜README.md
   ┣ 📜serenity.properties
   ┗ 📜settings.gradle
```

##Construido con 👨🏻‍💻
La automatización fue desarrollada con:
- Java - Lenguaje de programación.
- BDD - Estrategia de desarrollo
- Screenplay - Patron de diseño
- Gradle - Gestor de dependencias
- Selenium Web Driver - Herramienta para  automatizar acciones en navegadores web
- Cucumber - Framework para automatizar pruebas BDD
- Serenity BDD - Biblioteca de código abierto para la generación de reportes
- Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Autor ✒️👨🏻‍
**©️ Brandon Neyer Quevedo Funez** - *Creación de proyecto.* - [funezneyer@gmail.com](#bquevedo)

