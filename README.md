# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación desarrollada en Java para gestionar información de tours turísticos mediante la lectura de datos desde un archivo de texto. Los datos son cargados en una colección ArrayList de objetos Tour, permitiendo recorrer y filtrar la información según distintos criterios.

Este proyecto fue desarrollado para la actividad formativa de la Semana 4 de la asignatura Desarrollo Orientado a Objetos I.

## Estructura del Proyecto

```text
src
├── data
│   └── GestorDatos.java
├── model
│   └── Tour.java
├── resources
│   └── tours.txt
└── ui
    └── Main.java
```

## Funcionalidades

* Lectura de datos desde un archivo de texto.
* Creación de objetos Tour a partir de los datos leídos.
* Almacenamiento de objetos en un ArrayList.
* Recorrido completo de la colección.
* Filtrado de tours según el precio.
* Visualización de resultados por consola.

## Formato del Archivo

El archivo `tours.txt` contiene registros separados por punto y coma (;).

Ejemplo:

```text
Lago Llanquihue;Puerto Varas;15000
Volcan Osorno;Puerto Varas;25000
Saltos del Petrohue;Ensenada;18000
```

## Requisitos

* Java JDK 17 o superior.
* IntelliJ IDEA o cualquier IDE compatible con Java.

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que el archivo `tours.txt` se encuentre en la carpeta `src/resources`.
3. Ejecutar la clase `Main` ubicada en el paquete `ui`.
4. Los resultados se mostrarán en la consola.

## Autor

Christopher Zuñiga
