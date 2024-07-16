# Challenge1
Desafio No.1 Oracle Backend


# Conversor de Moneda

## Descripción

El proyecto "Conversor de Moneda" es una aplicación de consola que permite a los usuarios convertir valores entre diferentes monedas utilizando tasas de cambio actualizadas desde una API externa. Esta aplicación es ideal para usuarios que necesitan realizar conversiones rápidas y precisas entre monedas comunes como el Dólar estadounidense (USD), Peso argentino (ARS), Real brasileño (BRL), y Peso colombiano (COP).

## Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)
- [Contacto](#contacto)

## Características

- Conversión entre varias monedas:
  - USD a ARS y viceversa
  - USD a BRL y viceversa
  - USD a COP y viceversa
- Obtención de tasas de cambio actualizadas desde [Exchangerate-API](https://www.exchangerate-api.com/)
- Interfaz de usuario en consola fácil de usar

## Requisitos

- Java 11 o superior
- IntelliJ IDEA (opcional, pero recomendado para desarrollo)
- Conexión a internet para acceder a la API de tasas de cambio

## Instalación

### Clonar el repositorio
1. Clona el repositorio desde GitHub:

   ```bash
   git clone https://github.com/MadelinElena/Challenge1.git


Navega al directorio del proyecto:

bash
Copiar código
cd Challenge1
Configuración del Proyecto
Abre el proyecto en IntelliJ IDEA.
Asegúrate de tener configurado el SDK de Java 11 o superior.
Dependencias
Este proyecto utiliza la biblioteca Gson para el procesamiento de JSON. Si estás utilizando IntelliJ IDEA, puedes agregar Gson al proyecto siguiendo estos pasos:

Descarga el archivo JAR de Gson desde Maven Repository.
Agrega el archivo JAR descargado a tu proyecto:
Haz clic derecho en tu proyecto en IntelliJ IDEA.
Selecciona Open Module Settings.
Ve a la pestaña Libraries y haz clic en el icono +.
Selecciona Java y navega hasta el archivo JAR descargado.
Uso
Ejecuta la aplicación desde IntelliJ IDEA o utilizando la línea de comandos:

bash
Copiar código
cd path/to/your/project
java -cp path/to/your/classes conversordemoneda.principal.PrincipalConBusqueda
Sigue las instrucciones en la consola para seleccionar la conversión de moneda deseada e ingresa el valor a convertir.

Ejemplo
markdown
Copiar código
****************************************************************************** 
 Sea bienvenido al conversor de moneda:
1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Salir
Elija una opcion valida: 1
Ingrese el valor desea convertir: 100
El valor convertido es: 9229.20 ARS
Tecnologías Utilizadas
Java: Lenguaje de programación principal.
IntelliJ IDEA: Entorno de desarrollo integrado (IDE) recomendado.
Gson: Biblioteca de Java para convertir objetos Java a su representación JSON y viceversa.
Exchangerate-API: API utilizada para obtener tasas de cambio actualizadas.
Contribuciones
Las contribuciones son bienvenidas. Para contribuir:

Realiza un fork del proyecto.
Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
Realiza tus cambios y haz commit (git commit -am 'Agrega nueva característica').
Empuja tu rama (git push origin feature/nueva-caracteristica).
Crea un Pull Request.


Contacto
Si tienes alguna pregunta, sugerencia o quieres ponerte en contacto conmigo, puedes hacerlo a través de:

Email: madelinalzate@gmail.com
GitHub: MadelinElena
