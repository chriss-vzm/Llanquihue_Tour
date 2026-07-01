# Llanquihue Tour

## Descripción

Llanquihue Tour es una aplicación desarrollada en Java que permite gestionar distintos servicios turísticos del sector Lago Llanquihue utilizando los principios de la Programación Orientada a Objetos.

El sistema implementa herencia, polimorfismo, clases abstractas y sobreescritura de métodos (`@Override`), permitiendo representar distintos tipos de servicios turísticos como rutas gastronómicas, paseos lacustres y excursiones culturales.

Este proyecto fue desarrollado para la actividad formativa de la Semana 7 de la asignatura Desarrollo Orientado a Objetos I.

---

## Estructura del Proyecto

```text
src
├── data
│   └── GestorDatos.java
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   └── Guia.java
├── ui
│   └── Main.java
```

---

## Clases Implementadas

### Clase abstracta

- ServicioTuristico
    - nombre
    - duracionHoras
    - método abstracto `mostrarInformacion()`

### Clases hijas

- RutaGastronomica
- PaseoLacustre
- ExcursionCultural

### Gestión de datos

- GestorDatos
    - Crea y administra la colección de servicios turísticos.

### Clase principal

- Main
    - Ejecuta el programa y muestra la información por consola.

---

## Funcionalidades

- Creación de distintos servicios turísticos.
- Uso de herencia entre clases.
- Implementación de una clase abstracta.
- Sobrescritura del método `mostrarInformacion()` mediante `@Override`.
- Polimorfismo utilizando referencias del tipo `ServicioTuristico`.
- Almacenamiento de objetos en un `ArrayList`.
- Recorrido de la colección utilizando un ciclo.
- Visualización de la información de cada servicio por consola.

---

## Conceptos de Programación Orientada a Objetos Aplicados

- Clases y Objetos
- Encapsulamiento
- Herencia
- Polimorfismo
- Clases Abstractas
- Métodos Abstractos
- Sobrescritura de métodos (`@Override`)
- Colecciones (`ArrayList`)

---

## Requisitos

- Java JDK 17 o superior.
- IntelliJ IDEA (o cualquier IDE compatible con Java).

---

## Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main` ubicada en el paquete `ui`.
3. El programa creará los distintos servicios turísticos.
4. La información de cada servicio será mostrada en la consola mediante polimorfismo.

---

## Autor

**Christopher Zuñiga**